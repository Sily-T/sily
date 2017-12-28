package com.sily.api;

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
}
