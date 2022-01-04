import {Del, Dellist, GET, POST, PUT} from "@/API/http";

const url = 'http://localhost:8082';
//登录
export const login = data => POST(url+'/userlogin',data);
//注册
export const useradd = data => POST(url+'/useradd',data);

//用户显示
export const usershow = data => GET(url+'/usershow',data);

//用户修改
export const userupdata = data => PUT(url+'/userup',data);

//用户单个删除
export const userdel = data => Del(url+'/userdel',data);

//用户批量删除
export const useridlist = data =>Dellist(url+'/userdellist',data);

//管理员登录
export const adminlogin = data => POST(url+'/adminlogin',data);

//管理员显示
export const adminshow = data => GET(url+'/adminshow',data);

//商品显示
export const shoppingshow = data => GET(url+'/shoppingshow',data);


