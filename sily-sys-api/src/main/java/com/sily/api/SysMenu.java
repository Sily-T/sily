package com.sily.api;
public class SysMenu {
    private Long id;//菜单编号
    private String permission;//权限标识
    private Integer expandStatus;//展开状态(1:展开;0:收缩)
    private java.util.Date createTime;
    private Integer menuType;//菜单类型(0:CURD;1:系统菜单;2:业务菜单;)
    private String remark;//备注
    private String iconCls;//节点图标CSS类名
    private String requestUrl;//请求地址
    private Integer isShow;//叶子节点(0:树枝节点;1:叶子节点)
    private Long createBy;
    private Integer sortNo;//排序号
    private java.util.Date updateTime;
    private Long parentId;//上级菜单编号
    private Integer enable;
    private String menuName;//菜单名称
    private Long updateBy;
    public SysMenu() {
        super();
    }
    public SysMenu(String menuName,Long parentId){
        this.setMenuName(menuName);
        this.setParentId(parentId);
    }
    public SysMenu(Long id,String permission,Integer expandStatus,java.util.Date createTime,Integer menuType,String remark,String iconCls,String requestUrl,Integer isShow,Long createBy,Integer sortNo,java.util.Date updateTime,Long parentId,Integer enable,String menuName,Long updateBy) {
        super();
        this.id = id;
        this.permission = permission;
        this.expandStatus = expandStatus;
        this.createTime = createTime;
        this.menuType = menuType;
        this.remark = remark;
        this.iconCls = iconCls;
        this.requestUrl = requestUrl;
        this.isShow = isShow;
        this.createBy = createBy;
        this.sortNo = sortNo;
        this.updateTime = updateTime;
        this.parentId = parentId;
        this.enable = enable;
        this.menuName = menuName;
        this.updateBy = updateBy;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Integer getExpandStatus() {
        return this.expandStatus;
    }

    public void setExpandStatus(Integer expandStatus) {
        this.expandStatus = expandStatus;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMenuType() {
        return this.menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIconCls() {
        return this.iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public Integer getIsShow() {
        return this.isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Long getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Integer getSortNo() {
        return this.sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getEnable() {
        return this.enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

}
