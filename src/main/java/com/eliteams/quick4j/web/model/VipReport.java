package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;

public class VipReport {
    private String vipreportid;

    private String userid;

    private String rechargedatetime;

    private BigDecimal rechargebefore;

    private BigDecimal rechargemoney;

    private BigDecimal awardmoney;

    private BigDecimal balance;

    public String getVipreportid() {
        return vipreportid;
    }

    public void setVipreportid(String vipreportid) {
        this.vipreportid = vipreportid == null ? null : vipreportid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRechargedatetime() {
        return rechargedatetime;
    }

    public void setRechargedatetime(String rechargedatetime) {
        this.rechargedatetime = rechargedatetime == null ? null : rechargedatetime.trim();
    }

    public BigDecimal getRechargebefore() {
        return rechargebefore;
    }

    public void setRechargebefore(BigDecimal rechargebefore) {
        this.rechargebefore = rechargebefore;
    }

    public BigDecimal getRechargemoney() {
        return rechargemoney;
    }

    public void setRechargemoney(BigDecimal rechargemoney) {
        this.rechargemoney = rechargemoney;
    }

    public BigDecimal getAwardmoney() {
        return awardmoney;
    }

    public void setAwardmoney(BigDecimal awardmoney) {
        this.awardmoney = awardmoney;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}