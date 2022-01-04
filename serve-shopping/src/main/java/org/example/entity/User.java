package org.example.entity;

public class User {
    private int User_id;//用户ID
    private String User_name;//用户名
    private String User_gender;//性别
    private String User_email;//邮箱
    private int User_pass;//密码
    private String User_intro;//个性签名
    private int User_telephone;//手机号码
    private String User_img;//头像图片
    private int User_status;//用户等级
    private String User_address;//收货地址

    @Override
    public String toString() {
        return "User{" +
                "User_id=" + User_id +
                ", User_name='" + User_name + '\'' +
                ", User_gender='" + User_gender + '\'' +
                ", User_email='" + User_email + '\'' +
                ", User_pass=" + User_pass +
                ", User_intro='" + User_intro + '\'' +
                ", User_telephone=" + User_telephone +
                ", User_img='" + User_img + '\'' +
                ", User_status=" + User_status +
                ", User_address='" + User_address + '\'' +
                '}';
    }

    public void UserAdd(String User_name, String User_gender, String User_email, Integer User_pass, String User_img) {
        this.User_name = User_name;
        this.User_gender = User_gender;
        this.User_email = User_email;
        this.User_pass = User_pass;
        this.User_img = User_img;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getUser_gender() {
        return User_gender;
    }

    public void setUser_gender(String user_gender) {
        User_gender = user_gender;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String user_email) {
        User_email = user_email;
    }

    public int getUser_pass() {
        return User_pass;
    }

    public void setUser_pass(int user_pass) {
        User_pass = user_pass;
    }

    public String getUser_intro() {
        return User_intro;
    }

    public void setUser_intro(String user_intro) {
        User_intro = user_intro;
    }

    public int getUser_telephone() {
        return User_telephone;
    }

    public void setUser_telephone(int user_telephone) {
        User_telephone = user_telephone;
    }

    public String getUser_img() {
        return User_img;
    }

    public void setUser_img(String user_img) {
        User_img = user_img;
    }

    public int getUser_status() {
        return User_status;
    }

    public void setUser_status(int user_status) {
        User_status = user_status;
    }

    public String getUser_address() {
        return User_address;
    }

    public void setUser_address(String user_address) {
        User_address = user_address;
    }
}

