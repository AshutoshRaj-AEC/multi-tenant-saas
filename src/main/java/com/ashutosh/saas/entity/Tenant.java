package com.ashutosh.saas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tenants")
public class Tenant extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String tenantId;

    private String name;

    private boolean active = true;
}
