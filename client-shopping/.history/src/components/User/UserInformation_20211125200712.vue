<template>
  <!-- 个人信息 -->
  <article>
    <Card>
      <p slot="title">基本信息</p>
      <img v-lazy="require('../../assets/')" alt="">
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