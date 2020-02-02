package com.example.demo.service;

import com.example.demo.pojo.Roles;
import com.example.demo.pojo.Roles;

import java.util.List;

/**
 * @Description:角色信息业务层
 * @author: ZPX
 * @createDate: 2020/2/2 14:21
 * @version: 1.0
 */
public interface RolesService {
    int addRoles(Roles roles);

    int deleteRoles(Roles roles);

    int updateRoles(Roles roles);

    Roles queryRoles(Roles roles);

    List<Roles> findAll();
}




