package com.ashutosh.saas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tenants")
public class Tenant extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String tenantId;

    private String name;

    private boolean active = true;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
