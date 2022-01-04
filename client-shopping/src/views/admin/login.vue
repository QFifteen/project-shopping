<template>
  <div class="login">
    <div class="login-title">
      <div class="one"><img v-lazy="require('../../assets/images/logo/logo.svg')" alt="" style="margin-top:10px;"><span class="logo_title">伍蒙</span></div>
      <p class="text">服饰知名品牌</p>
<!--      后台按钮-->
      <div class="butt">
        <p class="serve"><i class="iconfont-shopping shop-guanlixitong" style="font-size:25px;"></i>后台管理系统</p>
        <button class="but_login" @click="modal3 = true">登录管理员账号<i class="iconfont-shopping shop-houtai2"></i></button>
<!--        登录弹窗-->
        <Modal v-model="modal3" :mask-closable = false :footer-hide='true' title="Sign UP" width="600px">
          <h1 style="text-align:center"> <i class="iconfont-shopping shop-denglu" style="font-size:20px"></i>Login</h1>
          <Form ref="formInline" >
            <FormItem prop="user">
              <Input type="text" v-model="formInline.user" placeholder="Username" size="large"  class="modal-inp" style="margin-top:15px;">
                <Icon type="ios-person-outline" slot="prepend"></Icon>
              </Input>
            </FormItem>
            <FormItem prop="password">
              <Input type="password" password v-model="formInline.password" placeholder="Password" size="large" class="modal-inp">
                <Icon type="ios-lock-outline" slot="prepend"></Icon>
              </Input>
            </FormItem>
            <FormItem>
              <Button type="primary" class="butt-Modal" @click="login">Signin</Button>
            </FormItem>
          </Form>
        </Modal>

        <br>
        <button class="but_about">关于我们<i class="iconfont-shopping shop-guanyuwomen"></i></button>
        <p class="text_footer">本系统仅供给内部管理人员使用！！</p>
      </div>
      <Divider><span class="text_footer">本系统一切解释权归伍蒙品牌所属</span></Divider>

    </div>
    <img v-lazy="require('../../assets/images/svg/73710.jpg')" alt=""  width="835px" height="625px">
  </div>
</template>
<style scoped lang="less">
@import '../../assets/css/admin/login_admin';
</style>
<script>
import {adminlogin} from '../../API/api';
export default {
  data() {
    return {
      modal3:false,
      formInline:{}
      // $router.push('/admin_home')
    }
  },

  methods: {
    login(){
      adminlogin({
        Administrator_name:this.formInline.user,
        Administrator_pass:this.formInline.password,
      }).then(res=>{
        console.log(res.data);
        if(res.data != ""){
          this.$Message.success('伍蒙后台系统欢迎您，将在2秒后跳转页面');
          this.$store.state.administrator.administrator_id = res.data.administrator_id;
          this.$store.state.administrator.administrator_name = res.data.administrator_name;
          this.$store.state.administrator.administrator_pass = res.data.administrator_pass;
          this.$store.state.administrator.administrator_img = res.data.administrator_img;
          this.$store.state.administrator.administrator_grade = res.data.administrator_grade;
          setTimeout(()=>{
            this.$router.push({path: '/admin_home'});
          },2000)
        }else if(res.data == ""){
          this.$Message.error('账户或密码错误，请重新输入');
        }
      }).catch(error=>{
        this.$Message.error('发生未知错误'+error);
      })
    }
  }
}
</script>
