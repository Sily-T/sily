package com.sily.api;

import java.util.Date;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author Lime
 * @date 2017年12月27日
 */
public class SysUser {
    private Long id;
    /**
     * QQ
     */
    private String qq;
    /**
     * 出生日期
     */
    private java.util.Date birthday;
    /**
     * 姓名拼音
     */
    private String namePinyin;
    /**
     * 详细地址
     */
    private String address;
    private java.util.Date createTime;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 性别(0:未知;1:男;2:女)
     */
    private Integer sex;
    /**
     * 身份证号码
     */
    private String idCard;
    /**
     * 微信
     */
    private String weiXin;
    /**
     * 备注
     */
    private String remark;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 工号
     */
    private String staffNo;
    private Long createBy;
    /**
     * 登录密码
     */
    private String password;
    private java.util.Date updateTime;
    /**
     * 用户类型(1普通用户2管理员3系统用户)
     */
    private String userType;
    /**
     * 电话
     */
    private String phone;
    private Integer enable;
    /**
     * 职位
     */
    private String position;
    /**
     * 部门编号
     */
    private Long deptId;
    private Long updateBy;
    /**
     * 登录帐户
     */
    private String account;
    /**
     * 邮箱
     */
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getWeiXin() {
        return weiXin;
    }

    public void setWeiXin(String weiXin) {
        this.weiXin = weiXin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
