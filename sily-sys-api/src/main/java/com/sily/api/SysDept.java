package com.sily.api;

public class SysDept {
    private Long id;
    /**
     * 部门编号
     */
    private Integer leaf;
    /**
     * 叶子节点(0:树枝节点;1:叶子节点)
     */
    private Long createBy;
    private Integer sortNo;
    /**
     * 排序号
     */
    private String remark;
    /**
     * 备注
     */
    private java.util.Date updateTime;
    private Integer enable;
    /**
     * 启用状态
     */
    private java.util.Date createTime;
    private Long parentId;
    /**
     * 上级部门编号
     */
    private String deptName;
    /**
     * 部门名称
     */
    private Long updateBy;
    private Long unitId;
    /**
     * 隶属单位
     */
    public SysDept() {
        super();
    }
    public SysDept(Long id,Integer leaf,Long createBy,Integer sortNo,String remark,java.util.Date updateTime,Integer enable,java.util.Date createTime,Long parentId,String deptName,Long updateBy,Long unitId) {
        super();
        this.id = id;
        this.leaf = leaf;
        this.createBy = createBy;
        this.sortNo = sortNo;
        this.remark = remark;
        this.updateTime = updateTime;
        this.enable = enable;
        this.createTime = createTime;
        this.parentId = parentId;
        this.deptName = deptName;
        this.updateBy = updateBy;
        this.unitId = unitId;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLeaf() {
        return this.leaf;
    }

    public void setLeaf(Integer leaf) {
        this.leaf = leaf;
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

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEnable() {
        return this.enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUnitId() {
        return this.unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

}
