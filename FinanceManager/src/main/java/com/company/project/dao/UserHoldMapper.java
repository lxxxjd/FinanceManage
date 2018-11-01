package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserHold;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHoldMapper extends Mapper<UserHold> {
    public List<UserHold> selectByUid(String uid);
    public UserHold selectByUidAndFpid(@Param("uid") String uid, @Param("fpid")String fpid);
}