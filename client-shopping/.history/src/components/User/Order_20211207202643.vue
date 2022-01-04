<template>
  <article>
    <!-- 订单信息 -->
    <article class="order-all">
      <Tabs type="card">
        <TabPane label="所有订单">
          <!--      类别-->
          <div class="order-leibie">
            <Row>
              <Col span="12">宝贝</Col>
              <Col span="3">单价</Col>
              <Col span="3">数量</Col>
              <Col span="3">实际付款</Col>
              <Col span="3">状态</Col>
            </Row>
          </div>
          <div class="order-text">
            <!-- <Card>
              <p slot="title" class="order-head"><span>2021/12/1 12:00:00</span><span style="margin-left:15px;">订单号:xxxxxxxxxxxxxxxxxxx</span><i
                  class="iconfont-shopping shop-xiangxixinxi icon-x1"></i><i
                  class="iconfont-shopping shop-shanchu icon-x2"></i></p>
              <article class="order-text2">
                <Row>
                  <Col span="4">
                    <img v-lazy=orderList.imgurl alt="" width="80px">
                  </Col>
                  <Col span="8" style="text-align: left;">
                    <p class="order-title">嘉筱加绒连帽卫衣</p>
                    <p class="order-title2">颜色:红色</p>
                    <p class="order-title2">尺寸:X</p>
                  </Col>
                  <Col span="3" style="line-height:100px;">
                    <p><i class="iconfont-shopping shop-jiage"></i><s class="order-money1">100.1</s><span class="order-money2">99.9</span>
                    </p>
                  </Col>
                  <Col span="3" style="line-height:100px;"><p>1</p></Col>
                  <Col span="3">
                    <p style="font-weight: bold;line-height:100px;"><i class="iconfont-shopping shop-jiage"></i>999.99</p>
                  </Col>
                  <Col span="3" style="line-height:100px;"><span>已发货</span></Col>
                </Row>
              </article>
            </Card> -->
            <!-- <div class="order-card">
              <div class="order-div1">
                <div>
                  <span style="margin-left:10px;line-height: 40px;">2021/12/1 12:00:00</span>
                  <span style="margin-left:10px;">订单号:xxxxxxxxxxxxxxxx</span>
                  </div>
                <div style="padding-right:30px;">
                  <i
                  class="iconfont-shopping shop-xiangxixinxi icon-x1" style="padding-right:10px;"></i>
                  <i class="iconfont-shopping shop-shanchu icon-x2"></i>
                </div>
              </div>
                  <Divider />
              <div class="order-div2">
              <Row>
                <Col span="4">x</Col>
                <Col span="8">x</Col>
                <Col span="3">x</Col>
                <Col span="3">x</Col>
                <Col span="3">x</Col>
                <Col span="3">x</Col>
              </Row>
              </div>
            </div> -->
            <Page
              :total="40"
              size="small"
              style="text-align: center; margin-top: 20px"
            />
          </div>
        </TabPane>
        <TabPane label="待发货">标签二的内容</TabPane>
        <TabPane label="待评价">标签三的内容</TabPane>
      </Tabs>
    </article>
  </article>
</template>
<style lang="less" scoped>
@import "../../assets/css/Order.less";
</style>
<script>
export default {
  data() {
    return {
      orderList: {
        imgurl:
          "http://localhost:8081/images/shopping/DM_20211115203702_017.png",
      },
    };
  },
  methods: {},
};
</script>