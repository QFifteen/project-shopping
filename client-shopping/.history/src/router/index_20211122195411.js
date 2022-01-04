import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

import category from "../views/category.vue";
const Index = () => import('../views/category.vue')

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
    name:"Detail",
    component:resolve => require(['../components'])
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
