package com.dubbo.invoker.Constroller;

import com.dubbo.common.model.Customer;
import com.dubbo.common.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Describe：
 * Author：sunqiushun
 * Date：2018-09-03 14:52:39
 */
@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/getCustomer")
    public Customer getCustomer() {
        System.out.println("getCustomer");
        return customerService.getCustomer(1);
    }

    @RequestMapping("/getCustomers")
    public List<Customer> getCustomers() {
        System.out.println("getCustomers");
        return customerService.getCustomers();
    }
}
