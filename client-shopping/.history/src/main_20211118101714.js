import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import iView from 'iview';
import 'iview/dist/styles/iview.css';
import axios from 'axios';
import "./my-theme/index.less"
import VueLazyload from 'vue-lazyload'

Vue.use(iView);
// this.$axios
Vue.prototype.$axios = axios
Vue.config.productionTip = false


Vue.use(VueLazyload, {
	//图片加载失败时显示的图片
	error: require('./assets/img/error.jpg'), 
	//图片正在加载时显示的图片
  	loading: require('./assets/img/loading.jpg')
})
————————————————
版权声明：本文为CSDN博主「廊坊吴彦祖」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_45426836/article/details/106619057


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
