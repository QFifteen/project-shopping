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
        <Col span="14"
          ><div class="Covertext">
            <span class="logotext">forever Young</span>
            <p class="logotext2"> selection of young people</p>
            <p class="logotext3">Fashion brand!!</p>
          </div></Col
        >
        <Col span="9">
        <img v-lazy="require('../assets/images/login/Cover.jpeg')" alt="" width="70%" >
        </Col>
        <Col span="1">
        <p>22</p>
        </Col>
      </Row>
    </article>
  </div>
</template>
<style scoped lang="less">
@import "../assets/css/nav.less";
</style>