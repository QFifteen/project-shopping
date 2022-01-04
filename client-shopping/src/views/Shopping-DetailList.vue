<template>
  <article>
    <!-- 导航栏，头部 -->
    <HomeNav></HomeNav>

    <!-- 中间内容(商品详情) -->
    <article>
      <Breadcrumb>
        <BreadcrumbItem to="/">Home</BreadcrumbItem>
        <BreadcrumbItem to="/Detail">Detail</BreadcrumbItem>
      </Breadcrumb>
      <span class="title">服饰</span>
      <Row>
        <Col span="1"></Col>
        <Col span="22">
          <span class="title2">分类筛选</span>
          <article class="Detail-center">
            <Menu active-name="1-2" :open-names="['1']">
              <Submenu name="2">
                <template slot="title">
                  <Icon type="ios-filing" />
                    上衣
                </template>
                <MenuItem name="2-1">外套</MenuItem>
                <MenuItem name="2-2">短袖</MenuItem>
                <MenuItem name="2-3">长袖</MenuItem>
                <MenuItem name="2-4">羽绒</MenuItem>
              </Submenu>
              <Submenu name="4">
                <template slot="title">
                  <Icon type="ios-cog" />
                  Navigation Three
                </template>
                <MenuItem name="4-1">Option 9</MenuItem>
                <MenuItem name="4-2">Option 10</MenuItem>
                <MenuItem name="4-3">Option 11</MenuItem>
                <MenuItem name="4-4">Option 12</MenuItem>
              </Submenu>
            </Menu>
            <article>
              <!-- 筛选框 -->
              <div class="Classification">
                <ul class="Classification-ul">
                  <li>
                    <span class="iconfont-shopping shop-shangjia"></span
                    >最新上架
                  </li>
                  <li>
                    <span
                      class="iconfont-shopping shop-shangpinxiaoliangpaihang"
                    ></span
                    >销量优先
                  </li>
                  <li>
                    <span class="iconfont-shopping shop-pinglun"></span>评论最多
                  </li>
                  <li>
                    <span class="iconfont-shopping shop-paixu"></span>价格排序
                  </li>
                </ul>
              </div>
              <!-- 商品列表展示 -->
              <div class="shopping-box">
                <div class="box-list">
                  <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    alt=""
                    width="100%"
                  />
                  <div class="shopping-text">
                    <p>嘉筱加绒连帽卫衣</p>
                    <p>
                      男学生港风潮流字母印花长袖衣服男 白色加绒 XL 120斤-140斤
                    </p>
                    <p>
                      <span class="iconfont-shopping shop-jiage"></span>99.00
                    </p>
                  </div>
                </div>
                <div class="box-list">
                  <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    alt=""
                    width="100%"
                  />
                  <div class="shopping-text">
                    <p>嘉筱加绒连帽卫衣</p>
                    <p>
                      男学生港风潮流字母印花长袖衣服男 白色加绒 XL 120斤-140斤
                    </p>
                    <p>
                      <span class="iconfont-shopping shop-jiage"></span>99.00
                    </p>
                  </div>
                </div>
                                  <div class="box-list">
                      <img v-lazy="require('../assets/images/shopping/DM_20211115203702_017.png')" alt="" width="100%">
                      <div class="shopping-text">
                          <p>嘉筱加绒连帽卫衣</p>
                          <p>男学生港风潮流字母印花长袖衣服男 白色加绒 XL 120斤-140斤</p>
                          <p><span class="iconfont-shopping shop-jiage"></span>99.00</p>
                      </div>
                  </div>
                                                  <div class="box-list">
                      <img v-lazy="require('../assets/images/shopping/DM_20211115203702_017.png')" alt="" width="100%">
                      <div class="shopping-text">
                          <p>嘉筱加绒连帽卫衣</p>
                          <p>男学生港风潮流字母印花长袖衣服男 白色加绒 XL 120斤-140斤</p>
                          <p><span class="iconfont-shopping shop-jiage"></span>99.00</p>
                      </div>
                  </div>

                                                                    <div class="box-list">
                      <img v-lazy="require('../assets/images/shopping/DM_20211115203702_017.png')" alt="" width="100%">
                      <div class="shopping-text">
                          <p>嘉筱加绒连帽卫衣</p>
                          <p>男学生港风潮流字母印花长袖衣服男 白色加绒 XL 120斤-140斤</p>
                          <p><span class="iconfont-shopping shop-jiage"></span>99.00</p>
                      </div>
                  </div>
              </div>

            </article>
          </article>
        </Col>
        <Col span="1"></Col>
      </Row>
    </article>
    <!-- 尾部 -->
    <footers></footers>
  </article>
</template>
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
<style scoped lang="less">
@import "../assets/css/Shopping-DetailList.less";
</style>