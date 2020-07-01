package com.kai.working.entity;

import javax.persistence.*;

@Entity
@Table
public class Permission {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }
}
