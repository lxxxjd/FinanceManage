package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class ProductContact {
    @Id
    private String peid;

    /**
     * 七日年度收益
     */
    @Column(name = "seven_rate")
    private String sevenRate;

    /**
     * 万分收益
     */
    @Column(name = "divided_income")
    private Double dividedIncome;

    /**
     * 产品编号
     */
    private String fpid;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 收益开始日期
     */
    @Column(name = "income_time")
    private Date incomeTime;

    /**
     * 收益到账日期
     */
    @Column(name = "arrival_time")
    private Date arrivalTime;

    /**
     * 产品类型
     */
    @Column(name = "product_type")
    private String productType;

    /**
     * 理财产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 产品期限
     */
    @Column(name = "product_term")
    private String productTerm;

    /**
     * 起购金额
     */
    @Column(name = "purchase_amount")
    private String purchaseAmount;

    /**
     * 风险等级
     */
    @Column(name = "risk_level")
    private String riskLevel;

    /**
     * pdf介绍的文件地址
     */
    @Column(name = "introduce_pdf")
    private String introducePdf;

    public String getPeid() {
        return peid;
    }

    public void setPeid(String peid) {
        this.peid = peid;
    }

    public String getSevenRate() {
        return sevenRate;
    }

    public void setSevenRate(String sevenRate) {
        this.sevenRate = sevenRate;
    }

    public Double getDividedIncome() {
        return dividedIncome;
    }

    public void setDividedIncome(Double dividedIncome) {
        this.dividedIncome = dividedIncome;
    }

    public String getFpid() {
        return fpid;
    }

    public void setFpid(String fpid) {
        this.fpid = fpid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTerm() {
        return productTerm;
    }

    public void setProductTerm(String productTerm) {
        this.productTerm = productTerm;
    }

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getIntroducePdf() {
        return introducePdf;
    }

    public void setIntroducePdf(String introducePdf) {
        this.introducePdf = introducePdf;
    }
}
