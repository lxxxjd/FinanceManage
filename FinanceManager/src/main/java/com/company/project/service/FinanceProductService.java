package com.company.project.service;
import com.company.project.model.FinanceProduct;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
public interface FinanceProductService extends Service<FinanceProduct> {
    public FinanceProduct FindByID(String ID);
}
