package com.my.pojo;

public class SysrolePriv {
    private Long id;

    private Long roleId;

    private String privIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getPrivIds() {
        return privIds;
    }

    public void setPrivIds(String privIds) {
        this.privIds = privIds == null ? null : privIds.trim();
    }
}