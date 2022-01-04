<template>
  <article>
    <HomeNav></HomeNav>

    <Breadcrumb>
      <BreadcrumbItem to="/">Home</BreadcrumbItem>
      <BreadcrumbItem to="/Detail">Detail</BreadcrumbItem>
    </Breadcrumb>
    <span class="title">商品详情介绍</span>

    <!-- 正文 -->
    <article class="shopping-all">
      <Row>
        <Col span="1"></Col>
        <Col span="22">
         <img src="../" width="400" id="small" alt="">
        <div id="big">
                <img src="./1.jpg" alt="">
        </div>
        </Col>
        <Col span="1"></Col>
      </Row>
    </article>

    <footers></footers>
  </article>
</template>
<style lang="less" scoped>
@import "../assets/css/Shopping-Detail.less";
</style>
<script>

var big = document.getElementById('big');
        var small = document.getElementById('small');
        small.onmousemove = function(e){
                var e = e || event;
                document.title="X:"+e.clientX+"Y:"+e.clientY;
                //获取对应的大图的坐标
                //将大图的滚动条的位置调整到小图的鼠标坐标的4被的位置
                big.scrollLeft = e.clientX*4-80;
                big.scrollTop = e.clientY*4-80;
                //让对应的大图显示
                big.style.display="block";
 
        }
        small.onmouseout = function(){
                //鼠标移除之后让你的大图隐藏
                big.style.display="none";
        }

import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";

export default {
  name: "Detail",
  data() {
    return {};
  },
  methods: {},
  components: {
    HomeNav,
    footers,
  },
};
</script>