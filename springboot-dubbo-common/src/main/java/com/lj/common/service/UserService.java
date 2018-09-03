package com.lj.common.service;


import com.lj.common.domain.User;

import java.util.List;

/**
* @author gaopeng
* @date 2018/8/28 0028 18:04
*/
public interface UserService {
    User findUser();
    void insertUser();
    List<User> getAll();
}
