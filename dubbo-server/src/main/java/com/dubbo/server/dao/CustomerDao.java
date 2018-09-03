package com.dubbo.server.dao;

import com.dubbo.common.model.Customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Describe：
 * Author：sunqiushun
 * Date：2018-09-03 14:44:13
 */
public interface CustomerDao {

    @Select("select * from u_user t where t.id = #{id}")
    Customer getCustomerDao(@Param("id") int id);

    @Select("select * from u_user")
    List<Customer> getCustomersDao();

}
