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
    <PicZoom :previewImg="smallImg" :zoomImg="bigImg"></PicZoom>
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
        smallImg: '../assets/images/fy18e1.jpg',
        bigImg: '../assets/images/fy18e1.jpg'
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