<template>
<article>
    <HomeNav></HomeNav>
          <Breadcrumb>
        <BreadcrumbItem to="/">Home</BreadcrumbItem>
        <BreadcrumbItem to="/Detail">Detail</BreadcrumbItem>
      </Breadcrumb>
      <span class="title">服饰</span>
    <footers></footers>
</article>
</template>
<script>
import HomeNav from '../components/Home-nav.vue';
import footers from '../components/footer.vue';

export default {
    name:'Detail',
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