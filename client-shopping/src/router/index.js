import Vue from 'vue'
import VueRouter from 'vue-router'
// import Home from '../views/Home.vue'

Vue.use(VueRouter)

const Home = () => import('../views/Home.vue');
const category = () => import('../views/category.vue');
const DetailList = () => import('../views/Shopping-DetailList.vue');
const Cart = () => import('../views/shopping-cart.vue');
const Detail = () => import('../views/Shopping-Detail.vue');
const User = () => import('../views/User.vue');
const UserInformation = () => import('../components/User/UserInformation.vue');
const Order = () => import('../components/User/Order.vue');
const User_history = () => import('../components/User/User_history');
const error = () => import('../components/404');
const diversity = () => import('../views/diversity');


//admin
const login_admin = () => import('../views/admin/login.vue');
const admin_home = () => import('../views/admin/admin_home');
const admin_main = () => import('../components/admin/main');
const admin_work = () => import('../components/admin/work');
const userlist = () => import('../components/admin/userList');
const user_visualize = () => import('../components/admin/user_visualize');
const administrator = () => import('../components/admin/administrator');
const shopping = () => import('../components/admin/shopping');
// const shopping_stock = () => import('../components/admin/shopping_stock');
const order = () => import('../components/admin/order_information');
const comment = () => import('../components/admin/comment');
const comment_visualize = () => import('../components/admin/comment_visualize');
const banner = () => import('../components/admin/banner');
const project = () => import('../components/admin/project_information');
const about = () => import('../components/admin/about');
const admin_error = () => import('../components/admin/admin_error');

const routes = [
    {
        //登录
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        //分类
        path: '/category',
        name: 'category',
        component: category
    },
    {
        //商品列表展示
        path: '/DetailList',
        name: 'DetailList',
        component: DetailList
    },
    {
        //购物车
        path: '/Cart',
        name: "Cart",
        component: Cart
    },
    {
        //商品详情
        path: '/Detail',
        name: 'Detail',
        component: Detail
    },
    {
        //部分商品展示
        path: '/diversity',
        component:diversity
    },
    {
        //个人信息
        path: '/User',
        component: User,
        //重定向
        redirect: '/User/UserInformation',
        children: [
            //个人信息基本页面
            {
                path: 'UserInformation',
                component: UserInformation,
            },
            {
                path: 'Order',
                component: Order,
            },
            {
                path:'User_history',
                component:User_history
            }
        ]
    },
    {
        path: "/404",
        name: "error",
        component: error
    },
    {
        path: "/login_admin",
        name: "login_admin",
        component: login_admin
    },

    {
        path: "/admin_home",
        name: "admin_home",
        component: admin_home,
        //重定向
        redirect: '/admin_home/admin_main',
        children: [
            //主控台
            {
                path: 'admin_main',
                component: admin_main,
                meta: {
                    menu: [{
                        path: '/admin_home/admin_main',
                        name: '主控台'
                    }]
                }
            },
            //工作台
            {
                path: 'admin_work',
                component: admin_work,
                meta: {
                    menu: [{
                        path: '/admin_home/admin_work',
                        name: '工作台'
                    }]
                },
            },
            //用户信息
            {
                path: 'userlist',
                component: userlist,
                meta: {
                    menu: [{
                        path: '/admin_home/userlist',
                        name: '用户信息'
                    }]
                },
            },
            //管理员信息
            {
                path: 'administrator',
                component: administrator,
                meta: {
                    menu: [{
                        path: '/admin_home/administrator',
                        name: '管理员信息'
                    }]
                },
            },
            //用户可视化
            {
                path: 'user_visualize',
                component: user_visualize,
                meta: {
                    menu: [{
                        path: '/admin_home/user_visualize',
                        name: '用户可视化'
                    }]
                },
            },
            //商品信息
            {
                path: 'shopping',
                component: shopping,
                meta: {
                    menu: [{
                        path: '/admin_home/shopping',
                        name: '商品信息'
                    }]
                },
            },
            //商品可视化
            // {
            //     path:'shopping_stock',
            //     component:shopping_stock,
            //     meta:{
            //         menu:[{
            //             path:'/shopping_stock',
            //             name:'商品可视化'
            //         }]
            //     },
            // },
            //订单
            {
                path: 'order',
                component: order,
                meta: {
                    menu: [{
                        path: '/admin_home/order',
                        name: '订单'
                    }]
                },
            },
            //评论管理
            {
                path: 'comment',
                component: comment,
                meta: {
                    menu: [{
                        path: '/admin_home/comment',
                        name: '评论管理'
                    }]
                },
            },
            //评论可视化
            {
                path: 'comment_visualize',
                component: comment_visualize,
                meta: {
                    menu: [{
                        path: '/admin_home/comment_visualize',
                        name: '评论可视化'
                    }]
                },
            },
            //轮播图
            {
                path: 'banner',
                component: banner,
                meta: {
                    menu: [{
                        path: '/admin_home/banner',
                        name: '轮播图'
                    }]
                },
            },
            //项目信息
            {
                path: 'project',
                component: project,
                meta: {
                    menu: [{
                        path: '/admin_home/project',
                        name: '项目信息'
                    }]
                },
            },
            //关于
            {
                path: 'about',
                component: about,
                meta: {
                    menu: [{
                        path: '/admin_home/about',
                        name: '关于'
                    }]
                },
            },
            //后台404页面
            {
                path: '404',
                component: admin_error
            },
            {
                path: "*", // 此处需特别注意置于最底部
                redirect: "404"
            }
        ]
    },
    {
        path: "*", // 此处需特别注意置于最底部
        redirect: "/404"
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})
//解决路由冗余
const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
    return originalPush.call(this, location).catch(err => err)
}

export default router
