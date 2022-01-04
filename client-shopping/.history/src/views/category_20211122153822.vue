<template>
  <article>
    <HomeNav></HomeNav>
    <banner></banner>

    <article>
      <Row>
        <Col span="1"></Col>

        <Col span="22">
        <article class="center-text">
            <div class="title"></div>
        </article>
        </Col>
        <Col span="1"> </Col>
      </Row>
    </article>
  </article>
</template>
<script>
import HomeNav from "../components/Home-nav";
import banner from "../components/banner.vue";
export default {
  name: "category",
  data() {
    return {};
  },
  methods: {},
  components: {
    HomeNav,
    banner,
  },
};
</script>
<style scoped lang="less">
@import "../assets/css/category.less";
</style>