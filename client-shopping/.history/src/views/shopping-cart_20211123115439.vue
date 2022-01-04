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
	title: "商品图",
	key: "photo",
	render: (h, params) => {
		console.log(params.row)
		return h('div', {
			attrs: {
				style: 'width: 40px;height: 40px;'
			},
		}, [
		h('img', {
			props: {
				type: 'primary',
				size: 'small'
			},
			attrs: {
				src: params.row.photo, style: 'width: 40px;height: 40px;						},
			style: {
			},
		}),
		]);
	}
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
          imgurl: "",
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