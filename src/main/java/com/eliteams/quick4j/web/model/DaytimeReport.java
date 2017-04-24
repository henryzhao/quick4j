package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;

public class DaytimeReport {
    private String reportid;

    private String servicename;

    private String serviceid;

    private Integer sepamount;

    private BigDecimal sepsingleprice;

    private BigDecimal septotalamt;

    private Integer vipamount;

    private BigDecimal vipsingleprice;

    private BigDecimal viptotalamt;

    private BigDecimal totalamt;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public Integer getSepamount() {
        return sepamount;
    }

    public void setSepamount(Integer sepamount) {
        this.sepamount = sepamount;
    }

    public BigDecimal getSepsingleprice() {
        return sepsingleprice;
    }

    public void setSepsingleprice(BigDecimal sepsingleprice) {
        this.sepsingleprice = sepsingleprice;
    }

    public BigDecimal getSeptotalamt() {
        return septotalamt;
    }

    public void setSeptotalamt(BigDecimal septotalamt) {
        this.septotalamt = septotalamt;
    }

    public Integer getVipamount() {
        return vipamount;
    }

    public void setVipamount(Integer vipamount) {
        this.vipamount = vipamount;
    }

    public BigDecimal getVipsingleprice() {
        return vipsingleprice;
    }

    public void setVipsingleprice(BigDecimal vipsingleprice) {
        this.vipsingleprice = vipsingleprice;
    }

    public BigDecimal getViptotalamt() {
        return viptotalamt;
    }

    public void setViptotalamt(BigDecimal viptotalamt) {
        this.viptotalamt = viptotalamt;
    }

    public BigDecimal getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(BigDecimal totalamt) {
        this.totalamt = totalamt;
    }
}