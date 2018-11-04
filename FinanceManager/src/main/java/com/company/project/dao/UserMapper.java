package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Login;
import com.company.project.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends Mapper<User> {
    public User selectByUserName(String username);
    public Login selectByUserNameAndPassword(@Param("username") String username,@Param("password") String password);
}