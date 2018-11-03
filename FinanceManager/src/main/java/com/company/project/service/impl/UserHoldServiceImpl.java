package com.company.project.service.impl;

import com.company.project.dao.OrdersMapper;
import com.company.project.dao.UserHoldMapper;
import com.company.project.model.BuyProduct;
import com.company.project.model.Orders;
import com.company.project.model.UserHold;
import com.company.project.model.UserHoldAndName;
import com.company.project.service.UserHoldService;
import com.company.project.core.AbstractService;
import com.company.project.utils.DateUitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Date;
import java.util.UUID;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class UserHoldServiceImpl extends AbstractService<UserHold> implements UserHoldService {
    @Resource
    private UserHoldMapper userHoldMapper;

    @Override
    public List<UserHoldAndName> findByUid(String uid) {
        return userHoldMapper.selectByUid(uid);
    }
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public UserHold findByUidAndFpid(String uid, String fpid) {
        return userHoldMapper.selectByUidAndFpid(uid,fpid);
    }

    @Override
    public boolean saveOrder(BuyProduct buyProduct,String type) {
        Date incomeDate = DateUitls.getIncomeDate("2018-10-29 00:00:00");
        Orders orders =new Orders(UUID.randomUUID().toString(), buyProduct.getUid(), buyProduct.getFpid(),
                type, new Date(), "余额"+type, "余额",buyProduct.getBuyMoney(), "交易完成", incomeDate);
        int result = ordersMapper.insert(orders);
        if(result !=0){
            return  true;
        }
        return false;
    }

    @Override
    public UserHold addHold(BuyProduct buyProduct) {
        UserHold userHold =null;
        try {
            userHold = userHoldMapper.selectByUidAndFpid(buyProduct.getUid(),buyProduct.getFpid());
            if(userHold!=null){
                userHold.setHoldMoney(userHold.getHoldMoney()+buyProduct.getBuyMoney());
                userHoldMapper.updateByPrimaryKey(userHold);
            }else {
                userHold = new UserHold(UUID.randomUUID().toString(), buyProduct.getFpid(), buyProduct.getUid(), buyProduct.getBuyMoney(),0.0, 0.0);
                userHoldMapper.insert(userHold);
            }
        }catch (Exception e){
        }
        return  userHold;
    }

    @Override
    public UserHold saleHold(BuyProduct buyProduct) {
        UserHold userHold =null;
        try {
            userHold = userHoldMapper.selectByUidAndFpid(buyProduct.getUid(),buyProduct.getFpid());
            if(userHold!=null){
                double resultMoney = userHold.getHoldMoney()-buyProduct.getBuyMoney();
                if(resultMoney>0){
                    userHold.setHoldMoney(resultMoney);
                    userHoldMapper.updateByPrimaryKey(userHold);
                }else if(resultMoney ==0){
                    userHoldMapper.delete(userHold);
                    userHold.setHoldMoney(0.0);
                }else{
                    return null;
                }
            }else {
                return null;
            }
        }catch (Exception e){
            return null;
        }
        return userHold;
    }
}
