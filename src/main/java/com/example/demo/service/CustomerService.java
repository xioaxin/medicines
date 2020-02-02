package com.example.demo.service;

import com.example.demo.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 顾客信息业务层
 * @author: ZPX
 * @createDate: 2020/2/2 14:20
 * @version: 1.0
 */
public interface CustomerService {
    int addCustomer(Customer customer);

    int deleteCustomer(Customer customer);

    int updateCustomer(Customer customer);

    Customer queryCustomer(Customer customer);

    List<Customer> findAll();
}




