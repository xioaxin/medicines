package com.example.demo.serviceImpl;

import com.example.demo.mappers.CustomerMapper;
import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/2/2 14:23
 * @version: 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.insertSelective(customer);
    }

    @Override
    public int deleteCustomer(Customer customer) {
        return customerMapper.deleteByPrimaryKey(customer.getcId());
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public Customer queryCustomer(Customer customer) {
        return customerMapper.selectByPrimaryKey(customer.getcId());
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }
}




