<template>
  <article>
    <HomeNav></HomeNav>
    <banner></banner>

    <article>
      <Row>
        <Col span="1"></Col>

        <Col span="22">
        <article class="center-text">
            <div class="title">
                <span>多样选择，让服饰多样化</span>
            </div>
            <div class="category">
                <Row>
                    <Col span="7">
                    <img v-lazy="require('../assets/')" alt="">
                    </Col>
                    <Col span="7" push="1">x</Col>
                    <Col span="7" push="2">x</Col>
                </Row>
            </div>
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