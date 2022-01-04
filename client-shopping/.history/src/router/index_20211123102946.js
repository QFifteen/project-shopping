import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const category = () => import('../views/category.vue');
const Detail = ()=>import('../views/Shopping-Detail.vue');
const Cart = ()=>import('../views/shopping-cart.vue');

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path:'/category',
    name:'category',
    component:category 
  },
  {
    path:'/Detail',
    name:'Detail',
    component:Detail
  },
  {
    
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
