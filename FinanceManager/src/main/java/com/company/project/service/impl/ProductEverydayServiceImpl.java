package com.company.project.service.impl;

import com.company.project.dao.ProductEverydayMapper;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;
import com.company.project.model.ProductEverydayAndTime;
import com.company.project.service.ProductEverydayService;
import com.company.project.core.AbstractService;
import com.company.project.utils.DateUitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class ProductEverydayServiceImpl extends AbstractService<ProductEveryday> implements ProductEverydayService {
    @Resource
    private ProductEverydayMapper productEverydayMapper;

    Date createDate = DateUitls.getIncomeDate("2018-10-29 00:00:00");
    @Override
    public List<ProductContact> findContact() {
        return productEverydayMapper.selectProduct(createDate);
    }

    @Override
    public List<ProductEverydayAndTime> findProductByProductId(String fpid) {
        List<ProductEverydayAndTime> list =productEverydayMapper.selectProductByProductId(fpid);
        for(int i =0;i<list.size();i++){
            list.get(i).setArrivalTimeStr(DateUitls.getDateStr(list.get(i).getArrivalTime()));
            list.get(i).setCreateTimeStr(DateUitls.getDateStr(list.get(i).getCreateTime()));
            list.get(i).setIncomeTimeStr(DateUitls.getDateStr(list.get(i).getIncomeTime()));
        }
        return list;
    }
}
