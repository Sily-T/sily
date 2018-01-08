package com.sily.api;
public class SysUserRole {
    private Long id;
    private Long createBy;
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private Long userId;
    private Long roleId;
    private Integer enable;
    private String remark;
    private Long updateBy;
    public SysUserRole() {
        super();
    }
    public SysUserRole(Long id,Long createBy,java.util.Date updateTime,java.util.Date createTime,Long userId,Long roleId,Integer enable,String remark,Long updateBy) {
        super();
        this.id = id;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.userId = userId;
        this.roleId = roleId;
        this.enable = enable;
        this.remark = remark;
        this.updateBy = updateBy;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getEnable() {
        return this.enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

}
