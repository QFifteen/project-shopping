<template>
  <!-- 个人信息 -->
  <article>
    <Card>
      <p slot="title" class="pp">基本信息 </p>
      <article class="text1">
      <img v-lazy="require('../../assets/images/logo/shiwu.jpg')" alt="头像" width="100px" height="100px" >
      </article>
    </Card>
  </article>
</template>
<style lang="less" scoped>
@import '../../assets/css/UserInformation.less';
</style>
<script>
export default {
  data() {
    return {};
  },
  methods: {},
};
</script>