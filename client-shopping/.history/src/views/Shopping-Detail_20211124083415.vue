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
         <div id="div1">
    <div class="small_pic">
  <span class="mark"></span>
        <span class="float_layer"></span>
        <img src="Photos/small.png" alt="放大镜图片一" longdesc="http://www.miaov.com" />
    </div>
    <div class="big_pic">
  <img src="Photos/psb.jpeg" alt="放大镜图片二" longdesc="http://www.miaov.com" />
 </div>
</div>
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

export default {
  name: "Detail",
  data() {
    return {};
  },
  methods: {},
  components: {
    HomeNav,
    footers,
  },
};
</script>