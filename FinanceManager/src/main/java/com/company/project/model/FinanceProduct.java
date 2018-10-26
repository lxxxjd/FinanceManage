package com.company.project.model;

import javax.persistence.*;

@Table(name = "finance_product")
public class FinanceProduct {
    /**
     * 编号
     */
    @Id
    private String fpid;

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

    /**
     * 获取编号
     *
     * @return fpid - 编号
     */
    public String getFpid() {
        return fpid;
    }

    /**
     * 设置编号
     *
     * @param fpid 编号
     */
    public void setFpid(String fpid) {
        this.fpid = fpid;
    }

    /**
     * 获取产品类型
     *
     * @return product_type - 产品类型
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置产品类型
     *
     * @param productType 产品类型
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 获取理财产品名称
     *
     * @return product_name - 理财产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置理财产品名称
     *
     * @param productName 理财产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取产品期限
     *
     * @return product_term - 产品期限
     */
    public String getProductTerm() {
        return productTerm;
    }

    /**
     * 设置产品期限
     *
     * @param productTerm 产品期限
     */
    public void setProductTerm(String productTerm) {
        this.productTerm = productTerm;
    }

    /**
     * 获取起购金额
     *
     * @return purchase_amount - 起购金额
     */
    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * 设置起购金额
     *
     * @param purchaseAmount 起购金额
     */
    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * 获取风险等级
     *
     * @return risk_level - 风险等级
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * 设置风险等级
     *
     * @param riskLevel 风险等级
     */
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * 获取pdf介绍的文件地址
     *
     * @return introduce_pdf - pdf介绍的文件地址
     */
    public String getIntroducePdf() {
        return introducePdf;
    }

    /**
     * 设置pdf介绍的文件地址
     *
     * @param introducePdf pdf介绍的文件地址
     */
    public void setIntroducePdf(String introducePdf) {
        this.introducePdf = introducePdf;
    }
}