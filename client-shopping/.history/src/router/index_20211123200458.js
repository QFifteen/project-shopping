import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const category = () => import('../views/category.vue');
const DetailList = ()=>import('../views/Shopping-DetailList.vue');
const Cart = ()=>import('../views/shopping-cart.vue');

const routes = [
  {
    //登录
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    //分类
    path:'/category',
    name:'category',
    component:category 
  },
  {
    //商品详情
    path:'/Detail',
    name:'Detail',
    component:Detail
  },
  {
    //购物车
    path:'/Cart',
    name:"Cart",
    component:Cart
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
