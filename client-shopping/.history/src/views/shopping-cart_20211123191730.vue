<template>
  <article>
    <HomeNav></HomeNav>
    <Table
      height="400px"
      :columns="columns4"
      :data="data1"
      @on-select="select"
      size="large"
      style="text-align: center"
    ></Table>
    <footers></footers>
  </article>
</template>
<style scoped lang="less">
@import "../assets/css/shopping-cart.less";
</style>
<script>
import HomeNav from "../components/Home-nav.vue";
import footers from "../components/footer.vue";
export default {
  data() {
    return {
      columns4: [
        {
          type: "selection",
          width: 60,
          align: "center",
        },
        {
          title: "商品名称",
          key: "name",
          align: "center",
        },
        {
          title: "头像",
          key: "avatar",
                  align: "center",
          columns: {
            width: "50px",
          },
          render: (h, params) => {
            // console.log(params.row.avatar);
            return h("div", [
              h("img", {
                attrs: {
                  src: params.row.avatar,
                },
                style: {
                  width: "40%",
                  "margin-top": "10px",
                },
              }),
            ]);
          },
        },
        {
          title: "规格信息",
          key: "address",
          align: "center",
        },
        {
          title: "单价",
          key: "age",
          align: "center",
          width:"120px"
        },
        {
          title: "数量",
          key: "age",
          align: "center",
          width:"120px"
        },
        {
          title: "实际支付",
          key: "age",
          align: "center",
          render:(h,params)=>{
  return h("div",{domProps:{
     innerHTML:`<s>`+params.row.age+`</s>`//渲染html内容
  }})}
        },
        {
          title: "操作",
          key: "age",
          align: "center",
        },
      ],
      data1: [
        {
          name: "John Brown", 
          age: 200.000,
          address: "New York No. 1 Lake Park",
          avatar: require("../assets/images/shopping/DM_20211115203702_018.png"),
          date: "2016-10-03",
        },
      ],
    };
  },
  methods: {
    select(selection, row) {
      console.log(selection, row);
    },
  },
  components: {
    HomeNav,
    footers,
  },
  //计算属性
  computed: {},
};
</script>