<template>
  <div class="login">
  <nav>
    <Row type="flex" align="middle" class="navlogo" justify="center">
      <Col span="15" class="navcol">
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
    </nav>
    <article class="Cover">
      <Row>
      <span class="logotext">forever Young</span>
      </Row>
    </article>
  </div>
</template>
<style scoped lang="less">
@import "../assets/css/nav.less";
</style>