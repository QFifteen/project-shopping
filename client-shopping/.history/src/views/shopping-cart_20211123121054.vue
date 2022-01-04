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
          avatar:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fdik.img.kttpdq.com%2Fpic%2F69%2F47802%2Fb120a7942a39e844_1680x1050.jpg&refer=http%3A%2F%2Fdik.img.kttpdq.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1640232642&t=fa71d8451bcd1ffdd8a518378cad3954",
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