<template>
  <div>
    <Card>
      <div class="user-card">
      <img v-lazy="require('../../assets/images/logo/shiwu.jpg')" alt=""  class="work-img" >
        <span class="user-text">早安，十五，开始您一天的工作吧！</span>
        <Tag color="geekblue">geekblue</Tag>
      </div>
    </Card>
    <div class="center-card">
    <Card class="center-card1">
      <List>
        <ListItem>
          <ListItemMeta avatar="../../assets/images/logo/shiwu.jpg" title="This is title" description="This is description, this is description." />
        </ListItem>
        <ListItem>
          <ListItemMeta avatar="../../assets/images/logo/shiwu.jpg" title="This is title" description="This is description, this is description." />
        </ListItem>
        <ListItem>
          <ListItemMeta avatar="https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar" title="This is title" description="This is description, this is description." />
        </ListItem>
      </List>
    </Card>
      <Card class="center-card2">
        <div class="center-card2-card">
            <div>
              <img v-lazy="require('../../assets/images/svg/admin_icon/github.svg')" alt="" class="img-icon">
              <p class="card-title">github</p>
              <p class="card-text">是兄弟，就来用github吧!!</p>
            </div>
            <div>
              <img v-lazy="require('../../assets/images/svg/admin_icon/Vue.svg')" alt="" class="img-icon">
              <p class="card-title">Vue</p>
              <p class="card-text">是兄弟，就来用Vue吧!!</p>
            </div>
          <div>
            <img v-lazy="require('../../assets/images/svg/admin_icon/js.svg')" alt="" class="img-icon">
            <p class="card-title">JavaScript</p>
            <p class="card-text">是兄弟，就来用JavaScript吧!!</p>
          </div>
          <div>
            <img v-lazy="require('../../assets/images/svg/admin_icon/HTML5.svg')" alt="" class="img-icon">
            <p class="card-title">HTML5</p>
            <p class="card-text">是兄弟，就来用HTML5吧!!</p>
          </div>
          <div>
            <img v-lazy="require('../../assets/images/svg/admin_icon/CSS3.svg')" alt="" class="img-icon">
            <p class="card-title">CSS3</p>
            <p class="card-text">是兄弟，就来用CSS3吧!!</p>
          </div>
          <div>
            <img v-lazy="require('../../assets/images/svg/admin_icon/React.svg')" alt="" class="img-icon">
            <p class="card-title">React</p>
            <p class="card-text">是兄弟，就来用React吧!!</p>
          </div>
        </div>
      </Card>
    </div>
  </div>
</template>
<style scoped lang="less">
@import '../../assets/css/admin/work';
</style>

<script>
export default{
  data() {
    return{}
  },
  methods: {

  }
}
</script>

