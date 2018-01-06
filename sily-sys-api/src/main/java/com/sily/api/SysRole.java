package com.sily.api;
public class SysRole {
    private Long id;//角色编号
    private String roleName;//角色名称
    private Long createBy;
    private java.util.Date updateTime;
    private Integer roleType;//角色类型(1:业务角色;2:管理角色 ;3:系统内置角色)
    private java.util.Date createTime;
    private Integer enable;
    private String remark;//备注
    private Long deptId;//所属部门编号
    private Long updateBy;
    public SysRole() {
        super();
    }
    public SysRole(Long id,String roleName,Long createBy,java.util.Date updateTime,Integer roleType,java.util.Date createTime,Integer enable,String remark,Long deptId,Long updateBy) {
        super();
        this.id = id;
        this.roleName = roleName;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.roleType = roleType;
        this.createTime = createTime;
        this.enable = enable;
        this.remark = remark;
        this.deptId = deptId;
        this.updateBy = updateBy;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Integer getRoleType() {
        return this.roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
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

    public Long getDeptId() {
        return this.deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

}
