<template>
  <div>
    <nav class="nav">
      <Row type="flex" align="middle" class="rowstyle">
        <Col span="2">
          <img
            v-lazy="require('../assets/images/logo/logo.svg')"
            alt=""
            width="45px"
            height="45px"
          />
        </Col>
        <Col span="1">服饰</Col>
        <Col span="1">服饰</Col>
        <Col span="1">服饰</Col>
        <Col span="2">最新发售</Col>
        <Col span="2">最新发售</Col>
        <Col span="5"></Col>
        <Col span="4"> <Input search placeholder="Enter something..." /> </Col>
        <Col span="2"
          ><span class="iconfont-shopping shop-htmal5icon29"></span
          >我的购物车</Col
        >
        <Col span="2"> <Avatar icon="ios-person" /> user</Col>
        <Col span="2">退出|注销</Col>
      </Row>
    </nav>
    <!-- 轮播图 -->
    <section>
        <Carousel autoplay  loop :autoplay-speed = "4000"  height="400px">
        <CarouselItem >
            <div class="demo-carousel" v-for="item in imglist" :key="item.id">
                <img v-lazy="item.imgurl" alt="" width="100%">
                <!-- "require('../assets/images/login/loginimg.png')" -->
            </div>
        </CarouselItem>
    </Carousel>
    </section>
  </div>
</template>
<script>
export default {
  name: "home-nav",
  data() {
    return {
      value2: 0,
      imgurl1:'../assets/images/banner/banner1.png',
      imglist:[{id:1,imgurl:'../assets/images/banner/banner1.png'},
      {id:2,imgurl:'../assets/images/banner/banner2.png'},
      {id:3,imgurl:'../assets/images/banner/banner3.png'},
      {id:4,imgurl:'../assets/images/banner/banner4.png'}
      ]
    };
  },
  methods: {},
  created(){
      console.log(this.imgurl1);
  }
  
};
</script>
<style scoped lang="less">
@import "../assets/css/Home-nav.less";
</style>