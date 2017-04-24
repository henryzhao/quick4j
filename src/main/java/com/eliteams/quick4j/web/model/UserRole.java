package com.eliteams.quick4j.web.model;

public class UserRole extends UserRoleKey {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}