package com.study.syslog.entity.shiro;import org.springframework.data.annotation.Id;import org.springframework.data.mongodb.core.mapping.Document;/** * @author myt_ac@163.com * @title: Permission * @description: TODO * @date 2019/6/415:58 */@Documentpublic class Permission {    @Id    private String id;    private String permission;    public String getId() {        return id;    }    public void setId(String id) {        this.id = id;    }    public String getPermission() {        return permission;    }    public void setPermission(String permission) {        this.permission = permission;    }}