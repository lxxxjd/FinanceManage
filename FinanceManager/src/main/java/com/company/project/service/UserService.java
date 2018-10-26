package com.company.project.service;
import com.company.project.model.User;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
public interface UserService extends Service<User> {
    public boolean checkUseName(String userName);
}
