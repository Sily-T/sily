package com.sily.api;
public class SysDic {
    private Long id;
    private String code;//指令
    private java.util.Date createTime;
    private String remark;//备注
    private String type;
    private String parentType;//父类型
    private String codeText;//指令文本
    private Long createBy;
    private Integer sortNo;//序号
    private Integer editAble;//编辑状态（1可编辑；0不可编辑）
    private java.util.Date updateTime;
    private Integer enable;//状态（1启用，0禁用）
    private String parentCode;//父指令
    private Long updateBy;
    public SysDic() {
        super();
    }
    public SysDic(Long id,String code,java.util.Date createTime,String remark,String type,String parentType,String codeText,Long createBy,Integer sortNo,Integer editAble,java.util.Date updateTime,Integer enable,String parentCode,Long updateBy) {
        super();
        this.id = id;
        this.code = code;
        this.createTime = createTime;
        this.remark = remark;
        this.type = type;
        this.parentType = parentType;
        this.codeText = codeText;
        this.createBy = createBy;
        this.sortNo = sortNo;
        this.editAble = editAble;
        this.updateTime = updateTime;
        this.enable = enable;
        this.parentCode = parentCode;
        this.updateBy = updateBy;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentType() {
        return this.parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getCodeText() {
        return this.codeText;
    }

    public void setCodeText(String codeText) {
        this.codeText = codeText;
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

    public Integer getEditAble() {
        return this.editAble;
    }

    public void setEditAble(Integer editAble) {
        this.editAble = editAble;
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

    public String getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

}
