package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserHold;
import com.company.project.model.UserHoldAndName;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHoldMapper extends Mapper<UserHold> {
    public List<UserHoldAndName> selectByUid(@Param("uid") String uid);
    public UserHold selectByUidAndFpid(@Param("uid") String uid, @Param("fpid")String fpid);
}