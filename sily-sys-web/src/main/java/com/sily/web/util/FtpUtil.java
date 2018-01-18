package com.sily.web.util;

import com.sily.api.KmConfig;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;
import java.io.*;


/**
 * @Author:
 * @Version: V 1.0
 * @Description: FTP的上传下载
 * @Date: Created in 19:00 2018/1/14
 * @Modified By:
 **/
public class FtpUtil {
    private static Logger logger=Logger.getLogger(FtpUtil.class);
    private static FTPClient ftpClient;

    /**
     * 获取ftp连接
     * @param km
     * @return
     * @throws Exception
     */
    public static boolean connectFtp(KmConfig km)throws Exception {
        ftpClient = new FTPClient();
        boolean flag = false;
        int reply;
        if (km.getFtpPort() == null) {
            ftpClient.connect(km.getFtpHost());
        } else {
            ftpClient.connect(km.getFtpHost(), km.getFtpPort());
        }
        ftpClient.login(km.getFtpUser(), km.getFtpPassword());
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        reply = ftpClient.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftpClient.disconnect();
            return flag;
        }
        ftpClient.changeWorkingDirectory(km.getFtpPath());
        flag = true;
        return flag;
    }

    /**
     * 关闭ftp连接
     */
    public static void closeFtp(){
        if (ftpClient != null && ftpClient.isConnected()){
            try {
                ftpClient.logout();
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ftp上传文件
     * @param file
     * @throws Exception
     */
    public static void upload(File file)throws Exception{
        if (file.isDirectory()){
            ftpClient.makeDirectory(file.getName());
            ftpClient.changeWorkingDirectory(file.getName());
            String[] files = file.list();
            for(String fstr : files){
                File file1 = new File(file.getPath()+"/"+fstr);
                if (file1.isDirectory()){
                    upload(file1);
                    ftpClient.changeToParentDirectory();
                }else {
                    File file2 = new File(file.getPath()+"/"+fstr);
                    FileInputStream inputStream = new FileInputStream(file2);
                    ftpClient.storeFile(file2.getName(),inputStream);
                    inputStream.close();
                }
            }
        }else {
            File file2 = new File(file.getPath());
            FileInputStream inputStream = new FileInputStream(file2);
            ftpClient.storeFile(file2.getName(),inputStream);
            inputStream.close();
        }
    }

    /**
     * 下载链接配置
     * @param km
     * @param localBaseDir 本地目录
     * @param remoteBaseDir 远程目录
     * @throws Exception
     */

    public static void startDown(KmConfig km,String localBaseDir,String remoteBaseDir)throws Exception{
        if (FtpUtil.connectFtp(km)){
            try {
                FTPFile[] files = null;
                boolean changedir = ftpClient.changeWorkingDirectory(remoteBaseDir);
                if (changedir){
                    ftpClient.setControlEncoding("UTF8");
                    files = ftpClient.listFiles();
                    for (int i =0;i<files.length;i++){
                        try{
                            downloadFile(files[i],localBaseDir,remoteBaseDir);
                        }catch (Exception e){
                            logger.error(e);
                            logger.error("<"+files[i].getName()+">下载失败");
                        }
                    }
                }
            }catch (Exception e){
                logger.error(e);
                logger.error("下载过程中出现异常");
            }
        }else {
            logger.error("连接失败！");
        }
    }


    /**
     * 下载FTP文件
     * 当你需要下载FTP文件的时候，调用此方法
     * 根据<b>获取的文件名，本地地址，远程地址</b>进行下载
     * @param ftpFile
     * @param relativeLocalPath
     * @param relativeRemotePath
     */

    private static void downloadFile(FTPFile ftpFile, String relativeLocalPath, String relativeRemotePath) {
        if (ftpFile.isFile()) {
            if (ftpFile.getName().indexOf("?") == -1) {
                OutputStream outputStream = null;
                try {
                    File locaFile = new File(relativeLocalPath + ftpFile.getName());
                    //判断文件是否存在，存在则返回
                    if (locaFile.exists()) {
                        return;
                    } else {
                        outputStream = new FileOutputStream(relativeLocalPath + ftpFile.getName());
                        ftpClient.retrieveFile(ftpFile.getName(), outputStream);
                        outputStream.flush();
                        outputStream.close();
                    }
                } catch (Exception e) {
                    logger.error(e);
                } finally {
                    try {
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (IOException e) {
                        logger.error("输出文件流异常");
                    }
                }
            }
        }else {
            String newlocalRelatePath = relativeLocalPath + ftpFile.getName();
            String newRemote = new String(relativeRemotePath+ ftpFile.getName().toString());
            File file = new File(newlocalRelatePath);
            if (!file.exists()){
                file.mkdirs();
            }
            try {
                newlocalRelatePath = newlocalRelatePath + '/';
                newRemote = newRemote + '/';
                String currentWorkDir = ftpFile.getName().toString();
                boolean changedir = ftpClient.changeWorkingDirectory(currentWorkDir);
                if (changedir){
                    FTPFile[] files = null;
                    files = ftpClient.listFiles();
                    for (int i= 0;i<files.length;i++){
                        downloadFile(files[i],newlocalRelatePath,newRemote);
                    }
                }
                if (changedir){
                    ftpClient.changeToParentDirectory();
                }
            }catch (Exception e){
                logger.error(e);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        KmConfig km = new KmConfig();
        km.setFtpHost("10.0.0.48");
        km.setFtpUser("Admin");
        km.setFtpPassword("10.");
        FtpUtil.connectFtp(km);
        //上传ftp文件测试
        //File file = new File("F:/aa");
        //FtpUtil.upload(file);
        //下载ftp文件测试
        //FtpUtil.startDown(km, "D:/",  "D:/FTP");
        System.out.println("ok");
    }
}
