<template>
  <div class="login">
    <!-- 封面、登录部分 -->
    <template class="loginCover">
      <nav>
        <Row type="flex" align="middle" class="navlogo" justify="center">
          <Col span="15" class="navcol">
            <img v-lazy="require('../assets/images/logo/logo.svg')" alt="" />
          </Col>
          <Col span="2">
            <p>品牌介绍</p>
          </Col>
          <Col span="2">
            <p>时尚追寻</p>
          </Col>
          <Col span="2">
            <p>关于我们</p>
          </Col>
          <Col span="2">
            <p>更多</p>
          </Col>
        </Row>
      </nav>
      <article class="Cover">
        <Row>
          <Col span="14"
            ><div class="Covertext">
              <span class="logotext">forever Young</span>
              <p class="logotext2">selection of young people</p>
              <p class="logotext3">Fashion brand!!</p>
              <button class="btn-grad" @click="modal1 = true">
                <span class="iconfont-shopping shop-daohang"></span>点击登录
              </button>
              <Modal v-model="modal1" width="800">
                <div style="text-align: center">
                  <Row>
                    <Col span="8"
                      ><img
                        v-lazy="require('../assets/images/login/loginimg.png')"
                        alt=""
                        width="100%"
                    /></Col>
                    <Col span="15" push="1">
                      <Tabs value="name1">
                        <Tab-pane label="标签一" name="name1">
                          <div class="modal-login">
                            <p class="model-logintext">登录账号</p>
                            <Form
                              ref="formCustom"
                              :model="formCustom"
                              :rules="ruleCustom"
                              :label-width="60"
                              style="margin-top: 30px"
                            >
                              <FormItem label="账号：" prop="passwd" >
                                <Input type="password" placeholder="请输入账号..."></Input>
                              </FormItem>
                              <FormItem label="密码：" prop="passwdCheck">
                                <Input type="password" placeholder="请输入密码"></Input>
                              </FormItem>
                                <a href="">ddd</a>

                              <FormItem>
                                <Button type="success" long class="formbut"
                                  >立即登录</Button
                                >
                                <Button
                                  type="error"
                                  long
                                  class="formbut"
                                  style="
                                    background: #808695;
                                    border: 1px solid #808695;
                                    margin-top:15px;
                                  "
                                  >重置</Button
                                >
                              </FormItem>
                            </Form>
                          </div>
                        </Tab-pane>
                        <Tab-pane label="标签二" name="name2"
                          >标签二的内容</Tab-pane
                        >
                      </Tabs>
                    </Col>
                  </Row>
                </div>
                <div slot="footer">
                  <Button type="error">取消</Button>
                </div>
              </Modal>

              <button class="btn-grad">
                <span class="iconfont-shopping shop-lejiexiangqingicon"></span
                >了解品牌
              </button>
              <div class="bottomtext">
                <Row type="flex" style="height: 100%" align="middle">
                  <Col span="12"
                    ><p>伍蒙服饰时尚电商</p>
                    <p>打造潮流品牌</p></Col
                  >
                  <Col span="12"
                    ><p>成为会员，体验极致时尚</p>
                    <p>年轻人的衣柜</p></Col
                  >
                </Row>
              </div>
            </div></Col
          >
          <Col span="10">
            <img
              v-lazy="require('../assets/images/login/Cover.jpeg')"
              alt=""
              width="70%"
              style="margin-left: 50px"
            />
          </Col>
        </Row>
      </article>
    </template>
    <!-- 下部分 -->
    <template>
      <Row>
        <Col span="1">&nbsp;</Col>
        <Col span="22">
          <section class="bottomall">
            <div>
              <Row type="flex" justify="center">
                <Col span="12">
                  <div class="bottomtext1">
                    <p>第一眼，看见你的与众不同</p>
                    <p class="bottomzhengwen">嘿！时尚</p>
                    <p class="bottomzhengwen">嘿！年轻</p>
                    <p class="bottomzhengwen">个性化推荐，用态度决定一切。</p>
                    <p class="bottomzhengwen">
                      从时尚出发，艺术从来不用拘束于人。
                    </p>
                    <p class="bottomzhengwen">
                      服饰艺术在哪里？在大胆不被人审美所看好的地方
                    </p>
                  </div>
                </Col>
                <Col span="12">
                  <img
                    v-lazy="require('../assets/images/fy18b.jpg')"
                    alt=""
                    width="100%"
                  />
                </Col>
              </Row>
            </div>

            <div class="illustration">
              <Row type="flex" justify="center">
                <Col span="6">
                  <img
                    v-lazy="require('../assets/images/illustration1.png')"
                    alt=""
                    width="30%"
                  />
                  <p class="illustration-title">从时尚出发</p>
                </Col>
                <Col span="6">
                  <img
                    v-lazy="require('../assets/images/illustration3.png')"
                    alt=""
                    width="31%"
                  />
                  <p class="illustration-title">从个性出发</p>
                </Col>
                <Col span="6"
                  ><img
                    v-lazy="require('../assets/images/illustration2.png')"
                    alt=""
                    width="28%"
                  />
                  <p class="illustration-title">记录美好时刻</p>
                </Col>
                <Col span="6"
                  ><img
                    v-lazy="require('../assets/images/illustration4.png')"
                    alt=""
                    width="28%"
                  />
                  <p class="illustration-title">我的最帅自拍</p>
                </Col>
              </Row>
            </div>

            <section style="margin-top: 60px">
              <div class="bottom-img">
                <Row type="flex" align="middle">
                  <Col span="12">
                    <img
                      v-lazy="require('../assets/images/kv4.png')"
                      width="100%"
                    />
                  </Col>
                  <Col span="12">
                    <p class="bottom-text">灰色空间搭配，营造朦胧柔性</p>
                    <p class="bottom-text2">______最新主题单品</p>
                  </Col>
                </Row>
              </div>
              <div class="bottom-img">
                <Row type="flex" align="middle">
                  <Col span="12">
                    <p class="bottom-text" style="margin-left: 150px">
                      点缀光亮，简约时尚单品
                    </p>
                    <p class="bottom-text2" style="margin-left: 435px">
                      最新主题单品______
                    </p>
                  </Col>
                  <Col span="12">
                    <img
                      v-lazy="require('../assets/images/kv5.png')"
                      width="100%"
                    />
                  </Col>
                </Row>
              </div>
            </section>
            <section style="margin-top: 60px">
              <h1>更多展品推荐</h1>
              <Row>
                <Col span="12">
                  <img
                    v-lazy="require('../assets/images/kv3.png')"
                    width="95%"
                  />
                </Col>
                <Col span="6">
                  <img
                    v-lazy="require('../assets/images/photo.png')"
                    width="95%"
                  />
                </Col>
                <Col span="6">
                  <img
                    v-lazy="
                      require('../assets/images/pexels-photo-9502661.jpeg')
                    "
                    width="100%"
                  />
                </Col>
              </Row>
            </section>
            <hr />
          </section>
        </Col>
        <Col span="1">&nbsp;</Col>
      </Row>
    </template>
    <foot></foot>
  </div>
</template>
<style scoped lang="less">
@import "../assets/css/nav.less";
@import "../assets/font_2946158_istdw5rzs9/iconfont.css";
</style>

<script>
import foot from "../components/footer.vue";

export default {
  name: "nav",
  data() {
    return {
      modal1: false,
    };
  },
  methods: {},
  create() {},
  components: {
    foot,
  },
};
</script>
