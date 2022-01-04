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
                    <img v-lazy="require('../assets/images/yifu.png')" alt="" width="100%" style="position: absolute;z-index:-1;">
                    <div class="img-title1"><p>服饰</p></div>
                    </Col>
                    <Col span="7" push="1">
                    <div ><img v-lazy="require('../assets/images/maozi.png')" alt="" height="224px">
                    </div>
                    <div  class="imgwidth"><img v-lazy="require('../assets/images/qita.png')" alt="" height="224px">
                    </div>
                    </Col>
                    <Col span="7" push="2">
                    <img v-lazy="require('../assets/images/kuzi.png')" alt="" width="100%" style="position: absolute;z-index:-1;">
                    <div class="img-title1"><p>裤子</p></div>
                    </Col>
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