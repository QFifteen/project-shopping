<template>
    <article>
    <!-- 导航栏，头部 -->
     <HomeNav></HomeNav>

     <article>

     </article>
     <!-- 尾部 -->
     <footers></footers>
    </article>
</template>
<script>
import HomeNav from '../components/Home-nav.vue';
import footers from '../components/footer.vue';
export default {
    data() {
        return {
            
        }
    },
    methods: {
        
    },
    components:{
        HomeNav,
        footers
    }
}
</script>
<style scoped lang="less">

</style>