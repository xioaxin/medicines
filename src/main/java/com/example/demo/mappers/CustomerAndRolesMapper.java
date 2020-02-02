package com.example.demo.mappers;

import com.example.demo.pojo.CustomerAndRoles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/**
 * @Description: 顾客角色信息关联表Mapper层
 * @author: ZPX
 * @createDate: 2020/2/2 9:14
 * @version: 1.0
 */
public interface CustomerAndRolesMapper {
    /**
     * 添加顾客角色信息
     *
     * @param record
     * @return
     */
    int insertSelective(CustomerAndRoles record);

    /**
     * 删除顾客角色信息
     *
     * @param customerRoles
     * @return
     */
    int deleteCustomerRoles(CustomerAndRoles customerRoles);

    /**
     * 更新顾客角色信息
     *
     * @param customerRoles
     * @return
     */
    int updateCustomerRoles(CustomerAndRoles customerRoles);

    /**
     * 查询顾客角色信息
     *
     * @param customerRoles
     * @return
     */
    List<CustomerAndRoles> queryCustomerRoles(CustomerAndRoles customerRoles);

    /**
     * 查询全部顾客角色信息
     *
     * @return
     */
    List<CustomerAndRoles> findAll();
}