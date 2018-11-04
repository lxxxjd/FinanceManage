package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;
import com.company.project.model.ProductEverydayAndTime;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ProductEverydayMapper extends Mapper<ProductEveryday> {
    public List<ProductContact> selectProduct(@Param("create_time") Date createDateTime);
    public ProductContact selectProductById(@Param("create_time") Date createDateTime,@Param("fpid") String fpid);
    public List<ProductEverydayAndTime> selectProductByProductId(@Param("fpid") String  fpid);
}