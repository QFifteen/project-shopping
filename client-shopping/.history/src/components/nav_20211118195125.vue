<template>
  <Row
    type="flex"
    class="navlogo"
    justify="center"
    align="middle"
  >
    <Col span="16" :pull="6" class="logocol1">
      <img v-lazy="require('../assets/images/logo/logo.svg')" />
    </Col>
    <Col span="8">
      <p>dd</p>
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