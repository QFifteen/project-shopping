<template>
  <div>
    <nav class="nav">
      <Row type="flex" align="middle" class="rowstyle">
        <Col span="2">
          <img
            v-lazy="require('../assets/images/logo/logo.svg')"
            alt=""
            width="45px"
            height="45px"
          />
        </Col>
        <Col span="1">服饰</Col>
        <Col span="1">服饰</Col>
        <Col span="1">服饰</Col>
        <Col span="2">最新发售</Col>
        <Col span="2">最新发售</Col>
        <Col span="5"></Col>
        <Col span="4"> <Input search placeholder="Enter something..." /> </Col>
        <Col span="2"
          ><span class="iconfont-shopping shop-htmal5icon29"></span
          >我的购物车</Col
        >
        <Col span="2"> <Avatar icon="ios-person" /> user</Col>
        <Col span="2">退出|注销</Col>
      </Row>
    </nav>
    
    <article>
        <Row>
            <Col span="1"></Col>
            <Col span="22"></Col>
            <Col span="1"></Col>
        </Row>
    </article>
  </div>
</template>
<script>
export default {
  name: "home-nav",
  data() {
    return {

    };
  },
  methods: {},
  created(){
  }
  
};
</script>
<style scoped lang="less">
@import "../assets/css/Home-nav.less";
</style>