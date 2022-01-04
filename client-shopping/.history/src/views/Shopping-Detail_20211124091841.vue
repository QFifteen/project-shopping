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
        <PicZoom  :width="300"  :height="300" :minIMGsrc="imgurl" :scale="3" />
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
import PicZoom  from "../components/PicZoom.vue";
export default {
  name: "Detail",
  data() {
    return {
        imgurl:'http://localhost:8081/images/shopping/DM_20211115203702_018.png'
    };
  },
  components: {
    HomeNav,
    footers,
    PicZoom 
  },
};
</script>