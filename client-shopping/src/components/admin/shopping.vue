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
          <Button type="primary" icon="ios-search">搜索</Button>
        </FormItem>
      </Form>
    </Card>

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
        :pageshow = "pageshow"
        :page = "page">
    </tables>

  </div>
</template>
<style scoped lang="less">
@import "../../assets/css/admin/shopping";
</style>

<script>
import tables from '../../components/admin/table/table';
import {shoppingshow} from '../../API/api';

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
          title: '商品编号',
          key: 'commodity_id',
          width:100
        },
        {
          title: '商品名称',
          key: 'commodity_name',
          width:120,
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
          slot:'shopping_img',
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
          slot:'switch1'
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
      data1:[],
      page:{total:100},
      loading:false
    }
  },
  created() {
    this.shoppinglist();
  },
  methods:{
    //表格:查看
    show(index) {
      console.log(this.data1[index].name);
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
    },
    //时间转换
    transformTimestamp(timestamp){
      let a = new Date(timestamp).getTime();
      const date = new Date(a);
      const Y = date.getFullYear() + '-';
      const M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
      const D = (date.getDate() < 10 ? '0'+date.getDate() : date.getDate()) + '  ';
      const h = (date.getHours() < 10 ? '0'+date.getHours() : date.getHours()) + ':';
      const m = (date.getMinutes() <10 ? '0'+date.getMinutes() : date.getMinutes()) ;
      // const s = date.getSeconds(); // 秒
      const dateString = Y + M + D + h + m;
      // console.log('dateString', dateString); // > dateString 2021-07-06 14:23
      return dateString;
    },
    shoppinglist(){
      shoppingshow({
        pagenum:1,
        pagesize:5,
      }).then(res=>{
        console.log(res.list);
        this.data1 = res.list;
        console.log(JSON.parse(res.list[0].commodity_img).name);

        for(let item in res.list) {
          res.list[item].commodity_cost = res.list[item].commodity_cost.toFixed(2);
          res.list[item].commodity_price = res.list[item].commodity_price.toFixed(2);

        }
      })
    }
  },
  components: {
    tables
  }
}
</script>
