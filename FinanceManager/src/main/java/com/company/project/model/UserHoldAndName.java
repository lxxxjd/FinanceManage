package com.company.project.model;

import javax.persistence.Column;

public class UserHoldAndName extends  UserHold{
    /**
     * 理财产品名称
     */
    @Column(name = "product_name")
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }




}
