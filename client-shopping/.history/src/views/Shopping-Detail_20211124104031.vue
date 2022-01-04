<template>
  <article>
    <HomeNav></HomeNav>

    <Breadcrumb>
      <BreadcrumbItem to="/">Home</BreadcrumbItem>
      <BreadcrumbItem to="/Detail">Detail</BreadcrumbItem>
    </Breadcrumb>
    <span class="title">商品详情介绍</span>

    <!-- 正文 -->
    <article class="shopping-all">
      <Row>
        <Col span="1"></Col>
        <Col span="22">
          <!-- <PicZoom  :width="300"  :height="300" :minIMGsrc="imgurl" :scale="3" /> -->
          <article>
            <Row>
              <Col span="2">
                <p class="iconfont-shopping shop-xiangshangjiantou shang"></p>

                <div class="minimg-list">
                  <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    alt=""
                    width="100%"
                  />
                <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    alt=""
                    width="100%"
                  />
                  
                </div>
                  <p class="iconfont-shopping shop-xiajiantou shang"></p>
              </Col>
              <Col span="10">
                <div class="maximg">
                                  <img v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "  width="100%"/>
                </div>
              </Col>
              <Col span="12">
              <div class="shopping-text">
                <p class="shopping-title">商品名称xxxxxx</p>
                <p class="shopping-Introduction">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
                <!-- 价格-折扣 -->
                <div class="shopping-price">
                    <ul>
                        <li><span class="iconfont-shopping shop-paixu">d</span></li>
                        <li>d</li>
                    </ul>
                </div>
              </div>
              </Col>
            </Row>
          </article>
        </Col>
        <Col span="1"></Col>
      </Row>
    </article>

    <footers></footers>
  </article>
</template>
<style lang="less" scoped>
@import "../assets/css/Shopping-Detail.less";
</style>

<script>
import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";

// 放大镜功能组件
// import PicZoom from "../components/PicZoom.vue";

export default {
  name: "Detail",
  data() {
    return {
      // imgurl:'http://localhost:8081/images/shopping/DM_20211115203702_018.png'
    };
  },
  components: {
    HomeNav,
    footers,
    // PicZoom,
  },
};
</script>