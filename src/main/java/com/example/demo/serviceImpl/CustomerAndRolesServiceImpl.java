package com.example.demo.serviceImpl;

import com.example.demo.mappers.CustomerAndRolesMapper;
import com.example.demo.pojo.CustomerAndRoles;
import com.example.demo.service.CustomerAndRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:顾客角色关联信息业务实现层
 * @author: ZPX
 * @createDate: 2020/2/2 14:34
 * @version: 1.0
 */
@Service
public class CustomerAndRolesServiceImpl implements CustomerAndRolesService {
    @Resource
    private CustomerAndRolesMapper customerAndRolesMapper;

    @Override
    public int addCustomerAndRoles(CustomerAndRoles customerAndRoles) {
        return customerAndRolesMapper.insertSelective(customerAndRoles);
    }

    @Override
    public int deleteCustomerAndRoles(CustomerAndRoles customerAndRoles) {
        return customerAndRolesMapper.deleteCustomerRoles(customerAndRoles);
    }

    @Override
    public int updateCustomerAndRoles(CustomerAndRoles customerAndRoles) {
        return customerAndRolesMapper.updateCustomerRoles(customerAndRoles);
    }

    @Override
    public List<CustomerAndRoles> queryCustomerAndRoles(CustomerAndRoles customerAndRoles) {
        return customerAndRolesMapper.queryCustomerRoles(customerAndRoles);
    }

    @Override
    public List<CustomerAndRoles> findAll() {
        return customerAndRolesMapper.findAll();
    }
}




