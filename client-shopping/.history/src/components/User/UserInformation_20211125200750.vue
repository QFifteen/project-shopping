<template>
  <!-- 个人信息 -->
  <article>
    <Card>
      <p slot="title">基本信息</p>
      <img v-lazy="require('../../assets/images/logo/shiwu.jpg')" alt="头像" width="100px" height="100px" style="">
    </Card>
  </article>
</template>
<style lang="less" scoped>
</style>
<script>
export default {
  data() {
    return {};
  },
  methods: {},
};
</script>