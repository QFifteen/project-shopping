<template>
  <article>
    <HomeNav></HomeNav>
            <Input search enter-button placeholder="Enter something..."  style="width:100px;"/>
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
    return {};
  },
  methods: {},
  components: {
    HomeNav,
    footers,
  },
};
</script>