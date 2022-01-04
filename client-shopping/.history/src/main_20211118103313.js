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
  loading
	error: require('./assets/images/Loading.gif'), 
	//图片正在加载时显示的图片
  	loading: require('./assets/images/fail.png')
})


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
