package com.example.demo.mappers;

import com.example.demo.pojo.Roles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/**
 * @Description: 角色信息表Mapper层
 * @author: ZPX
 * @createDate: 2020/2/2 9:14
 * @version: 1.0
 */
public interface RolesMapper {
    /**
     * 删除角色信息表数据
     *
     * @param rId
     * @return
     */
    int deleteByPrimaryKey(String rId);

    /**
     * 添加角色信息表信息
     *
     * @param record
     * @return
     */
    int insertSelective(Roles record);

    /**
     * 查询角色信息表信息
     *
     * @param rId
     * @return
     */
    Roles selectByPrimaryKey(String rId);

    /**
     * 更新角色信息表数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Roles record);

    /**
     * 查询全部角色信息表信息
     *
     * @return
     */
    List<Roles> findAll();

}