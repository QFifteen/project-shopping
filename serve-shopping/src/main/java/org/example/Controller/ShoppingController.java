package org.example.Controller;


import com.github.pagehelper.PageInfo;
import org.example.Service.ShoppingService;
import org.example.entity.User;
import org.example.entity.administrator;
import org.example.entity.commodity_whole;
import org.example.entity.commodityimgurl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    //用户显示
    //pageNum 页数
    //pageSize 条数
    @CrossOrigin
    @GetMapping("/usershow")
    public PageInfo Usershow(int pagenum, int pagesize) {
        return shoppingService.Usershow(pagenum, pagesize);
    }

    //用户登录
    @CrossOrigin
    @PostMapping("/userlogin")
    public User Userlogin(String User_name, Integer User_pass) {
        return shoppingService.Userlogin(User_name, User_pass);
    }

    //用户注册
    @CrossOrigin
    @PostMapping("/useradd")
    public boolean UserAdd(User user) {
        return shoppingService.UserAdd(user);
    }

    //用户修改
    @CrossOrigin
    @PutMapping("/userup")
    public boolean UserUP(User user) {
        return shoppingService.UserUP(user);
    }

    //用户删除
    @CrossOrigin
    @DeleteMapping("/userdel")
    public boolean UserDel(Integer User_id) {
        return shoppingService.UserDel(User_id);
    }

    //用户批量删除
    @CrossOrigin
    @PostMapping("/userdellist")
    public boolean UserDelList(@RequestParam(value = "User_id", required = false) List<Integer> idList) {
        return shoppingService.UserDelList(idList);
    }

    //管理员登录
    @CrossOrigin
    @PostMapping("/adminlogin")
    public administrator adminlogin(String Administrator_name, int Administrator_pass) {
        return shoppingService.adminlogin(Administrator_name, Administrator_pass);
    }

    //管理员显示
    //pageNum 页数
    //pageSize 条数
    @CrossOrigin
    @GetMapping("/adminshow")
    public PageInfo adminshow(int pagenum, int pagesize) {
        return shoppingService.adminshow(pagenum, pagesize);
    }

    //商品显示
    //pageNum 页数
    //pageSize 条数
    @CrossOrigin
    @GetMapping("/shoppingshow")
    public PageInfo shoppingshow(int pagenum, int pagesize) {
        return shoppingService.shoppingshow(pagenum, pagesize);
    }

    //id查询商品
    @CrossOrigin
    @PostMapping("/shoppingID")
    public commodity_whole shoppingID(Integer Commodity_id) {
        return shoppingService.shoppingID(Commodity_id);
    }

    //id查询商品图片
    @CrossOrigin
    @PostMapping("/shoppingimgID")
    public List<commodityimgurl> shoppingimgID(Integer Commodity_id){
        return shoppingService.shoppingimgID(Commodity_id);
    }

    //商品id删除
    @CrossOrigin
    @PostMapping("/shoppingDel")
    public boolean shoppingDel(Integer Commodity_id) {
        return shoppingService.shoppingDel(Commodity_id);
    }

    //商品修改
    @CrossOrigin
    @PostMapping("/shoppingUP")
    public boolean shoppingUP(commodity_whole commodity_whole){
//        String filePath;
//        filePath = "D:\\Project-Shopping\\imgList\\";
//        String name = request.getParameter("Commodity_name");
//        String id = request.getParameter("Commodity_id");
//        String text = request.getParameter("Commodity_text");
//        String cost = request.getParameter("Commodity_const");
//        String price = request.getParameter("Commodity_price");
//        String sell = request.getParameter("Commodity_ sell");
//        String time = request.getParameter("Commodity_time");
//        String state = request.getParameter("Commodity_state");
//        String name2 = request.getParameter("Classification_name");
//        String subdivision = request.getParameter("Classification_subdivision");
//        String category = request.getParameter("Classification_category");
//        Part tp = request.getPart("Commodity_img");
//        String tpname = tp.getSubmittedFileName();
//        String newFileName = UUID.randomUUID()+tpname;
//        System.out.println(newFileName);
//        new File(filePath).mkdir();

//        Timestamp timestamp = new Timestamp(commodity_whole.getCommodity_time());
        return shoppingService.shoppingUP(commodity_whole);
    }

    @CrossOrigin
    @PostMapping("/shippingImgUP")
    public boolean shoppingImgUP(@RequestParam("Commodity_img") MultipartFile file,Integer Commodity_id) throws IOException {
        String filePath;
        filePath = "D:\\Project-Shopping\\imgList\\";
        String Filename = file.getOriginalFilename();

        String newFileName = UUID.randomUUID()+Filename;
        File targetFile = new File(filePath,newFileName);
        file.transferTo(targetFile);
//        System.out.println(Commodity_id);
//        System.out.println(file+"xaaa");
        return shoppingService.shoppingImgUP(newFileName,Commodity_id);
    }

    @CrossOrigin
    @PostMapping("/shippingImgUP2")
    public boolean shoppingImgUP2(MultipartFile file) throws IOException {
        String filePath;
        filePath = "D:\\Project-Shopping\\imgList\\";
        String Filename = file.getOriginalFilename();

        String newFileName = UUID.randomUUID()+Filename;
        File targetFile = new File(filePath,newFileName);
        file.transferTo(targetFile);
//        System.out.println(file);
        return false;
    }


    //商品数据添加
    @CrossOrigin
    @PostMapping("/shoppingDataAdd")
    public boolean shoppingDataadd(commodity_whole commodity_whole){
//        System.out.println(commodity_whole.getCommodity_time());
        System.out.println(commodity_whole.getCommodity_id());
        return shoppingService.shoppingDataAdd(commodity_whole);
    }

    //商品Max_id查询
    @CrossOrigin
    @GetMapping("/shoppingMaxid")
    public List<commodity_whole> shoppingMaxID(){
        return shoppingService.shoppingMaxID();
    }

    //商品批量删除
    @CrossOrigin
    @PostMapping("/shoppingDelList")
    public boolean shoppingDelList(@RequestParam(value = "Commodity_id", required = false) List<Integer> idList) {
        System.out.println(idList);
        return shoppingService.shoppingDelList(idList);
    }

    //商品图片批量删除
    @CrossOrigin
    @PostMapping("/shoppingDelImgList")
    public boolean shoppingDelImgList(@RequestParam(value = "Commodity_id", required = false) List<Integer> idList) {
        System.out.println(idList);
        return shoppingService.shoppingDelImgList(idList);
    }

}
