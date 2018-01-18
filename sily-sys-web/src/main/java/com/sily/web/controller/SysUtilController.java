package com.sily.web.controller;

import com.sily.api.KmConfig;
import com.sily.web.util.FtpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 21:16 2018/1/17
 * @Modified By:
 **/

@Controller
@RequestMapping("/util")
public class SysUtilController {
    /**
     * FTP文件上传
     */
    @RequestMapping(value = "/ftpUpload", method = RequestMethod.POST)
    @ResponseBody
    public void ftpUpload(@RequestBody KmConfig kmConfig)throws Exception{
        FtpUtil.connectFtp(kmConfig);
        String ftpPath = kmConfig.getFtpPath();
        File file = new File("ftpPath");
        FtpUtil.upload(file);
    }


}
