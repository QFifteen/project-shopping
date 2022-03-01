package org.example.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.Mapper.ShoppingDAO;
import org.example.entity.User;
import org.example.entity.administrator;
import org.example.entity.commodity_whole;
import org.example.entity.commodityimgurl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//业务逻辑
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
        List<commodity_whole> list = shoppingDAO.shoppingshow();
        PageInfo page = new PageInfo(list);
        return page;
    }

    @Override
    public commodity_whole shoppingID(Integer Commodity_id) {
        return shoppingDAO.shoppingID(Commodity_id);
    }

    @Override
    public List<commodityimgurl> shoppingimgID(Integer Commodity_id) {
        return shoppingDAO.shoppingimgID(Commodity_id);
    }

    @Override
    public boolean shoppingDel(Integer Commodity_id) {
        return shoppingDAO.shoppingDel(Commodity_id);
    }

    @Override
    public boolean shoppingUP(commodity_whole commodity_whole) {
        return shoppingDAO.shoppingUP(commodity_whole);
    }

    @Override
    public boolean shoppingImgUP(String Commodity_img, Integer Commodity_id) {
        return shoppingDAO.shoppingImgUP(Commodity_img,Commodity_id);
    }

    @Override
    public boolean shoppingDataAdd(commodity_whole commodity_whole) {
        return shoppingDAO.shoppingDataAdd(commodity_whole);
    }

    @Override
    public List<commodity_whole> shoppingMaxID() {
        return shoppingDAO.shoppingMaxID();
    }


    @Override
    public boolean shoppingDelList(List<Integer> idList) {
        return shoppingDAO.shoppingDelList(idList);
    }

    @Override
    public boolean shoppingDelImgList(List<Integer> idList) {
        return shoppingDAO.shoppingDelImgList(idList);
    }
}
