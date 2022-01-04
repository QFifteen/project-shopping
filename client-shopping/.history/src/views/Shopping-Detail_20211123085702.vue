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
                  Navigation Two
                </template>
                <MenuItem name="2-1">Option 5</MenuItem>
                <MenuItem name="2-2">Option 6</MenuItem>
                <Submenu name="3">
                  <template slot="title">Submenu</template>
                  <MenuItem name="3-1">Option 7</MenuItem>
                  <MenuItem name="3-2">Option 8</MenuItem>
                </Submenu>
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
                  <div><img v-lazy="require('../assets/images/photo.png')" alt=""></div>
                  <div>x</div>
                  <div>x</div>
                  <div>x</div>
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
@import "../assets/css/Shopping-Detail.less";
</style>