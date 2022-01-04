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
          <!-- <PicZoom  :width="300"  :height="300" :minIMGsrc="imgurl" :scale="3" /> -->
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
                  <img
                    v-lazy="
                      require('../assets/images/shopping/DM_20211115203702_017.png')
                    "
                    width="100%"
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
                  <div class="chicun">
                    <p>尺寸:</p>
                    <div class="xuan-zhe">
                      <RadioGroup v-model="border" type="button" @on-change="radiofun">
                        <Radio v-for="item in radioList" :key="item.value" :label="item.label" >
                            <!-- <span>{{item.label}}</span> -->
                        </Radio>
                      </RadioGroup>
                    </div>
                  </div>
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
// import PicZoom from "../components/PicZoom.vue";

export default {
  name: "Detail",
  data() {
    return {
        border:'',
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
        ]
      // imgurl:'http://localhost:8081/images/shopping/DM_20211115203702_018.png'
    };
  },
  create(){
  },
  methods: {
      //
      radiofun(e){
          console.log(e);
      }
  },
  components: {
    HomeNav,
    footers,
    // PicZoom,
  },
};
</script>