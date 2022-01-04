<!--  <div style="width:100%;text-align:center;margin-top:20px;">-->
<!--    <img v-lazy="require('../../assets/images/logo/logo2.svg')" alt=""  align="absmiddle"  class="admin_logo" >-->
<!--    <span class="admin_title">伍蒙-Admin</span>-->
<!--  </div>-->

<style scoped lang="less">
@import "../../assets/css/admin/admin_home";
</style>
<template>
  <div class="layout">
    <Layout :style="{minHeight: '100vh'}">
      <Sider ref="side1" hide-trigger collapsible :collapsed-width="78" v-model="isCollapsed">
        <div style="width:100%;text-align:center;margin-top:20px;">
          <img v-lazy="require('../../assets/images/logo/logo2.svg')" alt="" align="absmiddle" class="admin_logo">
          <span class="admin_title">Admin</span>
        </div>
        <Menu :active-name="$route.path" theme="dark" width="auto" :class="menuitemClasses">
          <Submenu name="1" style="margin-top: 20px;">
            <template slot="title">
              <Icon class="iconfont-shopping shop-kongzhitai titile"></Icon>
              <span class="titile">控制台</span>
            </template>
            <MenuItem name="/admin_home/admin_main" to="/admin_home/admin_main">主控台</MenuItem>
            <MenuItem name="/admin_home/admin_work" to="/admin_home/admin_work">工作台</MenuItem>
          </Submenu>

          <Submenu name="2">
            <template slot="title">
              <Icon class="iconfont-shopping shop-yonghuguanli"></Icon>
              <span class="titile">用户管理</span>
            </template>
            <MenuItem name="/admin_home/userlist" to="/admin_home/userlist">用户信息</MenuItem>
            <MenuItem name="/admin_home/administrator" to="/admin_home/administrator">管理员信息</MenuItem>
            <MenuItem name="/admin_home/user_visualize" to="/admin_home/user_visualize">用户可视化</MenuItem>
          </Submenu>

          <Submenu name="3">
            <template slot="title">
              <Icon class="iconfont-shopping shop-shangpinguanli"></Icon>
              <span class="titile">商品管理</span>
            </template>
            <MenuItem name="/admin_home/shopping" to="/admin_home/shopping">商品信息</MenuItem>
            <!--            <MenuItem name="3-2" to="/admin_home/shopping_stock">商品量存可视化</MenuItem>-->
          </Submenu>

          <Submenu name="4">
            <template slot="title">
              <Icon class="iconfont-shopping shop-dingdanguanli"></Icon>
              <span class="titile">订单管理</span>
            </template>
            <MenuItem name="/admin_home/order" to="/admin_home/order">用户订单信息</MenuItem>
          </Submenu>

          <Submenu name="5">
            <template slot="title">
              <Icon class="iconfont-shopping shop-pinglunguanli"></Icon>
              <span class="titile">评论管理</span>
            </template>
            <MenuItem name="/admin_home/comment" to="/admin_home/comment">评论信息</MenuItem>
            <MenuItem name="/admin_home/comment_visualize" to="/admin_home/comment_visualize">评论信息可视化</MenuItem>
          </Submenu>

          <Submenu name="6">
            <template slot="title">
              <Icon class="iconfont-shopping shop-lunbotu"></Icon>
              <span class="titile">轮播图管理</span>
            </template>
            <MenuItem name="/admin_home/banner" to="/admin_home/banner">图片管理</MenuItem>
          </Submenu>

          <MenuItem name="/admin_home/project" to="/admin_home/project">
            <Icon class="iconfont-shopping shop-xiangmuxinxi"></Icon>
            <span>项目信息</span>
          </MenuItem>

          <MenuItem name="/admin_home/about" to="/admin_home/about">
            <Icon class="iconfont-shopping shop-bangzhuguanyuwomen"></Icon>
            <span>关于</span>
          </MenuItem>
        </Menu>
      </Sider>
      <Layout>
        <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
          <div class="head-icon">
            <Icon @click.native="collapsedSider" :class="rotateIcon" class="iconfont-shopping shop-shousuo"
                  size="20"></Icon>
            <icon class="iconfont-shopping shop-shuaxin" style="font-size: 20px;margin-left: 15px;"></icon>

            <icon class="iconfont-shopping shop-gitee2 head-icon1"></icon>
            <icon class="iconfont-shopping shop-github head-icon2"></icon>
            <img v-lazy="require('../../assets/images/logo/shiwu.jpg')" alt="" class="head-icon4">
            <icon class="iconfont-shopping shop-shezhi2 head-icon3"></icon>
          </div>
        </Header>

        <Content style="padding: 5px">
          <div style="display: flex">
            <div v-for="(item,index) in roulist" :key="index" class="admin-nav" @click="$router.push({path:item.path})">
              <span >{{ item.name }}</span>
              <icon class="iconfont-shopping shop-cuowutishilimiandecha" style="margin-left: 10px;"></icon>
            </div>
          </div>
          <router-view></router-view>
        </Content>
      </Layout>
    </Layout>
  </div>
</template>
<script>
import {mapState} from 'vuex';
export default {
  data() {
    return {
      isCollapsed: false,
      roulist: [],
    };
  },

  computed: {
    rotateIcon() {
      return [
        'menu-icon',
        this.isCollapsed ? 'rotate-icon' : ''
      ];
    },
    menuitemClasses: function () {
      return [
        'menu-item',
        this.isCollapsed ? 'collapsed-menu' : ''
      ]
    },
    ...mapState(['administrator'])
  },
  methods: {
    collapsedSider() {
      this.$refs.side1.toggleCollapse();
    },
    filt() {
      // for (let i in this.roulist){
      // let arr = this.roulist.filter(ele => ele.name === this.roulist[i].name);
      // console.log(arr);
      // }
      //去重
      let set = new Set(this.roulist);
      this.roulist = Array.from(set);
    }
  },
  created() {
    this.list = this.$route.meta.menu;

    // console.log(this.list[0].name);
    // for (let i=0;i<this.list.length;i++){
    //   this.roulist[i] = this.list[i];
    // }
  },
  watch: {
    $route() {   // 监听路由变化
      this.list = []
      this.list = this.$route.meta.menu;
      // console.log(this.$route.meta.menu[0]);
      this.roulist.push(this.$route.meta.menu[0]);
      // console.log(this.roulist);
      this.filt();
    },

  },
}
</script>
