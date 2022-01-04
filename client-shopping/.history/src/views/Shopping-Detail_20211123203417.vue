<template>
<article>
    <HomeNav></HomeNav>
    
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