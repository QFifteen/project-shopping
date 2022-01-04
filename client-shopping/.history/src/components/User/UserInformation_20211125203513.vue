<template>
  <!-- 个人信息 -->
  <article>
    <Card>
      <p slot="title" class="title">基本信息 <button>修改</button>
 </p>
      <article class="text1">
      <img v-lazy="require('../../assets/images/logo/shiwu.jpg')" alt="头像" width="100px" height="100px" >

        <Form :model="formItem" :label-width="200" class="form-text" label-position	=>
                    <FormItem label="名称:">
            <Input v-model="formItem.input" placeholder="Enter something..."></Input>
        </FormItem>
</Form>

      </article>
    </Card>
  </article>
</template>
<style lang="less" scoped>
@import '../../assets/css/UserInformation.less';
</style>
<script>
export default {
  data() {
    return {
        formItem:{}
    };
  },
  methods: {},
};
</script>