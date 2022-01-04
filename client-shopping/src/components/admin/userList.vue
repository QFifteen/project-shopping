<template>
  <div>
    <Card class="user-card">
      <Form :model="formItem" :label-width="80" class="form-inp">
        <FormItem label="Input">
          <Input v-model="formItem.input" placeholder="Enter something..." style="width:200px;"></Input>
        </FormItem>
        <FormItem label="Input">
          <Input v-model="formItem.input" placeholder="Enter something..." style="width:200px;"></Input>
        </FormItem>
        <FormItem label="Input">
          <Input v-model="formItem.input" placeholder="Enter something..." style="width:200px;"></Input>
        </FormItem>
        <FormItem>
          <Button type="primary" icon="ios-search">搜索</Button>
        </FormItem>
      </Form>
    </Card>
    <!--    表格组件-->
    <tables
        :columns1="columns1"
        :data1="data1"
        :show="show"
        :on-select-all="onSelectAll"
        :remove="remove"
        :onSelectchange="onSelectchange"
        :rem="rem"
        :refresh="refresh"
        :loading="loading"
        :pageshow="pageshow"
        :page="page">
    </tables>

    <Modal
        v-model="modalform"
        title="表格详细信息"
        :loading="loadingform"
        :mask-closable="false"
        :styles="{top: '20px'}"
        width="650px"
        ok-text="确认修改"
        @on-ok="userup">
      <div class="form-div">
        <Form ref="formValidate" :model="formValidate" :label-width="70">
          <FormItem label="ID" prop="name">
            <InputNumber v-model="formValidate.user_id" :disabled="true"></InputNumber>
          </FormItem>
          <FormItem label="用户名" prop="name">
            <Input v-model="formValidate.user_name" placeholder="Enter your name" class="inpwidth"></Input>
          </FormItem>
          <FormItem label="密码" prop="name">
            <Input v-model="formValidate.user_pass" placeholder="Enter your name" class="inpwidth"></Input>
          </FormItem>
          <FormItem label="邮箱" prop="name">
            <Input v-model="formValidate.user_email" placeholder="Enter your name" class="inpwidth"></Input>
          </FormItem>
          <FormItem label="手机号码" prop="name">
            <Input v-model="formValidate.user_telephone" placeholder="Enter your name" class="inpwidth"></Input>
          </FormItem>

          <FormItem label="收货地址" prop="desc">
            <Input style="width: 350px" v-model="formValidate.user_address" type="textarea"
                   :autosize="{minRows: 2,maxRows: 5}" placeholder="Enter something..."></Input>
          </FormItem>
          <FormItem label="个性签名" prop="desc">
            <Input style="width: 350px" v-model="formValidate.user_intro" type="textarea"
                   :autosize="{minRows: 2,maxRows: 5}" placeholder="Enter something..."></Input>
          </FormItem>
        </Form>
        <div style="padding-left:20px;">
          <img v-lazy='formValidate.user_img' alt="" width="100%" maxwidth="100px" maxheight="120px">
          <Form ref="formValidate" :model="formValidate" style="margin-top:15px">
            <FormItem label="等级">
              <InputNumber v-model="formValidate.user_status" readonly></InputNumber>
            </FormItem>
            <FormItem label="性别:">
              <RadioGroup v-model="formValidate.user_gender">
                <Radio label="男士">男士</Radio>
                <Radio label="女士">女士</Radio>
              </RadioGroup>
            </FormItem>
          </Form>
        </div>
      </div>
    </Modal>

    <!--    批量删除-->
    <Modal
        v-model="dellistID"
        title="确认删除"
        @on-ok="Delconfirm">
      <p>您确认要删除ID为<span>{{ dellist }}</span>的数据吗</p>
    </Modal>

    <!--    单个删除-->
    <Modal
        v-model="DelID"
        title="确认删除"
        @on-ok="DelIDFun">
      <p>您确认要删除ID为<span>{{ DelIDdata }}</span>的数据吗</p>
    </Modal>
  </div>
</template>
<style scoped lang="less">
@import "../../assets/css/admin/userList";
</style>

<script>
import tables from '../../components/admin/table/table';
import {usershow, userupdata, userdel, useridlist} from '../../API/api';

export default {
  props: [],
  data() {
    return {
      formItem: {},
      //表格
      columns1: [
        {
          type: 'selection',
          width: 30,
          align: 'center'
        },
        {
          title: 'ID',
          key: 'user_id',
          width: 70,
        },
        {
          title: '用户名',
          key: 'user_name',
          tooltip: true
        },
        {
          title: '头像图片',
          slot: 'user_img',
        },
        {
          title: '性别',
          key: 'user_gender'
        },
        {
          title: '密码',
          key: 'user_pass',

        },
        {
          title: '邮箱',
          key: 'user_email',
          tooltip: true
        },
        {
          title: '个性签名',
          key: 'user_intro',
          tooltip: true
        },
        {
          title: '用户等级',
          key: 'user_status'
        },
        {
          title: '收货地址',
          key: 'user_address',
          tooltip: true
        },
        {
          title: '手机号码',
          key: 'user_telephone',
          tooltip: true
        },
        {
          title: 'Action',
          slot: 'action',
          width: 110,
          align: 'center'
        },
      ],
      data1: [],
      dellist: [],
      formValidate: {},
      loading: false,
      modalform: false,
      loadingform: true,
      imgurl: 'http://172.16.254.1:8081/images/loginimg.png',
      dellistID: false,
      DelID: false,
      delListdata: '',
      page: {},
      DelIDdata: '',
    }
  },
  created() {
    this.userdata();
  },
  methods: {
    //表格:查看与删除
    show(index) {
      this.modalform = true;
      this.formValidate = this.data1[index];
    },
    remove(index) {
      // console.log(this.data1[index].user_id);
      this.DelID = true;
      this.DelIDdata = this.data1[index].user_id;
    },
    //单个确认删除
    DelIDFun() {
      userdel({User_id: this.DelIDdata}).then(res => {
        if (res == true) {
          this.$Message.success({content: "删除成功", background: true});
          this.userdata();
        } else if (res == false) {
          this.$Message.error({content: "删除失败", background: true});
        }
      }).catch(error => {
        this.$Message.error({content: "发生未知错误:" + error, background: true});
      });
    },
    onSelectAll(selection) {
      console.log(selection);
    },
    onSelectchange(selection) {
      // console.log(selection);
      let arr = new Array();
      for (let i = 0; i < selection.length; i++) {
        arr.push(selection[i].user_id);
      }
      console.log(arr);
      this.dellist = arr;
    },
    rem() {
      this.dellistID = true;
      // console.log(qs.stringify({User_id:this.dellist},{arrayFormat:'repeat'}));
    },
    //确认删除
    Delconfirm() {
      useridlist({User_id: this.dellist}).then(res => {
        if (res == true) {
          this.$Message.success({content: "删除成功", background: true});
        } else if (res == false) {
          this.$Message.error({content: "删除失败", background: true});
        }
      }).catch(error => {
        this.$Message.error("发生未知错误" + error);
      })
    },
    userdata() {
      //分页显示
      usershow({pagenum: 1, pagesize: 6}).then(res => {
        this.data1 = res.list;
        this.page.total = res.total;
        this.page.size = res.pageSize;
      })
    },
    //表格加载动画
    refresh() {
      this.loading = true;
      setTimeout(() => {
        this.loading = false;
        this.userdata();
      }, 2000);
    },
    //用户修改
    userup() {
      setTimeout(() => {
        this.loadingform = false;
      }, 2000);
      userupdata({
        User_id: this.formValidate.user_id,
        User_name: this.formValidate.user_name,
        User_pass: this.formValidate.user_pass,
        User_email: this.formValidate.user_email,
        User_address: this.formValidate.user_address,
        user_gender: this.formValidate.user_gender,
        User_telephone: this.formValidate.user_telephone,
        User_status: this.formValidate.user_status,
        user_img: this.formValidate.user_img,
        User_intro: this.formValidate.user_intro,
      }).then(res => {
        if (res.data == true) {
          setTimeout(() => {
            this.$Message.success({content: "修改成功", background: true});
            this.loadingform = true;
          }, 2500);
          this.userdata();
        } else if (res.data == false) {
          setTimeout(() => {
            this.$Message.success("修改失败!");
            this.loadingform = true;
          }, 2500);
        }
      }).catch(error => {
        this.$Message.error("发生未知错误" + error);
        this.loadingform = true;
      })
    },
    //分页
    pageshow(e) {
      usershow({pagenum: e, pagesize: 6}).then(res => {
        this.data1 = res.list;
      })
    }
  },
  components: {
    tables
  }
}
</script>
