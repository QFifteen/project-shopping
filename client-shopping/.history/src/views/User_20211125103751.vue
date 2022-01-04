<template>
  <article>
    <Home-nav></Home-nav>
    正文
    <footers></footers>
  </article>
</template>
<style lang="less" scoped>
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