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
              <Menu :theme="theme3" active-name="1">
                <MenuGroup title="信息管理">
                  <MenuItem name="1">
                    <Icon type="md-document" />
                    个人信息
                  </MenuItem>
                  <MenuItem name="2">
                    <Icon type="md-chatbubbles" />
                    订单信息
                  </MenuItem>
                    <MenuItem name="3">
                    <Icon type="md-chatbubbles" />
                    历史记录
                  </MenuItem>
                    <MenuItem name="4">
                    <Icon type="md-chatbubbles" />
                    我的收藏
                  </MenuItem>
                </MenuGroup>
                <MenuGroup title="信息操作">
                  <MenuItem name="5">
                    <Icon type="md-heart" />
                    修改密码
                  </MenuItem>
                  <MenuItem name="5">
                    <Icon type="md-leaf" />
                    个人设置
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