package com.company.project.service;
import com.company.project.model.Login;
import com.company.project.model.User;
import com.company.project.core.Service;
import org.apache.ibatis.annotations.Param;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
public interface UserService extends Service<User> {
    public boolean checkUseName(String userName);
    public Login selectByUserNameAndPassword( String username,String password);

}
