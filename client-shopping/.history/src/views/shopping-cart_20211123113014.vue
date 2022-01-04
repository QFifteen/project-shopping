<template>
  <article>
    <HomeNav></HomeNav>
            <Table border ref="selection" :columns="columns4" :data="data1"></Table>
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
  data() {
    return {
    };
  },
  methods: {},
  components: {
    HomeNav,
    footers,
  },
};
</script>