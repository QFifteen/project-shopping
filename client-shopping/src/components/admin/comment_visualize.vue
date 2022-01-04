<template>
  <div>
    <Card >
      <div id="comment1" style="width:1000px;height:500px;"></div>
    </Card>
  </div>
</template>
<style scoped lang="less">
.comment{
  height:180px;
}
</style>

<script>
// import {option7, option8, option9,option10,option11} from "@/echarts/MyEcharts";
import {option7} from "@/echarts/MyEcharts";
export default{
  data(){
    return{

    }
  },
  methods:{
    drawLine(){
      let myChart = this.$echarts.init(document.getElementById("comment1"));
      myChart.setOption(option7);

    }
  },
  mounted() {
    this.drawLine();
  }
}
</script>