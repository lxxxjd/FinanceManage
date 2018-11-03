package com.company.project.service.impl;

import com.company.project.dao.FinanceProductMapper;
import com.company.project.model.FinanceProduct;
import com.company.project.service.FinanceProductService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class FinanceProductServiceImpl extends AbstractService<FinanceProduct> implements FinanceProductService {
    @Resource
    private FinanceProductMapper financeProductMapper;

    @Override
    public FinanceProduct FindByID(String ID) {
        return financeProductMapper.selectByID(ID);
    }
}
