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
          <PicZoom  :width="410"  :height="533" :minIMGsrc="imgurl" :scale="3" />
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
                          >100.1</span
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
                      <RadioGroup v-model="border" type="button" @on-change="radiofun">
                        <Radio v-for="item in radioList" :key="item.value" :label="item.label"  class="but">
                            <!-- <span>{{item.label}}</span> -->
                        </Radio>
                      </RadioGroup>
                    </div>
                  </div>
                  <!-- 数量 -->
                  <div class="shul">
                    <p><i class="iconfont-shopping shop-shuliang"></i>数量:</p>
                        <InputNumber v-model="value11" controls-outside @on-change="inpunumber" class="inp-number"></InputNumber>
                  </div>
                    <div class="colour">
                        <span><i class="iconfont-shopping shop-yanse"></i>颜色:</span>
                        <RadioGroup v-model="border" type="button" @on-change="colourfun">
                        <Radio v-for="item in colourList" :key="item.value" :label="item.label" class="">
                            <!-- <span>{{item.label}}</span> -->
                        </Radio>
                      </RadioGroup>
                  </div>
                  <!-- 加入购物车 -->
                  <button class="btn-grad">
                <span class="iconfont-shopping shop-htmal5icon29"></span>加入购物车</button>
                <button class="btn-grad2">查看商品详情<i class="iconfont-shopping shop-xiajiantou1"></i></button>
                </div>
              </Col>
            </Row>

<Row>
    <Col span="6">
                    <Card style="width:320px">
        <div style="text-align:center">
            <img src="../assets/images/logo/logo.svg">
            <h3>A high quality UI Toolkit based on Vue.js</h3>
        </div>
    </Card>
    </Col>

    <Col span="17" style="background:red">dddx</Col>
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
        border:'',
        value11:1,
        radioList:[
            {
                label:'X',
                value:'X'
            },
            {
                label:'M',
                value:'M'
            },
            {
                label:'XL',
                value:'XL'
            }
        ],
        colourList:[
            {
                label:'红色',
                value:'红色'
            },
                        {
                label:'蓝色',
                value:'蓝色'
            },
                        {
                label:'绿色',
                value:'绿色'
            },
        ],
      imgurl:'http://localhost:8081/images/shopping/DM_20211115203702_017.png'
    };
  },
  create(){
  },
  methods: {
      //回调尺寸选中值
      radiofun(e){
          console.log(e);
      },
      //回调颜色值
      colourfun(e){
          console.log(e);
      },
      //回调数量值
      inpunumber(e){
          console.log(e);
      }
  },
  components: {
    HomeNav,
    footers,
    PicZoom,
  },
};
</script>