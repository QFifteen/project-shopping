<template>
  <!-- 个人信息 -->
  <article class="user-all">
    <Card>
      <p slot="title" class="title">
        基本信息 <button class="but-up" @click="Updata">修改</button
        ><button class="but-up2">保存</button>
      </p>
      <article class="text1">
        <img
          v-lazy="formItem.img"
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
              :disabled = "judge"
            ></Input>
          </FormItem>
          <FormItem label="个性签名:">
            <Input
              v-model="formItem.address"
              maxlength="30"
              show-word-limit
              type="textarea"
              placeholder="Enter something..."
              style="width: 200px"
              :disabled = "judge"
            />
          </FormItem>
          <FormItem label="性别:" >
            <RadioGroup :value = "formItem.gender" >
              <Radio label="男士" :disabled = "judge">
                <Icon type="logo-apple"></Icon>
                <span>男士</span>
              </Radio>
              <Radio label="女士" :disabled = "judge">
                <Icon type="logo-android"></Icon>
                <span>女士</span>
              </Radio>
            </RadioGroup>
          </FormItem>
        </Form>
        <!-- 信息2 -->
        <Form :model="formItem" :label-width="100" class="form-text">
          <FormItem label="密码:">
            <Input
              v-model="formItem.pass"
              type="password"
              password
              placeholder="Enter something..."
              style="width: 200px"
              :disabled = "true"
            />
          </FormItem>
          <FormItem label="用户等级:">
            <InputNumber readonly v-model="formItem.status" :disabled = "true"></InputNumber>
          </FormItem>
        </Form>
      </article>
    </Card>
    <Divider>更多信息</Divider>
    <Card style="margin-top: 20px">
      <p slot="title" class="title">
        收货信息<button class="but-up">修改</button
        ><button class="but-up2">保存</button>
      </p>
      <!-- 收货信息 -->
      <article>
        <Form :model="formItem" :label-width="100" class="form-text2">
          <FormItem label="手机号码:">
            <Input
              v-model="formItem.input"
              placeholder="Enter something..."
              style="width: 300px"
            ></Input>
          </FormItem>
          <FormItem label="收货地址:">
            <Input
              v-model="formItem.text"
              maxlength="100"
              show-word-limit
              type="textarea"
              placeholder="Enter something..."
              style="width: 300px"
            />
          </FormItem>
          <FormItem label="邮箱:">
            <Input
              v-model="formItem.input"
              placeholder="Enter something..."
              style="width: 300px"
            ></Input>
          </FormItem>
        </Form>
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
      judge:true
    };
  },
  methods: {
    Usershow(){
      this.formItem.input = localStorage["user_name"];
      this.formItem.address = localStorage["user_address"];
      this.formItem.pass = localStorage["user_pass"];
      this.formItem.input = localStorage["user_name"];
      this.formItem.status = new Number(localStorage["user_status"]);
      this.formItem.gender = localStorage["user_gender"];
      this.formItem.img = localStorage["user_img"];
    },
    Updata(){
      this.judge = false;
    }
  },
  created() {
    this.Usershow();
  }
};
</script>
