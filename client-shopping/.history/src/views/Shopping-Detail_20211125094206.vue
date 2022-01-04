<template>
  <article>
    <HomeNav></HomeNav>

    <Breadcrumb>
      <BreadcrumbItem to="/">Home</BreadcrumbItem>
      <BreadcrumbItem to="/Detail">Detail</BreadcrumbItem>
    </Breadcrumb>
    <span class="title">商品详情介绍</span>

    <!-- 正文 -->
    <article class="shopping-all">
      <Row>
        <Col span="1"></Col>
        <Col span="22">
          <article>
            <Row>
              <Col span="2">
                <p class="iconfont-shopping shop-xiangshangjiantou shang"></p>

                <div class="minimg-list">
                  <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    alt=""
                    width="100%"
                  />
                  <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    alt=""
                    width="100%"
                  />
                </div>
                <p class="iconfont-shopping shop-xiajiantou shang"></p>
              </Col>
              <Col span="10">
                <div class="maximg">
                  <!-- <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    width="100%"
                  /> -->
                  <PicZoom
                    :width="410"
                    :height="533"
                    :minIMGsrc="imgurl"
                    :scale="3"
                  />
                </div>
              </Col>
              <Col span="12">
                <div class="shopping-text">
                  <p class="shopping-title">商品名称xxxxxx</p>
                  <p class="shopping-Introduction">
                    xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                  </p>
                  <!-- 价格-折扣 -->
                  <div class="shopping-price">
                    <ul>
                      <li>
                        <span class="price-title">秒杀价:</span
                        ><span class="iconfont-shopping shop-jiage price"
                          ><s>100.1</s
                          ><span style="margin-left: 10px; color: red"
                            >99.01</span
                          ></span
                        >
                      </li>
                      <li>
                        <span>折扣:</span
                        ><span class="iconfont-shopping shop-zhekou price"
                          >8.5</span
                        >
                      </li>
                    </ul>
                  </div>
                  <!-- 尺寸 -->
                  <div class="chicun">
                    <p><i class="iconfont-shopping shop-chicun"></i>尺寸:</p>
                    <div class="xuan-zhe">
                      <RadioGroup
                        v-model="border"
                        type="button"
                        @on-change="radiofun"
                      >
                        <Radio
                          v-for="item in radioList"
                          :key="item.value"
                          :label="item.label"
                          class="but"
                        >
                          <!-- <span>{{item.label}}</span> -->
                        </Radio>
                      </RadioGroup>
                    </div>
                  </div>
                  <!-- 数量 -->
                  <div class="shul">
                    <p><i class="iconfont-shopping shop-shuliang"></i>数量:</p>
                    <InputNumber
                      v-model="value11"
                      controls-outside
                      @on-change="inpunumber"
                      class="inp-number"
                    ></InputNumber>
                  </div>
                  <div class="colour">
                    <span
                      ><i class="iconfont-shopping shop-yanse"></i>颜色:</span
                    >
                    <RadioGroup
                      v-model="border"
                      type="button"
                      @on-change="colourfun"
                    >
                      <Radio
                        v-for="item in colourList"
                        :key="item.value"
                        :label="item.label"
                        class=""
                      >
                        <!-- <span>{{item.label}}</span> -->
                      </Radio>
                    </RadioGroup>
                  </div>
                  <!-- 加入购物车 -->
                  <button class="btn-grad">
                    <span class="iconfont-shopping shop-htmal5icon29"></span
                    >加入购物车
                  </button>
                  <button class="btn-grad2">
                    查看商品详情<i
                      class="iconfont-shopping shop-xiajiantou1"
                    ></i>
                  </button>
                </div>
              </Col>
            </Row>

            <Row>
              <Col span="6">
                <Card style="width: 320px">
                  <div style="text-align: center">
                    <img src="../assets/images/logo/logo.svg" />
                    <h3>伍蒙服装电商时尚品牌</h3>
                  </div>
                </Card>
              </Col>

              <Col span="17" push="1">
                <div class="shopping-text">
                  <Tabs type="card" :animated="false">
                    <TabPane label="商品介绍">
                      <h3>品牌:伍蒙</h3>
                      <!-- 商品信息全部 -->
                      <div class="shopping-information">
                        <ul>
                          <li>商品编号:<span>dsa</span></li>
                          <li>商品产地:<span>dsa</span></li>
                          <li>商品名称:<span>dsa</span></li>
                          <li>流行元素:<span>dsa</span></li>
                        </ul>
                        <ul>
                          <li>版型:<span>dsa</span></li>
                          <li>材质:<span>dsa</span></li>
                          <li>风格:<span>dsa</span></li>
                          <li>适用场景:<span>dsa</span></li>
                        </ul>
                        <ul>
                          <li>袖长:<span>dsa</span></li>
                          <li>适用人群:<span>dsa</span></li>
                          <li>适用季节:<span>dsa</span></li>
                          <li>上架时间:<span>dsa</span></li>
                        </ul>
                      </div>
                    </TabPane>
                    <TabPane label="商品评论">
                      <!--                      统计-->
                      <div class="plun-fabiao">
                        <Row style="text-align: center">
                          <Col span="2">
                            <p>100%</p>
                            <p>好评率</p>
                          </Col>
                          <Col span="6">
                            <span>好评:</span
                            ><Progress
                              :percent="65"
                              :stroke-width="15"
                              status="wrong"
                              text-inside
                              stroke-color="#00E4FF"
                            />
                            <span>差评:</span
                            ><Progress
                              :percent="65"
                              :stroke-width="15"
                              status="wrong"
                              text-inside
                              stroke-color="#ed929e"
                            />
                          </Col>
                          <Col span="8">
                            <p class="plun-zuix">最新评论</p>
                            <p class="plun-zuix2">"ddd"</p>
                          </Col>
                          <Col span="8">
                            <button class="plun-but" @click="modal10 = true">
                              发表评论<i
                                class="iconfont-shopping shop-fabiao"
                              ></i>
                            </button>

                            <Modal
                              title="发表评论"
                              v-model="modal10"
                              class-name="vertical-center-modal"
                              footer-hide
                              :mask-closable="false"
                              width="600px"
                            >
                              <p>商品评分</p>
                              <Rate show-text v-model="valueText" />
                              <div class="fabiao-text">
                              <img
                                v-lazy="
                                  require('../assets/images/logo/shiwu.jpg')
                                "
                                alt=""
                                width="50px"
                                height="50px"
                              />
                              <Input v-model="value17" maxlength="100" show-word-limit type="textarea" placeholder="Enter something..." style="width: 400px;margin-left:20px;" :autosize="{minRows: 2,maxRows: 5}"/>
                              
                              </div>
                               <Upload
        multiple
        action="//jsonplaceholder.typicode.com/posts/"
        style="margin-left:60px;">
        <Button icon="ios-cloud-upload-outline">Upload files</Button>
    </Upload>
                            </Modal>
                          </Col>
                        </Row>
                      </div>
                      <!--                        评论列表-->
                      <div>
                        <Card style="width: 100%">
                          <div>
                            <Row>
                              <Col span="2" style="text-align: center">
                                <img
                                  v-lazy="
                                    require('../assets/images/logo/shiwu.jpg')
                                  "
                                  alt=""
                                  width="50px"
                                  height="50px"
                                />
                                <p>十五</p>
                              </Col>
                              <Col span="17">
                                <Rate v-model="valueHalf" />
                                <p class="plun-te">
                                  确实帅气，，确实、确实、确实确实确实
                                </p>
                                <img v-lazy="name" alt="" width="200px" />
                              </Col>
                              <Col span="5">
                                <div class="plun-box">
                                  <span class="plun-time">
                                    <i
                                      class="iconfont-shopping shop-shijian"
                                    ></i
                                    >2021:12:23:21</span
                                  >
                                  <p class="plun-box-icon">
                                    <i class="iconfont-shopping shop-dianzan"
                                      >(49+)</i
                                    >
                                    <i class="iconfont-shopping shop-huifu"
                                      >(99+)</i
                                    >
                                  </p>
                                </div>
                              </Col>
                            </Row>
                          </div>
                        </Card>
                      </div>
                    </TabPane>
                  </Tabs>
                </div>
              </Col>
            </Row>
          </article>
        </Col>
        <Col span="1"></Col>
      </Row>
    </article>
    <footers></footers>
  </article>
</template>
<style lang="less" scoped>
@import "../assets/css/Shopping-Detail.less";
</style>

<script>
import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";

// 放大镜功能组件
import PicZoom from "../components/PicZoom.vue";

export default {
  name: "Detail",
  data() {
    return {
      border: "",
      value11: 1,
      modal10: false,
      valueHalf: 3.5,
      valueText: 3,
      name: "http://172.16.254.1:8081/images/shopping/DM_20211115203702_017.png",
      radioList: [
        {
          label: "X",
          value: "X",
        },
        {
          label: "M",
          value: "M",
        },
        {
          label: "XL",
          value: "XL",
        },
      ],
      colourList: [
        {
          label: "红色",
          value: "红色",
        },
        {
          label: "蓝色",
          value: "蓝色",
        },
        {
          label: "绿色",
          value: "绿色",
        },
      ],
      imgurl: "http://localhost:8081/images/shopping/DM_20211115203702_017.png",
    };
  },
  create() {},
  methods: {
    //回调尺寸选中值
    radiofun(e) {
      console.log(e);
    },
    //回调颜色值
    colourfun(e) {
      console.log(e);
    },
    //回调数量值
    inpunumber(e) {
      console.log(e);
    },
  },
  components: {
    HomeNav,
    footers,
    PicZoom,
  },
};
</script>