package com.example.demo.serviceImpl;

import com.example.demo.pojo.Customer;
import com.example.demo.pojo.CustomerAndRoles;
import com.example.demo.pojo.Roles;
import com.example.demo.service.CustomerAndRolesService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.LoginService;
import com.example.demo.service.RolesService;
import org.apache.catalina.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description:登录功能业务逻辑实现层
 * @author: ZPX
 * @createDate: 2020/2/2 14:19
 * @version: 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private CustomerService customerService;
    @Resource
    private RolesService rolesService;
    @Resource
    private CustomerAndRolesService customerAndRolesService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //1.从数据库查询出顾客信息
        Customer customer = new Customer();
        customer.setcId(s);
        customer = customerService.queryCustomer(customer);
        if (customer.getcPassword() == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        CustomerAndRoles customerAndRoles = new CustomerAndRoles();
        customerAndRoles.setcId(customer.getcId());
        List<CustomerAndRoles> customerAndRolesList = customerAndRolesService.queryCustomerAndRoles(customerAndRoles);
        //2.添加权限
        for (CustomerAndRoles customerAndRoles1 : customerAndRolesList) {
            Roles roles = new Roles();
            roles.setrId(customerAndRoles1.getrId());
            roles = rolesService.queryRoles(roles);
            authorities.add(new SimpleGrantedAuthority(roles.getrName()));
        }
        return new User(customer.getcId(), customer.getcPassword(), authorities);
    }
}




