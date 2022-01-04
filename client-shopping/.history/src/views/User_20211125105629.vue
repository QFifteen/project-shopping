<template>
  <article>
    <Home-nav></Home-nav>
    <!-- 正文-个人信息 -->
    <article>
      <Row>
        <Col span="1"></Col>
        <Col span="22">
             <Row>
                 <Col span="6"></Col>
             </Row>
        </Col>
        <Col span="1"></Col>
      </Row>
    </article>
    <footers></footers>
  </article>
</template>
<style lang="less" scoped>
</style>

<script>
import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";
export default {
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