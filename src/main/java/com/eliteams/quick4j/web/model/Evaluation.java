package com.eliteams.quick4j.web.model;

public class Evaluation {
    private String evalid;

    private String status;

    private Long praise;

    private String userid;

    private String orderid;

    private String evaluationdatetime;

    private String content;

    public String getEvalid() {
        return evalid;
    }

    public void setEvalid(String evalid) {
        this.evalid = evalid == null ? null : evalid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getPraise() {
        return praise;
    }

    public void setPraise(Long praise) {
        this.praise = praise;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getEvaluationdatetime() {
        return evaluationdatetime;
    }

    public void setEvaluationdatetime(String evaluationdatetime) {
        this.evaluationdatetime = evaluationdatetime == null ? null : evaluationdatetime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}