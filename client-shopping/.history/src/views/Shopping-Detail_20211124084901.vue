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
<div class="box">
    <div class="small">
        <img src="../assets/images/fy18e1.jpg" alt=""/>
        <div class="mask"></div>
    </div>
    <div class="big">
        <img src="../assets/images/fy18e1.jpg" alt=""/>
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
<script src="../assets/js/Shopping-Detail.js" type="text/JavaScript"></script>
<script></script>
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