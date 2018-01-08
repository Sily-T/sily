package com.sily.api;
public class SysRoleMenu {
    private Long id;
    private Long createBy;
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private Long roleId;
    private Integer enable;
    private String permission;//权限标识
    private String remark;
    private Long updateBy;
    private Long menuId;
    public SysRoleMenu() {
        super();
    }
    public SysRoleMenu(Long menuId,Long roleId){
        this.setMenuId(menuId);
        this.setRoleId(roleId);
    }
    public SysRoleMenu(Long id,Long createBy,java.util.Date updateTime,java.util.Date createTime,Long roleId,Integer enable,String permission,String remark,Long updateBy,Long menuId) {
        super();
        this.id = id;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.roleId = roleId;
        this.enable = enable;
        this.permission = permission;
        this.remark = remark;
        this.updateBy = updateBy;
        this.menuId = menuId;
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

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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

    public Long getMenuId() {
        return this.menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

}
