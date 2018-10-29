package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Orders {
    /**
     * 订单
     */
    @Id
    private String oid;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 产品id
     */
    private String fpid;

    /**
     * 订单类型/卖出，买入
     */
    @Column(name = "order_type")
    private String orderType;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 交易方式
     */
    @Column(name = "mean_transaction")
    private String meanTransaction;

    /**
     * 来源/去处
     */
    @Column(name = "source_destination")
    private String sourceDestination;

    /**
     * 交易金额
     */
    private Double money;

    /**
     * 成功/失败
     */
    private String state;

    /**
     * 到账时间
     */
    @Column(name = "income_time")
    private Date incomeTime;

    /**
     * 获取订单
     *
     * @return oid - 订单
     */
    public String getOid() {
        return oid;
    }

    /**
     * 设置订单
     *
     * @param oid 订单
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取产品id
     *
     * @return fpid - 产品id
     */
    public String getFpid() {
        return fpid;
    }

    /**
     * 设置产品id
     *
     * @param fpid 产品id
     */
    public void setFpid(String fpid) {
        this.fpid = fpid;
    }

    /**
     * 获取订单类型/卖出，买入
     *
     * @return order_type - 订单类型/卖出，买入
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型/卖出，买入
     *
     * @param orderType 订单类型/卖出，买入
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取交易方式
     *
     * @return mean_transaction - 交易方式
     */
    public String getMeanTransaction() {
        return meanTransaction;
    }

    /**
     * 设置交易方式
     *
     * @param meanTransaction 交易方式
     */
    public void setMeanTransaction(String meanTransaction) {
        this.meanTransaction = meanTransaction;
    }

    /**
     * 获取来源/去处
     *
     * @return source_destination - 来源/去处
     */
    public String getSourceDestination() {
        return sourceDestination;
    }

    /**
     * 设置来源/去处
     *
     * @param sourceDestination 来源/去处
     */
    public void setSourceDestination(String sourceDestination) {
        this.sourceDestination = sourceDestination;
    }

    /**
     * 获取交易金额
     *
     * @return money - 交易金额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置交易金额
     *
     * @param money 交易金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取成功/失败
     *
     * @return state - 成功/失败
     */
    public String getState() {
        return state;
    }

    /**
     * 设置成功/失败
     *
     * @param state 成功/失败
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取到账时间
     *
     * @return income_time - 到账时间
     */
    public Date getIncomeTime() {
        return incomeTime;
    }

    /**
     * 设置到账时间
     *
     * @param incomeTime 到账时间
     */
    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    public Orders(String oid, String uid, String fpid, String orderType, Date createTime, String meanTransaction, String sourceDestination, Double money, String state, Date incomeTime) {
        this.oid = oid;
        this.uid = uid;
        this.fpid = fpid;
        this.orderType = orderType;
        this.createTime = createTime;
        this.meanTransaction = meanTransaction;
        this.sourceDestination = sourceDestination;
        this.money = money;
        this.state = state;
        this.incomeTime = incomeTime;
    }

    public Orders() {

    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", uid='" + uid + '\'' +
                ", fpid='" + fpid + '\'' +
                ", orderType='" + orderType + '\'' +
                ", createTime=" + createTime +
                ", meanTransaction='" + meanTransaction + '\'' +
                ", sourceDestination='" + sourceDestination + '\'' +
                ", money=" + money +
                ", state='" + state + '\'' +
                ", incomeTime=" + incomeTime +
                '}';
    }
}