package org.example.Service;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.example.entity.*;

import java.util.List;


public interface ShoppingService {
    //用户显示
    public PageInfo Usershow(int a,int b);

    //用户登录
    User Userlogin(@Param("User_name") String User_name,@Param("User_pass") Integer User_pass);
    //用户注册
    boolean UserAdd(User user);
    //用户修改
    boolean UserUP(User user);
    //用户删除
    boolean UserDel(@Param("User_id") Integer User_id);
    //批量删除
    boolean UserDelList(@Param("User_id") List<Integer> idList);
    //管理员登录
    administrator adminlogin(@Param("Administrator_name")String Administrator_name,@Param("Administrator_pass")int Administrator_pass);

    //管理员显示
    public PageInfo adminshow(int a,int b);

    //商品显示
    public PageInfo shoppingshow(int a,int b);

    //根据商品显示
    public commodity_whole shoppingID(@Param("Commodity_id")Integer Commodity_id);

    //根据商品id查询list图片
    public List<commodityimgurl> shoppingimgID(@Param("Commodity_id")Integer Commodity_id);

    //商品id删除
    public boolean shoppingDel(@Param("Commodity_id")Integer Commodity_id);

    //商品修改
    public boolean shoppingUP(commodity_whole commodity_whole);

    //商品图片添加
    public boolean shoppingImgUP(@Param("Commodity_img")String Commodity_img, @Param("Commodity_id")Integer Commodity_id);

    //商品数据添加
    public boolean shoppingDataAdd(commodity_whole commodity_whole);

    //查商品MAX_id
    public List<commodity_whole> shoppingMaxID();

    //商品批量删除
    boolean shoppingDelList(@Param("Commodity_id") List<Integer> idList);

    //商品图片批量删除
    boolean shoppingDelImgList(@Param("Commodity_id") List<Integer> idList);

    List<json> jsonshow();
}
