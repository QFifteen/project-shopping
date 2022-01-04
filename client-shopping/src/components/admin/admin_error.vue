<template>
  <div class="err">
    <img v-lazy="require('../../assets/images/admin/admin_404.png')" alt="404" width="650px">
  </div>
</template>
<script>
export default{
  data(){
    return{

    }
  },
  methods:{

  }
}
</script>
<style scoped lang="less">
.err{
  display:flex;
  justify-content: center;
}
.err-404{
  .Main-Head(50px);
}
</style>