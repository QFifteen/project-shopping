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
          title: 'Name',
          key: 'name'
        },
        {
          title: 'img',
          slot:'bannerimg'
        },
        {
          title: 'Address',
          key: 'address'
        },
        {
          title: '操作',
          key: 'address'
        },
        {
          title: 'Action',
          slot: 'action',
          width: 150,
          align: 'center'
        }
      ],
      data1:this.$store.state.data1,
      page:{total:100},
      loading:false
    }
  },
  created() {
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
    }
  },
  components: {
    tables
  }
}
</script>