<template>
  <nav class="nav">
    <Row type="flex" align="middle">
      <Col span="2">x</Col>
      <Col span="1">服饰</Col>
      <Col span="1">服饰</Col>
      <Col span="1">服饰</Col>
      <Col span="2">最新发售</Col>
      <Col span="2">最新发售</Col>
      <Col span="4"> <Input search placeholder="Enter something..." /> </Col>
      <Col span="2">我的购物车</Col>
      <Col span="4">xxx退出</Col>
    </Row>
  </nav>
</template>
<script>
export default {
  name: "home-nav",
  data() {
    return {};
  },
  methods: {},
};
</script>
<style scoped lang="less">
@import "../assets/css/Home-nav.less";
</style>