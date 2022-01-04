<template>
    <article>
    <!-- 导航栏，头部 -->
     <HomeNav></HomeNav>

    <!-- 中间内容(商品详情) -->
     <article>
             <Breadcrumb>
        <BreadcrumbItem to="/">Home</BreadcrumbItem>
        <BreadcrumbItem to="/Detail">Detail</BreadcrumbItem>
    </Breadcrumb>
    <span class="title">服饰</span>
    <Row>
        <Col span="1"></Col>
        <Col span="1"></Col>
        <Col span="1"></Col>
    </Row>
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
@import '../assets/css/Shopping-Detail.less';
</style>