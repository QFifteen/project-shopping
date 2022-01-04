<template>
<article>
    
<HomeNav></HomeNav>
h1
<footers></footers>
</article>
    
</template>
<style scoped lang="less">
@import "../assets/css/shopping-cart.less";
</style>
<script>
import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";
export default {
    data(){
        return{

        }
    },
    methods:{

    },
    components:{
        HomeNav,
        footers
    }
}
</script>