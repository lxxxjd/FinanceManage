package com.company.project.service.impl;

import com.company.project.dao.OrderMapper;
import com.company.project.model.Order;
import com.company.project.service.OrderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class OrderServiceImpl extends AbstractService<Order> implements OrderService {
    @Resource
    private OrderMapper orderMapper;

}
