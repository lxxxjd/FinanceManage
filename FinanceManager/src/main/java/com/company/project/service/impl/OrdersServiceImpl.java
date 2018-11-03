package com.company.project.service.impl;

import com.company.project.dao.OrdersMapper;
import com.company.project.model.OrderAndNameTime;
import com.company.project.model.Orders;
import com.company.project.service.OrdersService;
import com.company.project.core.AbstractService;
import com.company.project.utils.DateUitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/29.
 */
@Service
@Transactional
public class OrdersServiceImpl extends AbstractService<Orders> implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public List<OrderAndNameTime> findByUid(String uid) {
        List<OrderAndNameTime> list =  ordersMapper.selectByUid(uid);
       for(int i =0;i<list.size();i++) {
            Date createTime = list.get(i).getCreateTime();
            Date incomeTime = list.get(i).getIncomeTime();
            list.get(i).setCreateTimeStr(DateUitls.getIncomeDateStr(createTime));
            list.get(i).setIncomeTimeStr(DateUitls.getIncomeDateStr(incomeTime));
        }
        return list;
    }
}
