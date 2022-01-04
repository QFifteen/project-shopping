import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        data1: [
            {
                name: 'John Brown',
                age: 18,
                address: 'New York No. 1 Lake Park',
                date: '2016-10-03',
                shopping_img: require("../assets/images/shopping/DM_20211115203702_017.png"),
                bannerimg: require("../assets/images/banner/banner1.jpg")
            },
            {
                name: 'Jim Green',
                age: 24,
                address: 'London No. 1 Lake Park',
                date: '2016-10-01',
                img: require("../assets/images/logo/shiwu.jpg"),
                bannerimg: require("../assets/images/banner/banner1.jpg")
            },
            {
                name: 'Joe Black',
                age: 30,
                address: 'Sydney No. 1 Lake Park',
                date: '2016-10-02',
                // img: require("../assets/images/logo/shiwu.jpg")
                bannerimg: require("../assets/images/banner/banner1.jpg")
            },
            {
                name: 'Jon Snow',
                age: 26,
                address: 'Ottawa No. 2 Lake Park',
                date: '2016-10-04',
                // img: require("../assets/images/logo/logo.png")
                bannerimg: require("../assets/images/banner/banner1.jpg")
            }
        ],
        //用户
        Userinformation: {},
        //管理员
        administrator:{},
        //账号登录正则:只能输入5-12个以字母开头、可带数字、“_”、“.”的字串
        patrn_name: /^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,11}$/,
        //Email正则
        reg: new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"),
        //密码正则:全由数字组成,由6-15个数字组成
        patrn_pass : /^[0-9]{5,14}$/,
    },
    mutations: {},
    actions: {},
    modules: {}
})
