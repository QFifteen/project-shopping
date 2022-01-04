package org.example.Controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.Service.ShoppingImp;
import org.example.Service.ShoppingService;
import org.example.entity.User;
import org.example.entity.administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    //用户显示
    //pageNum 页数
    //pageSize 条数
    @CrossOrigin
    @GetMapping("/usershow")
    public PageInfo Usershow(int pagenum,int pagesize){
        return shoppingService.Usershow(pagenum,pagesize);
    }

    //用户登录
    @CrossOrigin
    @PostMapping("/userlogin")
    public User Userlogin(String User_name,Integer User_pass){
        return shoppingService.Userlogin(User_name,User_pass);
    }
    //用户注册
    @CrossOrigin
    @PostMapping("/useradd")
    public boolean UserAdd(User user){
        return shoppingService.UserAdd(user);
    }
    //用户修改
    @CrossOrigin
    @PutMapping("/userup")
    public boolean UserUP(User user){
        return shoppingService.UserUP(user);
    }

    //用户删除
    @CrossOrigin
    @DeleteMapping("/userdel")
    public boolean UserDel(Integer User_id){
        return shoppingService.UserDel(User_id);
    }
    //用户批量删除
    @CrossOrigin
    @PostMapping("/userdellist")
    public boolean UserDelList( @RequestParam(value = "User_id",required = false) List<Integer> idList){
        return shoppingService.UserDelList(idList);
    }
    //管理员登录
    @CrossOrigin
    @PostMapping("/adminlogin")
    public administrator adminlogin(String Administrator_name,int Administrator_pass){
        return shoppingService.adminlogin(Administrator_name,Administrator_pass);
    }

    //管理员显示
    //pageNum 页数
    //pageSize 条数
    @CrossOrigin
    @GetMapping("/adminshow")
    public PageInfo adminshow(int pagenum,int pagesize){
        return shoppingService.adminshow(pagenum,pagesize);
    }

    //管理员显示
    //pageNum 页数
    //pageSize 条数
    @CrossOrigin
    @GetMapping("/shoppingshow")
    public PageInfo shoppingshow(int pagenum,int pagesize){
        return shoppingService.shoppingshow(pagenum,pagesize);
    }
}
