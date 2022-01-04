<template>
  <div class="shopping">
    <Card style="width: 100%">
      <div id="shopp" style="width: 1000px;height: 570px;margin:0 auto;"></div>
    </Card>
  </div>
</template>
<style scoped lang="less">

</style>

<script>
import {option6} from "@/echarts/MyEcharts";
export default{
  data(){
    return{

    }
  },
  methods:{
    drawLine(){
      let myChart = this.$echarts.init(document.getElementById("shopp"));
      myChart.setOption(option6);
    }
  },
  mounted() {
    this.drawLine();
  }
}
</script>