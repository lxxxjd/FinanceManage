package com.company.project.model;

import javax.persistence.*;

public class User {
    /**
     * 编号
     */
    @Id
    private String uid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮件
     */
    private String email;

    /**
     * 账户余额
     */
    @Column(name = "account_alance")
    private Double accountAlance;

    /**
     * 支付密码
     */
    @Column(name = "account_password")
    private String accountPassword;

    /**
     * 获取编号
     *
     * @return uid - 编号
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置编号
     *
     * @param uid 编号
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取身份证
     *
     * @return id_card - 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证
     *
     * @param idCard 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮件
     *
     * @return email - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取账户余额
     *
     * @return account_alance - 账户余额
     */
    public Double getAccountAlance() {
        return accountAlance;
    }

    /**
     * 设置账户余额
     *
     * @param accountAlance 账户余额
     */
    public void setAccountAlance(Double accountAlance) {
        this.accountAlance = accountAlance;
    }

    /**
     * 获取支付密码
     *
     * @return account_password - 支付密码
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * 设置支付密码
     *
     * @param accountPassword 支付密码
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", accountAlance=" + accountAlance +
                ", accountPassword='" + accountPassword + '\'' +
                '}';
    }
}