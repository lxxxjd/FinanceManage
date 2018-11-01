package com.company.project.model;

import javax.persistence.*;

@Table(name = "user_hold")
public class UserHold {
    /**
     * 编号
     */
    @Id
    private String uhid;

    /**
     * 产品编号
     */
    private String fpid;

    /**
     * 用户编号
     */
    private String uid;

    /**
     * 持有的资金
     */
    @Column(name = "hold_money")
    private Double holdMoney;

    /**
     * 昨日收益
     */
    @Column(name = "yesterday_income")
    private Double yesterdayIncome;

    /**
     * 累计收益
     */
    @Column(name = "sum_income")
    private Double sumIncome;

    /**
     * 获取编号
     *
     * @return uhid - 编号
     */
    public String getUhid() {
        return uhid;
    }

    /**
     * 设置编号
     *
     * @param uhid 编号
     */
    public void setUhid(String uhid) {
        this.uhid = uhid;
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
     * 获取用户编号
     *
     * @return uid - 用户编号
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置用户编号
     *
     * @param uid 用户编号
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取持有的资金
     *
     * @return hold_money - 持有的资金
     */
    public Double getHoldMoney() {
        return holdMoney;
    }

    /**
     * 设置持有的资金
     *
     * @param holdMoney 持有的资金
     */
    public void setHoldMoney(Double holdMoney) {
        this.holdMoney = holdMoney;
    }

    /**
     * 获取昨日收益
     *
     * @return yesterday_income - 昨日收益
     */
    public Double getYesterdayIncome() {
        return yesterdayIncome;
    }

    /**
     * 设置昨日收益
     *
     * @param yesterdayIncome 昨日收益
     */
    public void setYesterdayIncome(Double yesterdayIncome) {
        this.yesterdayIncome = yesterdayIncome;
    }

    /**
     * 获取累计收益
     *
     * @return sum_income - 累计收益
     */
    public Double getSumIncome() {
        return sumIncome;
    }

    /**
     * 设置累计收益
     *
     * @param sumIncome 累计收益
     */
    public void setSumIncome(Double sumIncome) {
        this.sumIncome = sumIncome;
    }

    @Override
    public String toString() {
        return "UserHold{" +
                "uhid='" + uhid + '\'' +
                ", fpid='" + fpid + '\'' +
                ", uid='" + uid + '\'' +
                ", holdMoney=" + holdMoney +
                ", yesterdayIncome=" + yesterdayIncome +
                ", sumIncome=" + sumIncome +
                '}';
    }

    public UserHold() {
        super();
    }

    public UserHold(String uhid, String fpid, String uid, Double holdMoney, Double yesterdayIncome, Double sumIncome) {
        this.uhid = uhid;
        this.fpid = fpid;
        this.uid = uid;
        this.holdMoney = holdMoney;
        this.yesterdayIncome = yesterdayIncome;
        this.sumIncome = sumIncome;
    }
}