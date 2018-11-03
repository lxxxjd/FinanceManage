package com.company.project.model;

import javax.persistence.Column;

public class OrderAndNameTime extends  Orders{
    private String createTimeStr;
    private String incomeTimeStr;
    @Column(name = "product_name")
    private String productName;

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getIncomeTimeStr() {
        return incomeTimeStr;
    }

    public void setIncomeTimeStr(String incomeTimeStr) {
        this.incomeTimeStr = incomeTimeStr;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
