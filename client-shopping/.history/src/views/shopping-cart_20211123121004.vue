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
          title: "Name",
          key: "name",
        },
        {
          title: "头像",
          key: "avatar",
          columns: {
            width: "50px",
          },
          render: (h, params) => {
            console.log(params.row.avatar);
            return h("div", [
              h("img", {
                attrs: {
                  src:params.row.avatar,
                },
                style: {
                  width: "30%",
                  'margin-top':'10px',
                },
              }),
            ]);
          },
        },
        {
          title: "Age",
          key: "age",
        },
        {
          title: "Address",
          key: "address",
        },
      ],
      data1: [
        {
          name: "John Brown",
          age: 18,
          address: "New York No. 1 Lake Park",
          avatar:"https://gitee.com/fifteen2020/img-list/blob/master/img/20210726113224.png",
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