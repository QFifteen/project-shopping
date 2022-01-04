package org.example.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.User;
import org.example.entity.administrator;
import org.example.entity.commodity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ShoppingDAO {
    //用户显示
    public List<User> Usershow();

    //用户登录
    User Userlogin(@Param("User_name") String User_name, @Param("User_pass") Integer User_pass);

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
    public List<administrator> adminshow();

    //商品显示
    public List<commodity> shoppingshow();


}
