<template>
  <article>
    <Row>
      <Col span="2"></Col>
      <Col span="20">
        <Row type="flex" align="middle">
          <Col span="12">
            <img v-lazy="require('../assets/images/svg/404.svg')" alt="" width="100%">
          </Col>
          <Col span="12">
            <p class="error-title">UH OH！！页面丢失</p>
            <p class="error-message">您所寻找的页面不存在，你可以点击下面的按钮返回主页或返回上一级页面</p>
            <div class="butt">
            <button class="page" @click="$router.push({path:'/'})">返回首页</button>
            <button class="back" @click="$router.back()">返回上一级</button>
            </div>
          </Col>
        </Row>
      </Col>
      <Col span="2"></Col>
    </Row>

  </article>
</template>
<style scoped lang="less">
.error-title{
  .Main-Head(35px);

}
.error-message{
  font-size: 16px;
}
.page,.back{
  .button-hei(120px,40px);
}
.butt{
  margin-top: 30px;
  button:nth-child(2){
    margin-left:60px;
  }
}
</style>
<script>
export default{
  data() {
    return{

    }
  },
  methods: {

  }
}
</script>