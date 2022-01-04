package org.example.Service;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.example.entity.User;
import org.example.entity.administrator;
import org.example.entity.commodity;
import org.springframework.stereotype.Service;

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
}
