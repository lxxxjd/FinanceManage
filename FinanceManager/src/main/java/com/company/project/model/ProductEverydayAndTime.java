package com.company.project.model;

import javax.persistence.Column;
import java.util.Date;

public class ProductEverydayAndTime extends ProductEveryday {
    private String createTimeStr;
    private String incomeTimeStr;
    private String arrivalTimeStr;

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

    public String getArrivalTimeStr() {
        return arrivalTimeStr;
    }

    public void setArrivalTimeStr(String arrivalTimeStr) {
        this.arrivalTimeStr = arrivalTimeStr;
    }
}
