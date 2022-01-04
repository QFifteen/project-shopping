import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const category = () => import('../views/category.vue');
const DetailList = ()=>import('../views/Shopping-DetailList.vue');
const Cart = ()=>import('../views/shopping-cart.vue');
const Detail = ()=>import('../views/Shopping-Detail.vue');
const User = ()=>import('../views/User.vue');

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
    //商品列表展示
    path:'/DetailList',
    name:'DetailList',
    component:DetailList
  },
  {
    //购物车
    path:'/Cart',
    name:"Cart",
    component:Cart
  },
  {
    //商品详情
    path:'/User',
    name:'User',
    component:User
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
