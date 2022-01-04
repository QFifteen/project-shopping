<template>
  <article>
    <HomeNav></HomeNav>
    <Table
      height="500px"
      :columns="columns4"
      :data="data1"
      @on-select="select"
      size="large"
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
        },
        {
          title: "头像",
          key: "avatar",
          columns: {
            width: "50px",
          },
          render: (h, params) => {
            // console.log(params.row.avatar);
            return h("div", [
              h("img", {
                attrs: {
                  src:params.row.avatar,
                },
                style: {
                  width: "20%",
                  'margin-top':'10px',
                },
              }),
            ]);
          },
        },
                {
          title: "规格信息",
          key: "address",
        },
        {
          title: "单价",
          key: "age",
        },
        {
          title: "数量",
          key: "age",
        },
        {
          title: "加入时间",
          key: "age",
        },

      ],
      data1: [
        {
          name: "John Brown",
          age: 18,
          address: "New York No. 1 Lake Park",
          avatar:require("../assets/images/shopping/DM_20211115203702_018.png"),
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
};
</script>