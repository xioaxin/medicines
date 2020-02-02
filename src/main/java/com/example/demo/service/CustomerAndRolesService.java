package com.example.demo.service;

import com.example.demo.pojo.CustomerAndRoles;

import java.util.List;

/**
 * @Description:顾客角色关联信息业务层
 * @author: ZPX
 * @createDate: 2020/2/2 14:21
 * @version: 1.0
 */
public interface CustomerAndRolesService {
    int addCustomerAndRoles(CustomerAndRoles customerAndRoles);

    int deleteCustomerAndRoles(CustomerAndRoles customerAndRoles);

    int updateCustomerAndRoles(CustomerAndRoles customerAndRoles);

    List<CustomerAndRoles> queryCustomerAndRoles(CustomerAndRoles customerAndRoles);

    List<CustomerAndRoles> findAll();
}




