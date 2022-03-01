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
        <FormItem>
          <Button type="primary"><i class="iconfont-shopping shop-sousuo" style="font-size:12px;padding-right:5px;"></i>搜索
          </Button>
          <Button style="margin-left: 20px"><i class="iconfont-shopping shop-wangdianzhanghaozhongzhimima"
                                               style="font-size:12px;padding-right:5px;"></i>重置
          </Button>
          <Button type="primary" style="margin-left: 40px" @click="ShoppingAdd"><i class="iconfont-shopping shop-jiahao"
                                                                                   style="font-size:12px;padding-right:5px;" @click="ShoppingAdd"></i>添加数据
          </Button>
        </FormItem>
      </Form>
    </Card>

    <!--    添加商品弹窗-->
    <Modal
        v-model="modalform"
        title="表格详细信息"
        :mask-closable="false"
        :styles="{top: '20px'}"
        width="650px"
        ok-text="确认添加"
        @on-ok="Shoppingtext_Add"
        :loading = "loadingform"
    >
      <Form>
        <Row :gutter="32">
          <Col span="14">
            <FormItem label="商品名称:" label-position="top">
              <Input v-model="formAddData.commodity_name" placeholder="please enter url" style="width:250px">
              </Input>
            </FormItem>
          </Col>
          <Col span="10">
            <FormItem label="商品编号:" label-position="top">
              <Input v-model="formAddData.commodity_id" placeholder="please enter user name" style="width:100px" :disabled="true"/>
            </FormItem>
          </Col>
        </Row>
        <FormItem label="商品简介:" label-position="top">
          <Input type="textarea" v-model="formAddData.commodity_text" :rows="4"
                 placeholder="please enter the description"/>
        </FormItem>
      </Form>
      <Form>
        <Row type="flex" justify="space-around">
          <Col span="12">
            <FormItem label="商品成本:" label-position="top">
              <InputNumber
                  :max="10000"
                  v-model="formAddData.commodity_cost"
                  :formatter="value => `$ ${value}`.replace(/\B(?=(\d{3})+(?!\d))/g, ',')"
                  :parser="value => value.replace(/\$\s?|(,*)/g, '')"></InputNumber>
            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="商品价格:" label-position="top">
              <InputNumber
                  :max="10000"
                  v-model="formAddData.commodity_price"
                  :formatter="value => `$ ${value}`.replace(/\B(?=(\d{3})+(?!\d))/g, ',')"
                  :parser="value => value.replace(/\$\s?|(,*)/g, '')"
              >
              </InputNumber>
            </FormItem>
          </Col>
        </Row>

        <Row type="flex" justify="space-around">
          <Col span="12">
            <FormItem label="商品状态:" label-position="top">
              <!--              <Badge color="blue" :text="formData.commodity_state" status="error"/>-->
              <Select v-model="formAddData.commodity_state" style="width:80px">
                <Option value="上架">上架</Option>
                <Option value="下架">下架</Option>
              </Select>

            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="上架时间:" label-position="top">
              <DatePicker type="datetime" placeholder="Select date and time" :disabled="true" :clearable="false"
                          style="width: 200px" v-model="time"></DatePicker>
            </FormItem>
          </Col>
        </Row>
      </Form>

      <Divider plain>商品类别</Divider>
      <Form>
        <Row>
          <Col span="12">
            <FormItem label="基础分类:" label-position="top">
              <Select v-model="formAddData.classification_name" style="width:100px">
                <Option value="衣服">衣服</Option>
                <Option value="裤子">裤子</Option>
                <Option value="帽子">帽子</Option>
                <Option value="其他">其他</Option>
              </Select>
            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="详细分类:" label-position="top">
              <Select v-model="formAddData.classification_subdivision" style="width:100px">
                <Option value="羽绒服">羽绒服</Option>
                <Option value="卫衣">卫衣</Option>
                <Option value="帽子">帽子</Option>
              </Select>
            </FormItem>
          </Col>
        </Row>
        <Row>
          <Col span="12">
            <FormItem label="性别属性:" label-position="top">
              <Select v-model="formAddData.classification_category" style="width:100px">
                <Option value="男士">男士</Option>
                <Option value="女士">女士</Option>
              </Select>
            </FormItem>
          </Col>
        </Row>
        <Divider plain>商品图片</Divider>

        <div class="demo-upload-list" v-for="item in uploadList" :key="item.index">
          <template v-if="item.status === 'finished'">
            <img :src="item.url">
            <div class="demo-upload-list-cover">
              <Icon type="ios-eye-outline" @click.native="handleView(item.name)"></Icon>
              <Icon type="ios-trash-outline" @click.native="handleRemove(item)"></Icon>
            </div>
          </template>
          <template v-else>
            <Progress v-if="item.showProgress" :percent="item.percentage" hide-info></Progress>
          </template>
        </div>
        <Upload
            ref="upload"
            :show-upload-list="false"
            :on-success="handleSuccess"
            :format="['jpg','jpeg','png','jfif']"
            accept="image/jpg, image/jpeg, image/jfif, image/png"
            :max-size="2048"
            :on-format-error="handleFormatError"
            :on-exceeded-size="handleMaxSize"
            :before-upload="handleBeforeUpload"
            :on-progress="handleProgress"
            :multiple = "true"
            type="drag"
            action="http://localhost:8082/shippingImgUP2"
            style="display: inline-block;width:100px;">
          <div style="width: 100px;height:130px;line-height: 75px;">
            <Icon type="ios-camera" size="20"></Icon>
          </div>
        </Upload>
        <Modal title="View Image" v-model="visible">
          <img :src="imgfileurl" v-if="visible" style="width: 100%">
        </Modal>
      </Form>
    </Modal>

    <!--    表格组件-->
    <tables
        width="550"
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

    <!--    商品展示抽屉-->
    <Drawer
        title="Create"
        v-model="value3"
        width="620"
        :mask-closable="true"
        :styles="styles"
    >
      <Form>
        <Row :gutter="32">
          <Col span="12">
            <FormItem label="商品名称:" label-position="top">
              <Input v-model="formData.commodity_name" placeholder="please enter url">
              </Input>
            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="商品编号:" label-position="top">
              <Input v-model="formData.commodity_id" placeholder="please enter user name" style="width:200px"/>
            </FormItem>
          </Col>
        </Row>
        <FormItem label="商品简介:" label-position="top">
          <Input type="textarea" v-model="formData.commodity_text" :rows="4"
                 placeholder="please enter the description"/>
        </FormItem>
      </Form>
      <Divider plain>商品规格</Divider>
      <Form>
        <Row type="flex" justify="space-around">
          <Col span="12">
            <FormItem label="商品成本:" label-position="top">
              <InputNumber
                  readonly
                  :max="10000"
                  v-model="formData.commodity_cost"
                  :formatter="value => `$ ${value}`.replace(/\B(?=(\d{3})+(?!\d))/g, ',')"
                  :parser="value => value.replace(/\$\s?|(,*)/g, '')"></InputNumber>
            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="商品价格:" label-position="top">
              <InputNumber
                  :max="10000"
                  v-model="formData.commodity_price"
                  :formatter="value => `$ ${value}`.replace(/\B(?=(\d{3})+(?!\d))/g, ',')"
                  :parser="value => value.replace(/\$\s?|(,*)/g, '')"
              >
              </InputNumber>
            </FormItem>
          </Col>
        </Row>

        <Row type="flex" justify="space-around">
          <Col span="12">
            <FormItem label="商品状态:" label-position="top">
              <!--              <Badge color="blue" :text="formData.commodity_state" status="error"/>-->
              <Select v-model="formData.commodity_state" style="width:80px">
                <Option value="上架">上架</Option>
                <Option value="下架">下架</Option>
              </Select>

            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="上架时间:" label-position="top">
              <DatePicker type="datetime" placeholder="Select date and time" :disabled="true" :clearable="false"
                          style="width: 200px" :value="formData.commodity_time"></DatePicker>
            </FormItem>
          </Col>
        </Row>
      </Form>

      <Divider plain>商品类别</Divider>
      <Form>
        <Row>
          <Col span="12">
            <FormItem label="详细分类:" label-position="top">
              <Select v-model="formData.classification_subdivision" style="width:100px">
                <Option value="羽绒服">羽绒服</Option>
                <Option value="卫衣">卫衣</Option>
                <Option value="帽子">帽子</Option>
              </Select>
            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="分类:" label-position="top">
              <Select v-model="formData.classification_name" style="width:100px">
                <Option value="衣服">衣服</Option>
                <Option value="裤子">裤子</Option>
                <Option value="帽子">帽子</Option>
                <Option value="其他">其他</Option>
              </Select>
            </FormItem>
          </Col>
        </Row>
        <Row>
          <Col span="12">
            <FormItem label="男女分类:" label-position="top">
              <Select v-model="formData.classification_category" style="width:100px">
                <Option value="男士">男士</Option>
                <Option value="女士">女士</Option>
              </Select>
            </FormItem>
          </Col>
        </Row>
        <Divider plain>商品图片</Divider>
        <div class="imglist" v-for="item in imgurlList" :key="item.id">
          <Card style="margin:15px;"><img v-lazy="item.commodity_img" alt="" class="imgbox"></Card>
        </div>
        <Card style="display:inline-block;margin:15px;" class="imgadd">
          <Icon class="iconfont-shopping shop-jiahao imgaddicon" @click="$refs.abc.click()" ref="iconshow"></Icon>
          <img
              @click="$refs.abc.click()"
              :src="tp"
          />
          <input type="file" style="display: none" ref="abc" @change="bian" multiple="multiple"/>
        </Card>


      </Form>
      <div class="demo-drawer-footer">
        <Button style="margin-right: 8px" @click="value3 = false">取消</Button>
        <Button type="primary" @click="drawerquxiaoup()">修改</Button>
      </div>
    </Drawer>

    <!--    批量删除-->
    <Modal
        v-model="dellistID"
        title="确认删除"
        @on-ok="Delconfirm">
      <p>您确认要删除ID为<span>{{ dellist }}</span>的数据吗</p>
    </Modal>
    <!--    a2[a2.length] = {imgurl:'http://172.16.254.1:8081/images/shopping/DM_20211115203737_001.png'};-->
  </div>
</template>
<style scoped lang="less">
@import "../../assets/css/admin/shopping";
</style>

<script>
import tables from '../../components/admin/table/table';
import {
  shoppingshow,
  shoppingID,
  shoppingDel,
  shoppingUP,
  shoppingimgID,
  shippingImgUP,
  shoppingDataadd,
  shoppingDelList,
  shoppingDelImgList
} from '../../API/api';

export default {
  props: [],
  data() {
    return {
      formItem: {},
      columns1: [
        {
          type: 'selection',
          width: 60,
          align: 'center'
        },
        {
          title: '商品编号',
          key: 'commodity_id',
          width: 100
        },
        {
          title: '商品名称',
          key: 'commodity_name',
          width: 120,
          tooltip: true
        },
        {
          title: '商品简介',
          key: 'commodity_text',
          width: 150,
          tooltip: true
        },
        {
          title: '商品图片',
          slot: 'shopping_img',
          width: 150,
        },
        {
          title: '商品成本',
          key: 'commodity_cost',
          width: 100,
        },
        {
          title: '商品价格',
          key: 'commodity_price',
          width: 100,
        },
        {
          title: '商品销量',
          key: 'commodity_sell',
          width: 100,
        },
        {
          title: '商品状态',
          // key: 'commodity_state',
          width: 100,
          slot: 'switch1'
        },
        {
          title: '添加时间',
          key: 'commodity_time',
          width: 150,
        },
        {
          title: '分类',
          key: 'classification_name',
          width: 100,
        },
        {
          title: '详细分类',
          key: 'classification_subdivision',
          width: 100,
        },
        {
          title: '装饰类别',
          key: 'classification_category',
          width: 100,
        },

        {
          title: 'Action',
          slot: 'action',
          width: 150,
          align: 'center',
          fixed: 'right'
        }
      ],
      data1: [],
      page: {},
      loading: false,
      value3: false,
      imgurlList: [],
      confirm: false,
      modalform: false,//添加商品表单
      tp: null,
      styles: {
        height: 'calc(100% - 55px)',
        overflow: 'auto',
        paddingBottom: '53px',
        position: 'static'
      },
      value9: 50.5,
      formData: {},
      formAddData: {},
      //添加图片上传
      imgName: '',
      visible: false,
      uploadList: [],
      imgfileurl: "",
      arr: [],
      arr2: [],
      imgfileIF: false,
      loadingform:true,
      time: new Date(),
      idadd:0,
      imgListAdd: [],
      shoppingDelListID:[],
      dellistID:false,
      dellist:[],
      iddd:0,

    }
  },
  created() {
    this.shoppinglist();
  },
  mounted() {
    this.uploadList = this.$refs.upload.fileList;
  },
  computed: {},
  methods: {
    //表格:查看
    show(index) {
      this.value3 = true;
      // this.data1[index].commodity_cost = parseFloat(this.data1[index].commodity_cost);
      // this.data1[index].commodity_price = parseFloat(this.data1[index].commodity_price);
      // this.formData =this.data1[index];
      shoppingID({
        Commodity_id: this.data1[index].commodity_id
      }).then(res => {
        if (res.data != "") {
          //转换成浮点数
          res.data.commodity_cost = parseFloat(res.data.commodity_cost);
          res.data.commodity_price = parseFloat(res.data.commodity_price);
          this.formData = res.data;
          console.log(this.formData);
        } else {
          this.$Message.error({content: "查看失败，请稍后再试", background: true});
        }
      }).catch(err => {
        this.$Message.error({content: "删除失败:" + err, background: true});
      })
      //id查询图片
      shoppingimgID({
        Commodity_id: this.data1[index].commodity_id
      }).then(res => {
        this.imgurlList = res.data;
        for (let i = 0; i < res.data.length; i++) {
          this.imgurlList[i].commodity_img = this.$store.state.shoppingimgurl_prefix + res.data[i].commodity_img;
        }
      }).catch(error => {
        this.$Message.error({content: "发生错误、图片显示失败:" + error, background: true});
      })

    },
    //删除
    remove(index) {
      this.$Modal.confirm({
        title: '删除商品',
        content: '<p>您确认要删除当前商品吗？</p><p>(此操作不可撤销!)</p>',
        onOk: () => {
          // this.$Message.info('Clicked ok');
          shoppingDel({
            Commodity_id: this.data1[index].commodity_id
          }).then(res => {
            if (res.data == true) {
              this.$Message.info('删除成功');
              this.shoppinglist();
            } else if (res.data == false) {
              this.$Message.info('删除失败,请稍后再试');
            }
          }).catch(error => {
            this.$Message.info('操作有误:' + error);
          })
        },
        onCancel: () => {
          this.$Message.info('您取消了当前操作');
        }
      });
    },
    //全选
    onSelectAll(selection) {
      console.log(selection);
    },
    //当选项变化时
    onSelectchange(selection) {
      let arr = new Array();
      for (let i = 0; i < selection.length; i++) {
        arr.push(selection[i].commodity_id);
      }
      console.log(arr);
      this.dellist = arr;
    },
    //商品批量删除
    Delconfirm(){
      shoppingDelList({Commodity_id: this.dellist}).then(()=>{
        shoppingDelImgList({Commodity_id: this.dellist}).then(res=>{
          if (res == true) {
            this.$Message.success({content: "删除成功", background: true});
            this.shoppinglist();
          } else if (res == false) {
            this.$Message.error({content: "删除失败", background: true});
          }
        }).catch(error => {
          this.$Message.error("发生未知错误" + error);
        })

      })
    },

    rem() {
      this.dellistID = true;
    },
    //刷新动画
    refresh() {
      this.loading = true;
      setTimeout(() => {
        this.loading = false;
        this.shoppinglist();
      }, 2000);
    },
    //分页
    pageshow(e) {
      // console.log(e);
      shoppingshow({
        pagenum: e,
        pagesize: 5,
      }).then(res => {
        // console.log(this.$store.state.shoppingimgurl_prefix + res.list[0].commodity_img);
        this.idadd = res.list.length;
        this.data1 = res.list;
        this.page.total = res.total;
        this.page.size = res.pageSize;
        for (let item in res.list) {
          res.list[item].commodity_cost = res.list[item].commodity_cost.toFixed(2);
          res.list[item].commodity_price = res.list[item].commodity_price.toFixed(2);
          res.list[item].commodity_time = this.$store.state.transformTimestamp(res.list[item].commodity_time);
          // this.imgurlList[item] = this.$store.state.imgurl_prefix+"images/shopping/"+res.list[item].commodity_img;
          res.list[item].commodity_img = this.$store.state.shoppingimgurl_prefix + res.list[item].commodity_img;
        }
      })
    },
    shoppinglist() {
      shoppingshow({
        pagenum: 1,
        pagesize: 5,
      }).then(res => {
        // console.log(this.$store.state.shoppingimgurl_prefix + res.list[0].commodity_img);
        this.idadd = res.list.length;
        this.data1 = res.list;
        this.page.total = res.total;
        this.page.size = res.pageSize;
        for (let item in res.list) {
          res.list[item].commodity_cost = res.list[item].commodity_cost.toFixed(2);
          res.list[item].commodity_price = res.list[item].commodity_price.toFixed(2);
          res.list[item].commodity_time = this.$store.state.transformTimestamp(res.list[item].commodity_time);
          // this.imgurlList[item] = this.$store.state.imgurl_prefix+"images/shopping/"+res.list[item].commodity_img;
          res.list[item].commodity_img = this.$store.state.shoppingimgurl_prefix + res.list[item].commodity_img;
        }
      })
    },
    ShoppingAdd() {
      console.log("xxx")
      this.formAddData ={};
      this.$store.state.shoppingData.then(res=>{
        this.formAddData.commodity_id = res[0].commodity_id+1;
        this.iddd = res[0].commodity_id+1;
        // console.log(this.formAddData.commodity_id);
      });
      this.modalform = true;
    },
    //商品添加
    ShoppingAddfun() {
      let Formdata = new FormData();
      Formdata.append("Commodity_name", this.formAddData.commodity_name);
      Formdata.append("Commodity_text", this.formAddData.commodity_text);
      Formdata.append("Commodity_imgid", this.iddd);
      Formdata.append("Commodity_cost", this.formAddData.commodity_cost);
      Formdata.append("Commodity_price", this.formAddData.commodity_price);
      Formdata.append("Commodity_state", this.formAddData.commodity_state);
      Formdata.append("Classification_name", this.formAddData.classification_name);
      Formdata.append("Classification_subdivision", this.formAddData.classification_subdivision);
      Formdata.append("Classification_category", this.formAddData.classification_category);

      shoppingDataadd(Formdata).then(res => {
        // console.log(res);
        if(res.status === 200){
          setTimeout(() => {
            this.$Notice.success({
              title: '添加成功',
              desc:"成功添加商品信息，可通过表格预览其添加的商品信息",
              duration:3
            });
            this.loadingform = true;
            this.modalform = false;
            console.log(res);
          }, 2500);
        }else if(res.status != 200){
          setTimeout(() => {
            this.$Notice.error({
              title: '添加失败',
              desc:"添加商品信息发生错误，请检查您输入的信息",
              duration:3
            });
            this.loadingform = true;
          }, 2500);
        }
      }).catch(error => {
        this.$Notice.warning({
          title: '发生未知错误'+error,
          desc:"发生了未知错误，请稍后再试!",
          duration:3
        });

        this.loadingform = true;
      })
    },

    //多图片添加
    ShoppingAddfunImg(){
      for(let i=0;i < this.imgListAdd.length;i++){
        let Formdata = new FormData();
        Formdata.append("Commodity_id", this.formAddData.commodity_id);
        Formdata.append("Commodity_img", this.imgListAdd[i]);
        shippingImgUP(Formdata).then(res=>{
          console.log(res);
        })
      }

    },
    Shoppingtext_Add() {
      // this.imgfileIF = true;
      // console.log(this.formAddData);
      setTimeout(() => {
        this.loadingform = false;
      }, 2000);
      this.ShoppingAddfun();
      this.ShoppingAddfunImg();
    },

    //图片
    bian() {
      this.tp = URL.createObjectURL(this.$refs.abc.files[0]);
      // console.log(this.$refs.abc.files[0]);
      this.formData.commodity_img = this.$refs.abc.files[0];

      if (this.tp != "") {
        this.$refs.iconshow.$el.style.display = 'none'
      }
    },
    //商品修改
    //商品图片修改添加
    drawerquxiaoup() {
      // console.log(this.formData.classification_subdivision);
      // console.log(this.formData.commodity_img);
      let Formdata = new FormData();
      Formdata.append("Commodity_id", this.formData.commodity_id);
      Formdata.append("commodity_name", this.formData.commodity_name);
      Formdata.append("Commodity_text", this.formData.commodity_text);
      Formdata.append("Commodity_cost", this.formData.commodity_cost);
      Formdata.append("Commodity_price", this.formData.commodity_price);
      Formdata.append("Commodity_sell", this.formData.commodity_sell);
      Formdata.append("Commodity_state", this.formData.commodity_state);
      Formdata.append("Classification_name", this.formData.classification_name);
      Formdata.append("Classification_subdivision", this.formData.classification_subdivision);
      Formdata.append("Classification_category", this.formData.classification_category);
      shoppingUP(Formdata).then(res => {
        // console.log(this.formData.commodity_img != null);
        if(res.status === 200 ){
          this.$Message.success({content: "修改成功", background: true});
          this.value3 = false;
        }else{
          this.$Message.error({content: "修改失败", background: true});
        }
        if(this.formData.commodity_img != null){
          let Formdata2 = new FormData();
          Formdata2.append("Commodity_img", this.formData.commodity_img);
          Formdata2.append("Commodity_id", this.formData.commodity_id);
          shippingImgUP(Formdata2).then(()=>{
            // console.log("xx");
            this.tp = "";

          });
        }
      })

    },


    //图片添加上传
    handleView(name) {
      // console.log(name);
      this.imgName = name;
      for (var i = 0; i < this.arr.length; i++) {
        if (this.arr2[i] == this.imgName) {
          this.imgfileurl = this.arr[i];
        }
      }
      this.visible = true;
    },
    //删除图片icon
    handleRemove(file) {
      const fileList = this.$refs.upload.fileList;
      this.$refs.upload.fileList.splice(fileList.indexOf(file), 1);
    },
    //多图片上传成功
    handleSuccess() {
      // file.url = this.imgfileurl;
      // console.log(fileList);
    },
    handleProgress(even, file, fileList) {
      for (let item in fileList) {
        fileList[item].url = this.arr[item];
      }
    },
    handleFormatError(file) {
      this.$Notice.warning({
        title: '文件格式错误',
        desc: 'File format of ' + file.name + ' is incorrect, please select jpg or png.'
      });
    },
    handleMaxSize(file) {
      this.$Notice.warning({
        title: '文件超出指定大小限制',
        desc: 'File  ' + file.name + ' is too large, no more than 2M.'
      });
    },
    handleBeforeUpload(file) {
      const check = this.uploadList.length < 5;
      // console.log(file.name);
      this.arr.push(URL.createObjectURL(file));
      this.imgListAdd.push(file);
      this.arr2.push(file.name);
      // this.arr.push()
      // console.log(this.arr)

      // console.log("-----------1111111111111111111--------------------")
      // console.log(file);
      // // console.log(this.arr);
      // this.imgfileurl = URL.createObjectURL(file);
      // console.log("-----------2222222222222222--------------------")
      // console.log(this.imgfileurl);
      if (!check) {
        this.$Notice.warning({
          title: '最多可以上传五张照片'
        });
      }
      return check;
    }
  },
  components: {
    tables
  }
}
</script>
