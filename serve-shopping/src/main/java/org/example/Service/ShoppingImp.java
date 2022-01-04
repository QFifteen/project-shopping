package org.example.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.Mapper.ShoppingDAO;
import org.example.entity.User;
import org.example.entity.administrator;
import org.example.entity.commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingImp implements ShoppingService{
    @Autowired
    private ShoppingDAO shoppingDAO;

    @Override
    public PageInfo Usershow(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = shoppingDAO.Usershow();
        PageInfo page = new PageInfo(list);
        return page;
    }

    @Override
    public User Userlogin(String User_name, Integer User_pass) {
        return shoppingDAO.Userlogin(User_name,User_pass);
    }

    @Override
    public boolean UserAdd(User user) {
        User user1 = new User();
        user1.UserAdd(user.getUser_name(),user.getUser_gender(),user.getUser_email(),user.getUser_pass(),"http://172.16.254.1:8081/images/loginimg.png");
        return shoppingDAO.UserAdd(user1);
    }

    @Override
    public boolean UserUP(User user) {
        return shoppingDAO.UserUP(user);
    }

    @Override
    public boolean UserDel(Integer User_id) {
        return shoppingDAO.UserDel(User_id);
    }

    @Override
    public boolean UserDelList(List<Integer> idList) {
        return shoppingDAO.UserDelList(idList);
    }

    @Override
    public administrator adminlogin(String Administrator_name, int Administrator_pass) {
        return shoppingDAO.adminlogin(Administrator_name, Administrator_pass);
    }

    @Override
    public PageInfo adminshow(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<administrator> list = shoppingDAO.adminshow();
        PageInfo page = new PageInfo(list);
        return page;
    }

    @Override
    public PageInfo shoppingshow(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<commodity> list = shoppingDAO.shoppingshow();
        PageInfo page = new PageInfo(list);
        return page;
    }
}
