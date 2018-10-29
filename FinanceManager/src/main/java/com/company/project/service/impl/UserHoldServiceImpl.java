package com.company.project.service.impl;

import com.company.project.dao.UserHoldMapper;
import com.company.project.model.UserHold;
import com.company.project.service.UserHoldService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class UserHoldServiceImpl extends AbstractService<UserHold> implements UserHoldService {
    @Resource
    private UserHoldMapper userHoldMapper;

    @Override
    public UserHold findByUidAndFpid(String uid, String fpid) {
        return userHoldMapper.selectByUidAndFpid(uid,fpid);
    }
}
