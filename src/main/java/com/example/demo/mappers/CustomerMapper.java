package com.example.demo.mappers;

import com.example.demo.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/**
 * @Description: 顾客信息操作Mapper层
 * @author: ZPX
 * @createDate: 2020/2/2 9:14
 * @version: 1.0
 */
public interface CustomerMapper {
    /**
     * 通过顾客的编号删除顾客信息
     *
     * @param cId
     * @return
     */
    int deleteByPrimaryKey(String cId);

    /**
     * 添加顾客信息
     *
     * @param record
     * @return
     */
    int insertSelective(Customer record);

    /**
     * 查询顾客信息
     *
     * @param cId
     * @return
     */
    Customer selectByPrimaryKey(String cId);

    /**
     * 更新顾客信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * 查询全部顾客信息
     *
     * @return
     */
    List<Customer> findAll();
}