<template>
  <div>
    <card class="tab-card">
      <div class="tab-div">
        <span class="tab-title">查询表格</span>
        <div style="display: flex;position:absolute;right:40px;">
          <Button type="primary" @click="refresh">刷新数据</Button>
          <i class="iconfont-shopping shop-shuaxin tab-icon" style="padding-left: 10px"></i>
          <i class="iconfont-shopping shop-quanping_o tab-icon" style="padding-left: 10px"></i>
          <i class="iconfont-shopping shop-shezhi3 tab-icon" style="padding-left: 10px"></i>
        </div>
      </div>
      <!--      表格-->
      <Table :columns="columns1"   ref="selection" :data="data1" width="100%" style="margin-top:15px;"
              @on-select-all="onSelectAll" @on-selection-change="onSelectchange" :loading="loading" no-data-text>
        <template slot-scope="{ index }" slot="action">
          <a @click="show(index)">查看</a>
          <span class="iconfont-shopping shop-vertical_line"></span>
          <a @click="remove(index)" style="color:red">删除</a>
        </template>
        <!--        头像图片-->
        <template slot="user_img" slot-scope="{ row }">
          <img v-lazy="row.user_img" alt="" width="70%" style="margin-top:5px">
        </template>
        <!--        管理员图片-->
        <template slot="administrator_img" slot-scope="{ row }">
          <img v-lazy="row.administrator_img" alt="" width="30%" style="margin-top:5px">
        </template>
        <!--        商品图片-->
        <template slot="shopping_img" slot-scope="{ row }">
          <img v-lazy="row.commodity_img" alt="" width="40%" style="margin-top: 5px">
        </template>
<!--        轮播图-->
        <template slot="bannerimg" slot-scope="{ row }">
          <img v-lazy="row.bannerimg" alt="" width="100%" style="margin-top: 10px">
        </template>
<!--        商品状况-->
        <template slot="switch1" slot-scope="{ row }">
          <Badge color="blue" :text="row.commodity_state" status="error"/>
        </template>
      </Table>
      <div class="anniu">
        <div>
          <Button @click="rem()">删除所选项</Button>
        </div>
        <Page :total="page.total" @on-change="pageshow" show-total :page-size="page.size"></Page>
      </div>
    </card>
  </div>
</template>
<style scoped lang="less">
@import "../../../assets/css/admin/table";
</style>
<script>

export default {
  props: ['columns1', 'data1','onSelectAll','show','remove','onSelectchange','rem','refresh','loading','pageshow','page'],
  data() {
    return {
    }
  },
  methods: {
    // //表格:查看与删除
    // show(index) {
    //   console.log(this.data1[index].name);
    // },
    // remove(index) {
    //   console.log(index);
    // },
    // onSelect(selection, row) {
    //   console.log(selection, row);
    // },
    // onSelectAll(selection) {
    //   console.log(selection);
    // },
    // handleSelectAll(status) {
    //   this.$refs.selection.selectAll(status);
    // }
    // onSelectchange(selection){
    //   console.log(selection);
    // }
  },
  created() {

  }
}
</script>
