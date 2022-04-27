<template>
  <div class="login">
    <!-- 封面、登录部分 -->
    <template class="loginCover">
      <nav>
        <Row type="flex" align="middle" class="navlogo" justify="center">
          <Col span="15" class="navcol">
            <img v-lazy="require('../assets/images/logo/logo.svg')" alt=""/>
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
          >
            <div class="Covertext">
              <span class="logotext">forever Young</span>
              <p class="logotext2">selection of young people</p>
              <p class="logotext3">Fashion brand!!</p>
              <button class="btn-grad" @click="modal1 = true">
                <span class="iconfont-shopping shop-daohang"></span>点击登录
              </button>
              <Modal v-model="modal1" width="800" class-name="vertical-center-modal" footer-hide>
                <div>
                  <Row>
                    <Col span="8"
                    ><img
                        v-lazy="require('../assets/images/login/loginimg.jpg')"
                        alt=""
                        width="100%"
                        style="margin-top:20px;"
                    /></Col>
                    <Col span="15" push="1">
                      <Tabs v-model="tabname.name">
                        <Tab-pane label="登录账号" name="name1">
                          <div class="modal-login">
                            <p class="model-logintext"><span class="iconfont-shopping shop-denglu"></span>登录账号</p>
                            <Form
                                ref="formCustom"
                                :label-width="60"
                                style="margin-top: 30px"
                            >
                              <FormItem label="账号：" prop="passwd">
                                <Input
                                    type="text"
                                    placeholder="请输入账号..."
                                    v-model="formCustom.user"
                                >
                                  <Icon class="iconfont-shopping shop-zhanghaodenglu" slot="prefix"/>
                                </Input>
                              </FormItem>
                              <FormItem label="密码：" prop="passwdCheck">
                                <Input
                                    type="password"
                                    password
                                    placeholder="请输入密码"
                                    v-model="formCustom.pass"
                                >
                                  <Icon class="iconfont-shopping shop-mima" slot="prefix"/>
                                </Input>
                                <a @click="register" style="margin-left: 285px"
                                >没有账号？立即注册</a
                                >
                              </FormItem>
                              <FormItem>
                                <Button type="success" long class="formbut" @click="Userlogin"
                                >立即登录
                                </Button
                                >
                                <Button
                                    type="error"
                                    long
                                    class="formbut"
                                    style="
                                    background: #808695;
                                    border: 1px solid #808695;
                                    margin-top: 15px;
                                  "
                                    @click="loginReset"
                                >重置
                                </Button
                                >
                              </FormItem>
                            </Form>
                            <span class="login-remark"
                            >当您登录后表明您已接受本网站访问政策，我们将实时保护您的隐私安全</span
                            >
                          </div>
                        </Tab-pane>
                        <Tab-pane label="注册账号" name="name2">
                          <Form
                              ref="formValidate"
                              :label-width="75"
                          >
                            <p class="model-logintext"><span class="iconfont-shopping shop-zhucetianjiahaoyou"></span>注册账号
                            </p>
                            <FormItem label="用户名:" prop="name" style="margin-top:10px;">
                              <Input
                                  v-model="formValidate.name"
                                  placeholder="请输入用户名,5-12个以字母开头、可带数字、“_”、“.”"
                              >
                                <Icon class="iconfont-shopping shop-zhanghaodenglu" slot="prefix"/>
                              </Input>
                            </FormItem>
                            <FormItem label="邮箱:" prop="email">
                              <Input
                                  v-model="formValidate.email"
                                  placeholder="请输入邮箱"
                              >
                                <Icon class="iconfont-shopping shop-youxiang" slot="prefix"/>
                              </Input>
                            </FormItem>
                            <FormItem label="密码:" prop="pass">
                              <Input
                                  v-model="formValidate.pass"
                                  placeholder="请输入密码,由6-15个数字组成"
                              >
                                <Icon class="iconfont-shopping shop-mima" slot="prefix"/>
                              </Input>
                            </FormItem>
                            <FormItem label="重复密码:" prop="pass">
                              <Input
                                  v-model="formValidate.pass2"
                                  placeholder="请再次输入密码"
                              >
                                <Icon class="iconfont-shopping shop-mima" slot="prefix"/>
                              </Input>
                            </FormItem>
                            <FormItem label="性别:" prop="gender">
                              <RadioGroup v-model="formValidate.gender">
                                <Radio label="男士">男士</Radio>
                                <Radio label="女士">女士</Radio>
                              </RadioGroup>
                            </FormItem>
                            <FormItem>
                              <Button type="success" long class="formbut" style="height:40px"
                                      @click="Userregister"
                              >立即注册
                              </Button
                              >
                            </FormItem>
                          </Form>
                        </Tab-pane>
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
            </div>
          </Col
          >
          <Col span="10">
            <img  v-lazy="require('../assets/images/login/Cover2.jpeg')" alt="" style="position:absolute; transform: rotate(10deg);bottom: 20px;left:20px;border-radius: 10px;opacity: .9;
" width="30%">
            <img  v-lazy="require('../assets/images/login/img.png')" alt="" style="position:absolute; transform: rotate(-5deg);right:110px;top:20px;border-radius: 10px;opacity: .6;
" width="30%">
            <img
                v-lazy="require('../assets/images/login/Cover.jpeg')"
                alt=""
                width="66%"
                style="margin-left: 50px;"
            />
            <div class="img_text">
              <icon class="iconfont-shopping shop-taiyang"></icon>
              <span>—————————————  伍蒙  ——————————————</span>
              <icon class="iconfont-shopping shop-yueliang"></icon>
            </div>
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
            <hr/>
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
</style>

<script>
import foot from "../components/footer.vue";
import {login,useradd} from "../API/api";

// //账号登录正则:只能输入5-12个以字母开头、可带数字、“_”、“.”的字串
// var patrn_name =/^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,11}$/;
// //Email正则
// var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
// //密码正则:全由数字组成,由6-15个数字组成
// var patrn_pass =/^[0-9]{5,14}$/;

export default {
  data() {
    return {
      modal1: false,
      tabname: {
        name:"name1"
      },
      formCustom: {

      },
      formValidate: {
        gender:'男士'
      },
    };
  },
  methods: {
    register() {
      this.tabname.name = "name2";
    },
    register2() {
      this.tabname.name = "name1";
    },
    //登录
    Userlogin() {
      if (this.formCustom.user === undefined) {
        this.$Message.error('账号不能为空');
      } else if (this.formCustom.pass === undefined) {
        this.$Message.error('密码不能为空');
      } else if (!this.$store.state.patrn_name.exec(this.formCustom.user)) {
        this.$Message.error("登录失败,账号只能输入5-12个以字母开头、可带数字、“_”、“.”的字串!!");
      } else if (!this.$store.state.patrn_pass.exec(this.formCustom.pass)) {
        this.$Message.error("登录失败,密码只能为数字且由6-15个数字组成!!");
      } else {
        // 登录
        login({
          User_name: this.formCustom.user,
          User_pass: this.formCustom.pass
        }).then(res => {
          if (res.data == "") {
            this.$Message.error('账户或密码错误，请重新输入');
          } else {
            this.$Message.success("登录成功，将在2秒后跳转到主页面");
            setTimeout(() => {
              this.$router.push({path: '/diversity'});
            }, 2000);
            // console.log(res.data);
            this.$store.state.Userinformation.user_id = localStorage["user_id"] = res.data.user_id;//id
            this.$store.state.Userinformation.user_name = localStorage["user_name"] = res.data.user_name;//名称
            this.$store.state.Userinformation.user_pass = localStorage["user_pass"] = res.data.user_pass;//密码
            this.$store.state.Userinformation.user_gender = localStorage["user_gender"] = res.data.user_gender;//性别
            this.$store.state.Userinformation.user_email = localStorage["user_email"] = res.data.user_email;//邮箱
            this.$store.state.Userinformation.user_img = localStorage["user_img"] = res.data.user_img;//头像
            this.$store.state.Userinformation.user_intro = localStorage["user_intro"] = res.data.user_intro;//个性签名
            this.$store.state.Userinformation.user_status = localStorage["user_status"] = res.data.user_status;//等级
            this.$store.state.Userinformation.user_telephone = localStorage["user_telephone"] = res.data.user_telephone;//手机号
            this.$store.state.Userinformation.user_address = localStorage["user_address"] = res.data.user_address;//收货地址
          }
        })
      }
    },
    //登录重置
    loginReset(){
      this.formCustom = "";
    },
    //注册
    Userregister(){
      if(this.formValidate.name === undefined){
        this.$Message.error("用户名不能为空")
      }else if(this.formValidate.email === undefined){
        this.$Message.error("邮箱不能为空")
      }else if(this.formValidate.pass === undefined){
        this.$Message.error("密码不能为空")
      }else if(this.formValidate.pass2 === undefined){
        this.$Message.error("重复输入密码不能为空")
      }else if(this.formValidate.pass != this.formValidate.pass2){
        this.$Message.error("两次密码不一致")
      }else if(this.formValidate.gender === undefined){
        this.$Message.error("性别选择不能为空")
      }else{
        if(!this.$store.state.reg.test(this.formValidate.email)){
          this.$Message.error("注册失败，邮箱格式错误")
        }else if(!this.$store.state.patrn_name.exec(this.formValidate.name)){
          this.$Message.error("注册失败，账号只能输入5-12个以字母开头、可带数字、“_”、“.”的字串!!")
        }else if(!this.$store.state.patrn_pass.exec(this.formValidate.pass)){
          this.$Message.error("注册失败，密码只能为数字且由6-15个数字组成!!")
        }else{
          useradd({
            User_name:this.formValidate.name,
            User_gender:this.formValidate.gender,
            User_email:this.formValidate.email,
            User_pass:this.formValidate.pass,
          }).then(res=>{
            if(res.data == true){
              this.$Message.success("注册成功,立即登录吧!");

              setTimeout(()=>{
                this.formValidate = "";
                this.register2();
              },1500);
            }
          }).catch(error=>{
            this.$Message.error("发生未知错误，请稍后再试"+error);
          })
        }
      }
    }

  },

  created() {
  },
  components: {
    foot,
  },
};
</script>
