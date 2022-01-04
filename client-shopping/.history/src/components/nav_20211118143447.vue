<template>
  <Row
    type="flex"
    style="height: 80px; background: red"
    justify="center"
    align="middle"
  >
    <Col span="16" :pull="6">
      <img v-lazy="require('../assets/images/logo/logo.svg')" />
      <span class="logotext">伍蒙</span>
    </Col>
    <Col span="8">col-12</Col>
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
.logotext{
    font-size:@size;
}
@import "../assets/css/nav.less";
</style>