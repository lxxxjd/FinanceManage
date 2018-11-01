package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserHold;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHoldMapper extends Mapper<UserHold> {
<<<<<<< HEAD
    public List<UserHold> selectByUid(String uid);
=======
    public UserHold selectByUidAndFpid(@Param("uid") String uid, @Param("fpid")String fpid);
>>>>>>> 7ed15ec682f522e1aa0324d24d4df33780da5e80
}