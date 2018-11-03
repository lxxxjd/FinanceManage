package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.OrderAndNameTime;
import com.company.project.model.Orders;
import com.company.project.model.User;

import java.util.List;

public interface OrdersMapper extends Mapper<Orders> {
    public List<OrderAndNameTime> selectByUid(String uid);
}
