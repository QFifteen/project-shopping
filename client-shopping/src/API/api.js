import {Del, Dellist, GET, POST, PUT,PostFile} from "@/API/http";

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

//商品显示
export const shoppingID = data => POST(url+'/shoppingID',data);

//id查询商品图片
export const shoppingimgID = data => POST(url+'/shoppingimgID',data);


//商品id删除
export const shoppingDel = data => POST(url+'/shoppingDel',data);

//商品修改
export const shoppingUP = data => PostFile(url+'/shoppingUP',data);

//商品图片添加
//商品图片批量添加
export const shippingImgUP = data => PostFile(url+'/shippingImgUP',data);

//商品数据添加
export const shoppingDataadd = data => PostFile(url+'/shoppingDataAdd',data);


//商品获取IDMAX
export const shoppingMaxID = (data) => GET(url+'/shoppingMaxid',data);



//商品批量删除
export const shoppingDelList = data => Dellist(url+'/shoppingDelList',data);

//商品图片批量删除
export const shoppingDelImgList = data => Dellist(url+'/shoppingDelImgList',data);




