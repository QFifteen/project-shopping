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
        <FormItem >
          <Button type="primary"><i class="iconfont-shopping shop-sousuo"  @click="refresh" style="font-size:12px;padding-right:5px;"></i>搜索</Button>
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
        :pageshow = "pageshow"
        :page = "page">
    </tables>

    <Modal
        title="表格详细信息"
        v-model="admin"
        class-name="vertical-center-modal">
      <div style="display: flex">
      <Form ref="formValidate" :model="formValidate" :label-width="80">
        <FormItem label="ID" prop="name">
          <InputNumber v-model="formValidate.administrator_id" :disabled="true"></InputNumber>
        </FormItem>
        <FormItem label="账号" prop="name">
          <Input v-model="formValidate.administrator_name" placeholder="Enter your name" class="inpwidth"></Input>
        </FormItem>
        <FormItem label="密码" prop="name">
          <Input v-model="formValidate.administrator_pass" placeholder="Enter your name" class="inpwidth"></Input>
        </FormItem>
        <FormItem label="等级">
          <InputNumber v-model="formValidate.user_status" readonly></InputNumber>
        </FormItem>
      </Form>
      <img v-lazy='formValidate.administrator_img' alt="" width="30%" height="30%" style="margin-left: 25px;">
      </div>
    </Modal>

  </div>
</template>
<style scoped lang="less">
@import "../../assets/css/admin/administrator";
</style>

<script>
import tables from '../../components/admin/table/table';
import {adminshow} from '../../API/api';
export default{
  props:[],
  data(){
    return{
      formItem:{},
      columns1: [
        {
          type: 'selection',
          width: 60,
          align: 'center'
        },
        {
          title: '管理员ID',
          key: 'administrator_id'
        },
        {
          title: '头像',
          slot: 'administrator_img'
        },
        {
          title: '账号',
          key: 'administrator_name'
        },
        {
          title: '密码',
          key: 'administrator_pass'
        },
        {
          title: '权限等级',
          key: 'administrator_grade',
        },
        {
          title: '操作',
          slot: 'action',
          width: 150,
          align: 'center'
        }
      ],
      data1:[],
      page:{total:100},
      loading:false,
      admin:false,
      formValidate:{}
    }
  },
  created() {
    this.datashow();
  },
  methods:{
    datashow(){
      adminshow({pagenum:1,pagesize:5}).then(res=>{
        console.log(res.list);
        this.data1 = res.list;
        this.page.total = res.total;
        this.page.size = res.pageSize;
      })
    },
    //表格:查看
    show(index) {
      this.formValidate = this.data1[index]
      this.admin = true;
    },
    //删除
    remove(index) {
      console.log(index);
    },
    //全选
    onSelectAll(selection) {
      console.log(selection);
    },
    //当选项变化时
    onSelectchange(selection){
      console.log(selection);
    },
    rem(){
      console.log('xx');
    },
    //刷新动画
    refresh() {
      this.loading = true;
      setTimeout(() => {
        this.loading = false;
      }, 2000);
    },
    //分页
    pageshow(e){
      console.log(e);
      adminshow({pagenum: e, pagesize: 6}).then(res => {
        this.data1 = res.list;
      })
    }
  },
  components: {
    tables
  }
}
</script>
