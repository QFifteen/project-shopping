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

            <Menu active-name="1-2" :open-names="['1']" style="z-index:1;">
              <Submenu name="2">
                <template slot="title">
                  <Icon type="ios-filing" />
                    衣服
                </template>
                <MenuItem name="2-1">外套</MenuItem>
                <MenuItem name="2-2">短袖</MenuItem>
                <MenuItem name="2-3">长袖</MenuItem>
                <MenuItem name="2-4">羽绒</MenuItem>
              </Submenu>
              <Submenu name="4">
                <template slot="title">
                  <Icon type="ios-cog" />
                  裤子
                </template>
                <MenuItem name="4-1">品牌特售</MenuItem>
                <MenuItem name="4-2">流行元素</MenuItem>
                <MenuItem name="4-3">小众独爱</MenuItem>
                <MenuItem name="4-4">人气精选</MenuItem>
              </Submenu>
              <Submenu name="4">
                <template slot="title">
                  <Icon type="ios-cog" />
                  帽子
                </template>
                <MenuItem name="4-1">品牌特售</MenuItem>
                <MenuItem name="4-2">流行元素</MenuItem>
                <MenuItem name="4-3">小众独爱</MenuItem>
                <MenuItem name="4-4">人气精选</MenuItem>
              </Submenu>
              <Submenu name="4">
                <template slot="title">
                  <Icon type="ios-cog" />
                  其他
                </template>
                <MenuItem name="4-1">品牌特售</MenuItem>
                <MenuItem name="4-2">流行元素</MenuItem>
                <MenuItem name="4-3">小众独爱</MenuItem>
                <MenuItem name="4-4">人气精选</MenuItem>
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
                      require('../assets/images/shopping/cheshi1.jpg')
                    "
                    alt=""
                    width="100%"
                  />
                  <div class="shopping-text">
                    <p>南极人短袖T恤男纯棉</p>
                    <p>
                      韩版圆领潮流印花宽松透气学生休闲夏天衣服大码半截袖男 中灰
                    </p>
                    <p class="price_shopping">
                      <span class="iconfont-shopping shop-jiage"></span>75.00
                    </p>
                  </div>
                </div>
                <div class="box-list">
                  <img
                    v-lazy="
                      require('../assets/images/shopping/cheshi3.jpg')
                    "
                    alt=""
                    width="100%"
                  />
                  <div class="shopping-text">
                    <p>ec超火的卫衣男学生秋季</p>
                    <p>
                      韩版宽松bf慵懒风圆领笑脸印花休闲上衣潮流百搭帅气长袖打底衫男装外套 白色                    </p>
                    <p class="price_shopping">
                      <span class="iconfont-shopping shop-jiage"></span>89.00
                    </p>
                  </div>
                </div>
                                  <div class="box-list">
                      <img v-lazy="require('../assets/images/shopping/cheshi2.jpg')" alt="" width="100%">
                      <div class="shopping-text">
                          <p>奢号 短袖t恤男士</p>
                          <p>宽松潮流韩版青少年学生卡通笑脸印花半截袖男装2021新款体恤夏季五分袖上衣</p>
                          <p class="price_shopping"><span class="iconfont-shopping shop-jiage"></span>38.00</p>
                      </div>
                  </div>
                                                  <div class="box-list">
                      <img v-lazy="require('../assets/images/shopping/cheshi4.jpg')" alt="" width="100%">
                      <div class="shopping-text">
                          <p>航海日志短袖男士t恤</p>
                          <p>韩版潮宽松体恤2022新款T恤男上衣夏季纯棉港风打底衫 </p>
                          <p class="price_shopping"><span class="iconfont-shopping shop-jiage"></span>59.00</p>
                      </div>
                  </div>

                                                                    <div class="box-list">
                      <img v-lazy="require('../assets/images/shopping/DM_20211115203702_017.png')" alt="" width="100%">
                      <div class="shopping-text">
                          <p>嘉筱加绒连帽卫衣</p>
                          <p>男学生港风潮流字母印花长袖衣服男 白色加绒 XL 120斤-140斤</p>
                          <p class="price_shopping"><span class="iconfont-shopping shop-jiage"></span>99.00</p>
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
