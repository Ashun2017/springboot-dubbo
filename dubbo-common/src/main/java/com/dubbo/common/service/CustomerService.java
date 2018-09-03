package com.dubbo.common.service;

import com.dubbo.common.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Describe：
 * Author：sunqiushun
 * Date：2018-09-03 14:36:03
 */
public interface CustomerService {
    Customer getCustomer(int id);
    List<Customer> getCustomers();
}
