package com.company.project.service;
import com.company.project.model.UserHold;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
public interface UserHoldService extends Service<UserHold> {

    UserHold findByUidAndFpid(String uid,String fpid);

}
