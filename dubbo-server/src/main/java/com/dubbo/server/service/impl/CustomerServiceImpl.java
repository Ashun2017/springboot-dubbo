package com.dubbo.server.service.impl;

import com.dubbo.common.model.Customer;
import com.dubbo.common.service.CustomerService;
import com.dubbo.server.dao.CustomerDao;

import javax.annotation.Resource;
import java.util.List;

/**
 * Describe：
 * Author：sunqiushun
 * Date：2018-09-03 14:42:13
 */

public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public Customer getCustomer(int id) {
        System.out.println("getCustomerImpl");
        return customerDao.getCustomerDao(id);
    }

    @Override
    public List<Customer> getCustomers() {
        System.out.println("getCustomersImpl");
        return customerDao.getCustomersDao();
    }
}
