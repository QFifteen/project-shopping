<template>
  <!-- 个人信息 -->
  <article>
    <Card>
      <p slot="title" class="title">基本信息 <button class="but-up">修改</button><button class="but-up2">保存</button></p>
      <article class="text1">
        <img
          v-lazy="require('../../assets/images/logo/shiwu.jpg')"
          alt="头像"
          width="100px"
          height="100px"
        />
        <!-- 信息1 -->
        <Form :model="formItem" :label-width="100" class="form-text">
          <FormItem label="名称:">
            <Input
              v-model="formItem.input"
              placeholder="Enter something..."
            ></Input>
          </FormItem>
          <FormItem label="个性签名:">
        <Input v-model="formItem." maxlength="100" show-word-limit type="textarea" placeholder="Enter something..." style="width: 200px" />
          </FormItem>
          <FormItem label="性别:">
            <RadioGroup v-model="phone">
              <Radio label="apple">
                <Icon type="logo-apple"></Icon>
                <span>Apple</span>
              </Radio>
              <Radio label="android">
                <Icon type="logo-android"></Icon>
                <span>Android</span>
              </Radio>
            </RadioGroup>
          </FormItem>
        </Form>
        <!-- 信息2 -->
        <Form :model="formItem" :label-width="100" class="form-text">
          <FormItem label="密码:">
        <Input v-model="formItem.pass" type="password" password placeholder="Enter something..." style="width: 200px" />
          </FormItem>
          <FormItem label="用户等级:">
            <InputNumber readonly></InputNumber>
          </FormItem>
        </Form>
      </article>
    </Card>
    <Divider>更多信息</Divider>
    <Card style="margin-top:20px;">
      <p slot="title" class="title">收货信息<button class="but-up">修改</button><button class="but-up2">保存</button></p>
      <!-- 收货信息 -->
      <article>

      </article>
    </Card>
  </article>
</template>
<style lang="less" scoped>
@import "../../assets/css/UserInformation.less";
</style>
<script>
export default {
  data() {
    return {
      formItem: {},
    };
  },
  methods: {},
};
</script>