<template>
  <div>
    <Row type="flex" align="middle" class="navlogo">
      <Col span="15" class="logocol1">
        <img v-lazy="require('../assets/images/logo/logo.svg')" alt="" />
      </Col>
      <Col span="2">
        <p>品牌介绍</p>
      </Col>
      <Col span="2">
        <p>时尚追寻</p>
      </Col>
      <Col span="2">
        <p>关于我们</p>
      </Col>
      <Col span="2">
        <p>更多</p>
      </Col>
    </Row>
  </div>
</template>
<style scoped lang="less">
@import "../assets/css/"
</style>