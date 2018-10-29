package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.FinanceProduct;
import com.company.project.model.User;

public interface FinanceProductMapper extends Mapper<FinanceProduct> {
    public FinanceProduct selectByID(String ID);
}