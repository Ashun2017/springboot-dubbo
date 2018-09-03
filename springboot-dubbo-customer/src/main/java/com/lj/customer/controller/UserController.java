package com.lj.customer.controller;

import com.lj.common.domain.User;
import com.lj.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gaopeng
 * Date: 2018/8/28 0028
 * Time: 17:45
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    // @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/getAll")
    public List<User> getAll(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.getAll();
    }

    @RequestMapping("/getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }

    @GetMapping("insertUser")
    public void insertUser(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        userService.insertUser();
    }
}
