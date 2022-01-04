<template>
  <div>
    <Row>
      <Col span="12">
        <Card class="vis-card1">
          <div id="vis1" style="width:557px;height:500px;"></div>
        </Card>
      </Col>
      <Col span="12">
        <Card class="vis-card2">
          <div id="vis2" style="width:557px;height:500px;"></div>
        </Card>
      </Col>
    </Row>
  </div>
</template>
<style scoped lang="less">

</style>

<script>
import {option4,option5} from "@/echarts/MyEcharts";
export default{
  data(){
    return{

    }
  },
  methods:{
    drawLine(){
      let myChart = this.$echarts.init(document.getElementById("vis1"));
      myChart.setOption(option4);
      let myChart2 = this.$echarts.init(document.getElementById("vis2"));
      myChart2.setOption(option5);
    }
  },
  mounted(){
    this.drawLine();
  }
}
</script>