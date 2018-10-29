package com.company.project.service;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
public interface ProductEverydayService extends Service<ProductEveryday> {
    public List<ProductContact> findContact();//连接产品与该产品收益信息
}
