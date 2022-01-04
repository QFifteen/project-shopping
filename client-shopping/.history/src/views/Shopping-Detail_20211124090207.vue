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
        <pic-zoom :previewImg="smallImg" :zoomImg="bigImg"></pic-zoom>
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
import PicZoom from "../components/PicZoom.vue";
export default {
  name: "Detail",
  data() {
    return {
        data: {
        smallImg: '../assets/',
        bigImg: '../../static/image/big.jpg'
      }
    };
  },
  components: {
    HomeNav,
    footers,
    PicZoom
  },
};
</script>