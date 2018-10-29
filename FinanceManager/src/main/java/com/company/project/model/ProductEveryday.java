package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_everyday")
public class ProductEveryday {
    /**
     * 编号
     */
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
     * 获取编号
     *
     * @return peid - 编号
     */
    public String getPeid() {
        return peid;
    }

    /**
     * 设置编号
     *
     * @param peid 编号
     */
    public void setPeid(String peid) {
        this.peid = peid;
    }

    /**
     * 获取七日年度收益
     *
     * @return seven_rate - 七日年度收益
     */
    public String getSevenRate() {
        return sevenRate;
    }

    /**
     * 设置七日年度收益
     *
     * @param sevenRate 七日年度收益
     */
    public void setSevenRate(String sevenRate) {
        this.sevenRate = sevenRate;
    }

    /**
     * 获取万分收益
     *
     * @return divided_income - 万分收益
     */
    public Double getDividedIncome() {
        return dividedIncome;
    }

    /**
     * 设置万分收益
     *
     * @param dividedIncome 万分收益
     */
    public void setDividedIncome(Double dividedIncome) {
        this.dividedIncome = dividedIncome;
    }

    /**
     * 获取产品编号
     *
     * @return fpid - 产品编号
     */
    public String getFpid() {
        return fpid;
    }

    /**
     * 设置产品编号
     *
     * @param fpid 产品编号
     */
    public void setFpid(String fpid) {
        this.fpid = fpid;
    }

    /**
     * 获取创建日期
     *
     * @return create_time - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取收益开始日期
     *
     * @return income_time - 收益开始日期
     */
    public Date getIncomeTime() {
        return incomeTime;
    }

    /**
     * 设置收益开始日期
     *
     * @param incomeTime 收益开始日期
     */
    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    /**
     * 获取收益到账日期
     *
     * @return arrival_time - 收益到账日期
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 设置收益到账日期
     *
     * @param arrivalTime 收益到账日期
     */
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}