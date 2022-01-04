<template>
  <article>
    <Home-nav></Home-nav>
    <!-- 正文-个人信息 -->
    <article>
      <Row>
        <Col span="1"></Col>
        <Col span="22">
          <Row>
            <Col span="5">
            <!-- 筛选 -->
              <div class="Userimg">
                <img
                  v-lazy="require('../assets/images/logo/shiwu.jpg')"
                  alt=""
                />
                <p>十五</p>
              </div>
              <Menu theme='light' active-name="1">
                <MenuGroup title="信息管理">
                  <MenuItem name="1" @click="$router.push({path:'/cinema_details',query:{cinemaid:item.cinemaid}})">
                  <icon class="iconfont-shopping shop-zhanghu" />
                    个人信息
                  </MenuItem>
                  <MenuItem name="2">
                    <Icon class="iconfont-shopping shop-dingdan" />

                    订单信息
                  </MenuItem>
                    <MenuItem name="3">
                    <Icon class="iconfont-shopping shop-lishijilu" />
                    历史记录
                  </MenuItem>
                    <MenuItem name="4">
                    <Icon class="iconfont-shopping shop-gerenzhongxinwodeshoucang" />
                    我的收藏
                  </MenuItem>
                    <MenuItem name="5">
                    <Icon class="iconfont-shopping shop-wodepinglun" />
                    我的评论
                  </MenuItem>
                </MenuGroup>
                <MenuGroup title="信息操作">
                  <MenuItem name="6">
                    <Icon class="iconfont-shopping shop-xiugaimima" />
                    修改密码
                  </MenuItem>
                  <MenuItem name="7">
                    <Icon class="iconfont-shopping shop-shezhi" />
                    个人设置
                  </MenuItem>
                </MenuGroup>
                <MenuGroup title="统计分析">
                  <MenuItem name="8">
                    <Icon class="iconfont-shopping shop-fenxi" />
                    喜好分析
                  </MenuItem>
                  <MenuItem name="9">
                    <Icon class="iconfont-shopping shop-tongji" />
                    购买频率
                  </MenuItem>
                </MenuGroup>
              </Menu>
            </Col>
            <Col span="19">
              <!-- 路由入口 -->
              <router-view></router-view>
            </Col>
          </Row>
        </Col>
        <Col span="1"></Col>
      </Row>
    </article>
    <footers></footers>
  </article>
</template>
<style lang="less" scoped>
@import "../assets/css/User.less";
@import "../assets/font_2946158_istdw5rzs9/iconfont.css";
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