package com.company.project.service.impl;

import com.company.project.dao.UserMapper;
import com.company.project.model.Login;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean checkUseName(String userName) {
        User user = userMapper.selectByUserName(userName);
        if(user==null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Login selectByUserNameAndPassword(String username, String password) {
        return userMapper.selectByUserNameAndPassword(username,password);
    }
}
