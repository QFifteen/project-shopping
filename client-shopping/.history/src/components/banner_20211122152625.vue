<template>
    <section>
        <Carousel autoplay  loop :autoplay-speed = "4000"  :height="430" v-model="value2">
        <CarouselItem v-for="item in imglist" :key="item.id">
            <div class="demo-carousel" >
                <img v-lazy="item.imgurl" alt="" width="100%">
                <!-- "require('../assets/images/login/loginimg.png')" -->
            </div>
        </CarouselItem>
    </Carousel>
    </section>
</template>
<script>
export default {
    data(){
        return{

        }
    },
    methods: {
        
    },
}
</script>