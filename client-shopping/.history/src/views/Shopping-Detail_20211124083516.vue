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
         <div id="div1">
    <div class="small_pic">
  <span class="mark"></span>
        <span class="float_layer"></span>
        <img src="Photos/small.png" alt="放大镜图片一" longdesc="http://www.miaov.com" />
    </div>
    <div class="big_pic">
  <img src="Photos/psb.jpeg" alt="放大镜图片二" longdesc="http://www.miaov.com" />
 </div>
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

    function getByClass(oParent, sClass) {
        var aEle = oParent.getElementsByTagName('*');
        var aTmp = [];
        var i = 0;

        for (i = 0; i < aEle.length; i++) {
            if (aEle[i].className == sClass) {
                aTmp.push(aEle[i]);
            }
        }

        return aTmp;
    }
    window.onload = function () {
        var oDiv = document.getElementById('div1');
        var oMark = getByClass(oDiv, 'mark')[0];
        var oFloat = getByClass(oDiv, 'float_layer')[0];
        var oBig = getByClass(oDiv, 'big_pic')[0];
        var oSmall = getByClass(oDiv, 'small_pic')[0];
        var oImg = oBig.getElementsByTagName('img')[0];

        oMark= function () {
            oFloat.style.display = 'block';
            oBig.style.display = 'block';
        };

        oMark= function () {
            oFloat.style.display = 'none';
            oBig.style.display = 'none';
        };

        oMark= function (ev) {
            var oEvent = ev || event;

            var l = oEvent.clientX - oDiv.offsetLeft - oSmall.offsetLeft - oFloat.offsetWidth / 2;
            var t = oEvent.clientY - oDiv.offsetTop - oSmall.offsetTop - oFloat.offsetHeight / 2;

            if (l < 0) {
                l = 0;
            }
            else if (l > oMark.offsetWidth - oFloat.offsetWidth) {
                l = oMark.offsetWidth - oFloat.offsetWidth;
            }

            if (t < 0) {
                t = 0;
            }
            else if (t > oMark.offsetHeight - oFloat.offsetHeight) {
                t = oMark.offsetHeight - oFloat.offsetHeight;
            }

            oFloat.style.left = l + 'px';
            oFloat.style.top = t + 'px';

            var percentX = l / (oMark.offsetWidth - oFloat.offsetWidth);
            var percentY = t / (oMark.offsetHeight - oFloat.offsetHeight);

            oImg.style.left = -percentX * (oImg.offsetWidth - oBig.offsetWidth) + 'px';
            oImg.style.top = -percentY * (oImg.offsetHeight - oBig.offsetHeight) + 'px';
        };
    };

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