package com.example.demo.serviceImpl;

import com.example.demo.mappers.RolesMapper;
import com.example.demo.pojo.Roles;
import com.example.demo.service.RolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:角色信息业务层实现层
 * @author: ZPX
 * @createDate: 2020/2/2 14:27
 * @version: 1.0
 */
@Service
public class RolesServiceImpl implements RolesService {
    @Resource
    private RolesMapper rolesMapper;

    @Override
    public int addRoles(Roles roles) {
        return rolesMapper.insertSelective(roles);
    }

    @Override
    public int deleteRoles(Roles roles) {
        return rolesMapper.deleteByPrimaryKey(roles.getrId());
    }

    @Override
    public int updateRoles(Roles roles) {
        return rolesMapper.updateByPrimaryKeySelective(roles);
    }

    @Override
    public Roles queryRoles(Roles roles) {
        return rolesMapper.selectByPrimaryKey(roles.getrId());
    }

    @Override
    public List<Roles> findAll() {
        return rolesMapper.findAll();
    }
}




