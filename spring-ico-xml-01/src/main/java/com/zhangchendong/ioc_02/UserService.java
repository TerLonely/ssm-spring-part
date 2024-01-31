package com.zhangchendong.ioc_02;

/**
 * @author zhangchendong
 * @data 2024/1/29 15:26
 */
public class UserService {

    private UserDao userDao;

    private int age;

    private String name;

    public UserService(UserDao userDao){this.userDao = userDao;}

    public UserService(int age,String name,UserDao userDao){
        this.age = age;
        this.name = name;
        this.userDao = userDao;
    }





}
