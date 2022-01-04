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
            <button class="loginbutt"><span class="iconfont-shopping shop-daohang"></span>点击登录</button>
            <div class="bottomtext">
              <Row type="flex" style="background:red;height:50px">
                <Col span="12"><span>伍蒙服饰电商</span></Col>
              <Col span="12"></Col>
              </Row>
            </div>
          </div></Col
        >
        <Col span="10">
        <img v-lazy="require('../assets/images/login/Cover.jpeg')" alt="" width="70%" >
        </Col>
      </Row>
    </article>
  </div>
</template>
<style scoped lang="less">
@import "../assets/css/nav.less";
@import "../assets/font_2946158_istdw5rzs9/iconfont.css";
</style>