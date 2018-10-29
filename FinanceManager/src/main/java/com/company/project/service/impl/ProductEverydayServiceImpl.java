package com.company.project.service.impl;

import com.company.project.dao.ProductEverydayMapper;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;
import com.company.project.service.ProductEverydayService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class ProductEverydayServiceImpl extends AbstractService<ProductEveryday> implements ProductEverydayService {
    @Resource
    private ProductEverydayMapper productEverydayMapper;

    @Override
    public List<ProductContact> findContact() {
        return productEverydayMapper.selectProduct();
    }
}
