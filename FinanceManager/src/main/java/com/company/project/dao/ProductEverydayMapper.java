package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;

import java.util.List;

public interface ProductEverydayMapper extends Mapper<ProductEveryday> {
    public List<ProductContact> selectProduct();
}