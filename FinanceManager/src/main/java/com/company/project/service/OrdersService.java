package com.company.project.service;
import com.company.project.model.OrderAndNameTime;
import com.company.project.model.Orders;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/29.
 */
public interface OrdersService extends Service<Orders> {
    public List<OrderAndNameTime> findByUid(String uid);
}
