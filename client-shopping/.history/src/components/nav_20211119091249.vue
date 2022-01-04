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
            <button class="loginbutt"><span class="iconfont-shopping shop-daohang"></span>了解我们</button>
            <div class="bottomtext">
              <Row type="flex" style="height:100%" align="middle">
                <Col span="12"><p>伍蒙服饰时尚电商</p><p>打造潮流品牌</p></Col>
              <Col span="12"><p>成为会员，体验极致时尚</p><p>年轻人的衣柜</p></Col>
              </Row>
            </div>
          </div></Col
        >
        <Col span="10">
        <img v-lazy="require('../assets/images/login/Cover.jpeg')" alt="" width="70%" >
        <p style="margin-left:400px;">ddd</p>
        </Col>
      </Row>
    </article>
  </div>
</template>
<style scoped lang="less">
@import "../assets/css/nav.less";
@import "../assets/font_2946158_istdw5rzs9/iconfont.css";
</style>