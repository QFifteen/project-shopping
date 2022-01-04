<template>
<!-- align="middle" justify="start" -->
  <Row type="flex" class="navlogo"  align="middle" justify="start">
    <Col span="16" :pull="6" class="logocol1">
      <img v-lazy="require('../assets/images/logo/logo.svg')" />
    </Col>
    <Col span="1">
      <p>品牌介绍</p>
    </Col>
    <Col span="1">
      <p>时尚追寻</p>
    </Col>
    <Col span="1">
      <p>关于我们</p>
    </Col>
    <Col span="1" style="background:red;">
      <p>更多</p>
    </Col>
  </Row>
</template>
<script>
export default {
  name: "",
  data() {
    return {};
  },
  methods: {},
  created() {},
};
</script>
<style scoped lang="less">
@import "../assets/css/nav.less";
</style>