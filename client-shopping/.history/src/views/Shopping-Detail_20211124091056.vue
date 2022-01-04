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
        <s-imgZoom  :width="300"  :height="300" minIMGsrc="https://img.alicdn.com/imgextra/i2/2183295419/O1CN01awKYlS1ptwv0tbmL5_!!0-item_pic.jpg_430x430q90.jpg" :scale="3" />

————————————————
版权声明：本文为CSDN博主「朝阳39」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_41192489/article/details/111567135
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
    };
  },
  components: {
    HomeNav,
    footers,
    PicZoom 
  },
};
</script>