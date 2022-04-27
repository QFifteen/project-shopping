<template>
  <div>
    <Affix>
      <nav class="nav" ref="nv">
        <Row type="flex" align="middle" class="rowstyle">
          <Col span="2">
            <img
                v-lazy="require('../assets/images/logo/logo.svg')"
                alt=""
                width="45px"
                height="45px"
                style="cursor:pointer;"
                @click="$router.push('/diversity')"
            />
          </Col>
          <Col span="1"><span @click="$router.push('/diversity')" class="router-text">聚合</span></Col>
          <Col span="1" ><span @click="$router.push('/category')" class="router-text">分类</span></Col>
          <Col span="1" ><span @click="$router.push('/DetailList')" class="router-text">精选</span></Col>
          <Col span="2">潮流风向</Col>
          <Col span="2">最新发售</Col>
          <Col span="5"></Col>
          <Col span="4"><Input search placeholder="Enter something..."/></Col>
          <Col span="2"
          >
            <Poptip placement="top" width="400" trigger="hover">
              <span class="iconfont-shopping shop-htmal5icon29" style="cursor:pointer;"></span><span
                style="cursor:pointer;">我的购物车</span>
              <div slot="content">
                <Tabs value="name1">
                  <TabPane label="全部" name="name1">
                    <Row type="flex" class="Car_title">
                      <Col :span="6" class="Car_title">
                        <img src="../assets/images/shopping/cheshi5.jpg" alt="" width="70%">
                      </Col>
                      <Col :span="18" style="text-align: left;" class="Car_title">
                        <div class="Car_title2">
                          <p>航海日志反光短袖t恤</p>
                          <p class="title_p">尺码:L</p>
                          <p class="title_p">数量:2 & 价格:29.90</p>
                          <p class="title_p">02-26 12:33:40</p>
                        </div>
                      </Col>
                    </Row>

                  </TabPane>
                  <TabPane label="未付款" name="name2">
                    <Row type="flex" class="Car_title">
                      <Col :span="6" class="Car_title">
                        <img src="../assets/images/shopping/DM_20211115203702_017.png" alt="" width="70%">
                      </Col>
                      <Col :span="18" style="text-align: left;" class="Car_title">
                        <div class="Car_title2">
                          <p>雅鹿冬装加厚羽绒服dsda冬装加</p>
                          <p class="title_p">尺码:L</p>
                          <p class="title_p">数量:2 & 价格:29.90</p>
                          <p class="title_p">02-26 12:33:40</p>
                        </div>
                      </Col>
                    </Row>
                  </TabPane>
                  <TabPane label="已付款" name="name3">
                    <Row type="flex" class="Car_title">
                      <Col :span="6" class="Car_title">
                        <img src="../assets/images/shopping/DM_20211115203702_017.png" alt="" width="70%">
                      </Col>
                      <Col :span="18" style="text-align: left;" class="Car_title">
                        <div class="Car_title2">
                          <p>雅鹿冬装加厚羽绒服dsda冬装加</p>
                          <p class="title_p">尺码:L</p>
                          <p class="title_p">数量:2 & 价格:29.90</p>
                          <p class="title_p">02-26 12:33:40</p>
                        </div>
                      </Col>
                    </Row>
                  </TabPane>
                </Tabs>
              </div>
            </Poptip>
          </Col
          >
          <Col span="2">
            <Poptip placement="top" width="300" trigger="hover">
              <Avatar icon="ios-person" class="img_user" :src="UserList.img"/>
              <div slot="content">
                <p class="User_title">{{ UserList.name }}</p>
                <p class="User_title2">
                  <Icon class="iconfont-shopping shop-qianming"></icon>
                  :{{ UserList.address }}
                </p>
                <p style="margin-top:10px;">等级:{{ UserList.status }}级</p>
                <Progress :percent="90" :stroke-color="['#108ee9', '#87d068']" :stroke-width="3"/>

                <List :border="false" :split="false">
                  <div @click="$router.push('/User/UserInformation')">
                    <ListItem class="item_list">
                      <icon class="iconfont-shopping shop-zhanghaodenglu"></icon>
                      <span class="User_tit">个人首页</span> <i class="iconfont-shopping shop-youjiantou1"
                                                            style="margin-left: 160px;"></i></ListItem>
                  </div>
                  <div @click="$router.push('/User/Order')">
                    <ListItem class="item_list">
                      <Icon class="iconfont-shopping shop-dingdanzhongxin"></icon>
                      <span class="User_tit">订单中心</span> <i class="iconfont-shopping shop-youjiantou1"
                                                            style="margin-left: 160px;"></i></ListItem>
                  </div>
                  <div @click="$router.push('/User/User_history')">
                    <ListItem class="item_list">
                      <Icon class="iconfont-shopping shop-lishijilu_o"></icon>
                      <span class="User_tit">历史记录</span> <i class="iconfont-shopping shop-youjiantou1"
                                                            style="margin-left: 160px;"></i></ListItem>
                  </div>
                  <div @click="$router.push('/User/UserInformation')">
                    <ListItem class="item_list">
                      <Icon class="iconfont-shopping shop-shoucang"></icon>
                      <span class="User_tit">我的收藏</span> <i class="iconfont-shopping shop-youjiantou1"
                                                            style="margin-left: 160px;"></i></ListItem>
                  </div>
                  <Divider size="small"/>
                  <div @click="exit()">
                    <ListItem class="item_list">
                      <Icon class="iconfont-shopping shop-tuichudenglu"></icon>
                      <span class="User_tit">退出登录</span> <i class="iconfont-shopping shop-youjiantou1"
                                                            style="margin-left: 160px;"></i></ListItem>
                    <Modal
                        title="退出登录"
                        v-model="modal9"
                        @on-ok="User_exit"
                        :styles="{top: '20px'}">
                      <p>您确定要退出当前账号吗</p>
                    </Modal>
                  </div>

                </List>
              </div>
            </Poptip>
          </Col>
          <Col span="2">退出|注销</Col>
        </Row>
      </nav>
    </Affix>

  </div>
</template>
<script>

export default {
  name: "home-nav",
  data() {
    return {
      modal9: false,
      UserList: {}
    };
  },
  methods: {
    exit() {
      this.modal9 = true;
    },
    User_exit() {
      this.$router.push('/');
      localStorage.clear();
    },
    Usershow() {
      this.UserList.name = localStorage["user_name"];
      this.UserList.address = localStorage["user_address"];
      this.UserList.img = localStorage["user_img"];
      this.UserList.status = localStorage["user_status"];
    }
  },
  created() {
    this.Usershow();
  }

};
</script>
<style scoped lang="less">
@import "../assets/css/Home-nav.less";
</style>
