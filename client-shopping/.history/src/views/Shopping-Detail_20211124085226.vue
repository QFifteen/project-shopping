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
        <div class="choose" ref="choose">
            <div class="content" ref="content" @mousemove="handleMove" @mouseout="handleOut">
                <img src="../" />
                <div class="shadow" ref="shadow"></div>
            </div>
            <ul id="listshow">
                <li class="selected">
                    <img src="/static/bg.jpg" alt="">
                </li>
            </ul>
        </div>
        <div class="larger" ref="larger">
            <img src="/static/bg.jpg" ref="big" />
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
import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";

export default {
  name: "Detail",
  data() {
    return {};
  },
  methods: {
      // 获取元素到文档区域的坐标 
        getPosition: function(element){ 
            var dc = document, 
            rec = element.getBoundingClientRect(), 
            x = rec.left, // 获取元素相对浏览器视窗window的左、上坐标 
            y = rec.top; 
            // 与html或body元素的滚动距离相加就是元素相对于文档区域document的坐标位置 
            x += dc.documentElement.scrollLeft || dc.body.scrollLeft; 
            y += dc.documentElement.scrollTop || dc.body.scrollTop; 
            return { 
                left: x, 
                top: y 
            }; 
        },
        handleMove(evt) {
            var larger = this.$refs.larger;
            var shadow = this.$refs.shadow;
            var big = this.$refs.big;
            var pos = this.getPosition(this.$refs.choose);
            var shadowRect = shadow.getBoundingClientRect();
            var bigRect = big.getBoundingClientRect();
            var contentRect = this.$refs.content.getBoundingClientRect();
            var maxX = contentRect.width - shadowRect.width;
            var maxY = contentRect.height - shadowRect.height;
 
            var X = evt.pageX - pos.left - shadowRect.width / 2;
            var Y = evt.pageY - pos.top - shadowRect.height / 2;
 
            if (X <= 0) {
                X = 0;
            }
            if (X >= maxX) {
                X = maxX;
            }
            if (Y <= 0) {
                Y = 0;
            }
            if (Y >= maxY) {
                Y = maxY;
            }
            // 防止遮罩层粘滞，跟随鼠标一起滑出大图位置
            var bigX = X * bigRect.width / contentRect.width;
            var bigY = Y * bigRect.height / contentRect.height;
            //  bigX / bigW = X / contentW,主图和遮罩层之间存在两倍关系，放大图和原图之间也有两倍关系
            shadow.style.left = X + "px";
            shadow.style.top = Y + "px";
 
            // console.log(X, Y, bigX, bigY);
 
            big.style.left = -bigX + "px";
            big.style.top = -bigY + "px";
 
            larger.style.display = "block";
            shadow.style.display = "block";
        },
        handleOut(evt) {
            var larger = this.$refs.larger;
            var shadow = this.$refs.shadow;
            larger.style.display = "none";
            shadow.style.top = "-1000px";
        }
  },
  components: {
    HomeNav,
    footers,
  },
};
</script>