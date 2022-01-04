<template>
  <section>
    <!--    <Carousel-->
    <!--      autoplay-->
    <!--      loop-->
    <!--      :autoplay-speed="4000"-->
    <!--      :height="430"-->
    <!--      v-model="value2"-->
    <!--    >-->
    <!--      <CarouselItem v-for="item in imglist" :key="item.id">-->
    <!--        <div class="demo-carousel">-->
    <!--          <img v-lazy="item.imgurl" alt="" width="100%" />-->
    <!--        </div>-->
    <!--      </CarouselItem>-->
    <!--    </Carousel>-->
    <div style="width: 100%;background:rgba(44,44,44,0.1);margin-top:20px;">
      <Swiper style="margin-top:15px;width:1000px;height:480px;margin: 0 auto;">
        <SwiperItem v-for="(item, index) in imglist" :key="index"
        >
          <img v-lazy="item.imgurl"/>
        </SwiperItem>
      </Swiper>
    </div>

  </section>
</template>
<script>
import Swiper from "./Swiper";
import SwiperItem from "./SwiperItem";

export default {
  data() {
    return {
      value2: 0,
      imglist: [
        {id: 1, imgurl: require("../assets/images/banner/banner1.jpg")},
        {id: 2, imgurl: require("../assets/images/banner/banner2.jpg")},
        {id: 3, imgurl: require("../assets/images/banner/banner3.jpg")},
        {id: 4, imgurl: require("../assets/images/banner/banner4.jpg")},
        {id: 5, imgurl: require("../assets/images/banner/banner5.jpg")},
        {id: 6, imgurl: require("../assets/images/banner/banner6.jpg")},
      ],
    };
  },
  methods: {},
  components: {
    SwiperItem,
    Swiper
  }
};
</script>