package com.lj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lj.common.domain.User;
import com.lj.common.service.UserService;
import com.lj.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gaopeng
 * Date: 2018/8/28 0028
 * Time: 20:02
 * Description:
 */
// @Transactional
// @Service(version = "1.0.0")
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User findUser() {
        User user = userMapper.getOne(1);
        System.out.println("user= " + user.toString());
        return user;
    }

    @Override
    // @Transactional
    public void insertUser() {
        User zhaodayan = new User();
        zhaodayan.setId(5);
        zhaodayan.setName("zhaodayang");
        zhaodayan.setAge(14);
        zhaodayan.setSex("男");

        User zhaoxiaoyan = new User();
        zhaoxiaoyan.setId(6);
        zhaoxiaoyan.setName("zhaoxiaoyang");
        zhaoxiaoyan.setAge(15);
        zhaoxiaoyan.setSex("女");

       /* userMapper.insertUser(zhaodayan);
        userMapper.insertUser(zhaoxiaoyan);*/
    }
}
