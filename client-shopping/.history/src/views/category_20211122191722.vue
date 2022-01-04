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
                <Col span="7" class="Col-left">
                  <img
                    v-lazy="require('../assets/images/yifu.png')"
                    alt=""
                    width="100%"
                    class="imgl"
                  />
                  <div class="img-title1"><p>服饰</p></div>
                </Col>
                <Col span="7" push="1" class="Col-left">
                  <div>
                    <img
                      v-lazy="require('../assets/images/maozi.png')"
                      alt=""
                      height="225px"
                      class="imgl"
                    />
                    <div class="img-title2"><p>帽子</p></div>
                  </div>
                  <div class="imgwidth">
                    <img
                      v-lazy="require('../assets/images/qita.png')"
                      alt=""
                      height="225px"
                      class="imgl"
                    />
                    <div class="img-title3"><p>其他</p></div>
                  </div>
                </Col>
                <Col span="7" push="2" class="Col-left">
                  <img
                    v-lazy="require('../assets/images/kuzi.png')"
                    alt=""
                    width="100%"
                    class="imgl"
                  />
                  <div class="img-title1"><p>裤子</p></div>
                </Col>
              </Row>
            </div>
            <!-- 时尚了解 -->
            <div class="shishang">
              <div class="title">
                <span>时尚了解</span>
              </div>
              <Row>
                <Col span="5" class="">
                  <img
                    v-lazy="require('../assets/images/shisan1.png')"
                    alt=""
                    width="100%"
                  />
                  <p class="shishang-title">xxxxxxxxxxxxxxxxxxx</p>
                  <p class="shishang-text">
                    xxxxxxxxxxxxxxxxxxxxxxxxxxx<br />xxxxxxx
                  </p>
                </Col>
                <Col span="5" push="1" class="shishang-left">
                  <p class="shishang-text">
                    xxxxxxxxxxxxxxxxxxxxxxxxxxx<br />xxxxxxx
                  </p>
                  <p class="shishang-title">xxxxxxxxxxxxxxxxxxx</p>
                  <img
                    v-lazy="require('../assets/images/shisan1.png')"
                    alt=""
                    width="100%"
                  />
                </Col>
                <Col span="5" push="2" class="shishang-left">
                  <img
                    v-lazy="require('../assets/images/shisan1.png')"
                    alt=""
                    width="100%"
                  />
                  <p class="shishang-title">xxxxxxxxxxxxxxxxxxx</p>
                  <p class="shishang-text">
                    xxxxxxxxxxxxxxxxxxxxxxxxxxx<br />xxxxxxx
                  </p></Col
                >
                <Col span="5" push="3" class="shishang-left">
                  <p class="shishang-text">
                    xxxxxxxxxxxxxxxxxxxxxxxxxxx<br />xxxxxxx
                  </p>
                  <p class="shishang-title">xxxxxxxxxxxxxxxxxxx</p>
                  <img
                    v-lazy="require('../assets/images/shisan1.png')"
                    alt=""
                    width="100%"
                  />
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