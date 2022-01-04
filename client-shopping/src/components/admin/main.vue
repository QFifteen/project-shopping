<template>
  <div>
    <div class="card">
      <div style="width:100%">
        <Card class="card2">
          <p slot="title">访问量</p>
          <p class="text">1,999</p>
        </Card>
        <div class="card-icon-div">
          <Card class="card-icon">
            <div>
              <img v-lazy="require('../../assets/images/admin/user.png')" alt="" width="25px" height="25px">
              <h3>用户管理</h3>
            </div>
          </Card>
          <Card class="card-icon2">
            <div style="text-align:center">
              <img v-lazy="require('../../assets/images/admin/fenxi.png')" alt="" width="25px" height="25px">
              <h3>用户可视化</h3>
            </div>
          </Card>
        </div>

      </div>
      <div>
        <Card class="card2">
          <p slot="title">销量额</p>
          <p class="text"><i class="iconfont-shopping shop-jiage text"></i>40,716</p>
        </Card>
        <div class="card-icon-div">
          <Card class="card-icon">
            <div style="text-align:center">
              <img v-lazy="require('../../assets/images/admin/shopping.png')" alt="" width="25px" height="25px">
              <h3>商品</h3>
            </div>
          </Card>
          <Card class="card-icon2">
            <div style="text-align:center">
              <img v-lazy="require('../../assets/images/admin/plun.png')" alt="" width="25px" height="25px">
              <h3>评论</h3>
            </div>
          </Card>
        </div>
      </div>
      <div>
        <Card class="card2">
          <p slot="title">订单量</p>
          <p class="text">66,396</p>
        </Card>
        <div class="card-icon-div">
          <Card class="card-icon">
            <div style="text-align:center">

              <img v-lazy="require('../../assets/images/admin/order.png')" alt="" width="25px" height="25px">
              <h3>订单</h3>
            </div>
          </Card>
          <Card class="card-icon2">
            <div style="text-align:center">
              <img v-lazy="require('../../assets/images/admin/shuju.png')" alt="" width="25px" height="25px">
              <h3>订单可视化</h3>
            </div>
          </Card>
        </div>
      </div>
      <div>
        <Card class="card2">
          <p slot="title">用户数量</p>
          <p class="text">40,716</p>
        </Card>
        <div class="card-icon-div">
          <Card class="card-icon">
            <div>
              <img v-lazy="require('../../assets/images/admin/text.png')" alt="" width="25px" height="25px">
              <h3>项目信息</h3>
            </div>
          </Card>
          <Card class="card-icon2">
            <div style="text-align:center">
              <img v-lazy="require('../../assets/images/admin/set.png')" alt="" width="25px" height="25px">
              <h3>设置</h3>
            </div>
          </Card>
        </div>
      </div>
    </div>

    <Tabs value="name1" class="tab">
      <TabPane label="商品信息" name="name1">
        <div class="statistics">
          <Card class="card-statistics">
            <div id="myChart" style="width:400px;height:400px;"></div>
          </Card>

          <Card class="card-statistics" style="margin-left:10px;">
            <div id="myChart2" style="width:400px;height:400px;"></div>
          </Card>
        </div>
      </TabPane>
      <TabPane label="商品销量折线图" name="name2">
        <div id="myChart3" style="width:100%;height:100%;text-align:center;"></div>
      </TabPane>
    </Tabs>

  </div>
</template>
<style scoped lang="less">
@import "../../assets/css/admin/main";
</style>

<script>
import {option, option2, option3} from '../../echarts/MyEcharts';

export default {
  data() {
    return {
      imgurl:"http://172.16.254.1:8081/images/loginimg.png",
    }
  },
  methods: {
    drawLine() {
      let myChart = this.$echarts.init(document.getElementById("myChart"));
      myChart.setOption(option);
      //
      let myChart2 = this.$echarts.init(document.getElementById("myChart2"));
      myChart2.setOption(option2);

      let myChart3 = this.$echarts.init(document.getElementById("myChart3"));
      myChart3.setOption(option3);
    }
  },
  mounted() {
    setTimeout(() => {
      this.drawLine();
    }, 1000)
  }
}
</script>
