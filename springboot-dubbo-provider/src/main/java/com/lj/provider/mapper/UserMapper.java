package com.lj.provider.mapper;

import com.lj.common.domain.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// @Mapper
public interface UserMapper {

    @Select("SELECT * FROM u_user t WHERE t.id = #{id}")
    User getOne(int id);

    @Select("SELECT * FROM u_user t")
    List<User> getAll();

    // void insertUser(User user);
}
