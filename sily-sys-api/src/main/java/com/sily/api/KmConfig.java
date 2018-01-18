package com.sily.api;

/**
 * @Author:
 * @Version: V 1.0
 * @Description: ftp链接常量
 * @Date: Created in 18:06 2018/1/14
 * @Modified By:
 **/
public class KmConfig {
    /**
     * 主机ip地址
     */
    private String ftpHost = "";
    /**
     * 端口号
     */
    private Integer ftpPort;
    /**
     * ftp用户名
     */
    private String ftpUser = "";
    /**
     * ftp密码
     */
    private String ftpPassword = "";
    /**
     * ftp中的目录
     */
    private String ftpPath = "";

    public String getFtpHost() {
        return ftpHost;
    }

    public void setFtpHost(String ftpHost) {
        this.ftpHost = ftpHost;
    }

    public Integer getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(Integer ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public String getFtpPath() {
        return ftpPath;
    }

    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath;
    }
}
