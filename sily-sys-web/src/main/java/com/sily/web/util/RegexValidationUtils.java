package com.sily.web.util;

import java.util.regex.Pattern;

/**
 * @Author:
 * @Version: V 1.0
 * @Description: 正则表达式常量校验工具类
 * @Date: Created in 11:28 2018/1/10
 * @Modified By:
 **/
public class RegexValidationUtils {
    /**
     * 检验18位身份证号
     */
    public static final String REGEXIDCARD = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";

    /**
     * 校验E-Mail 地址
     */
    public static final String REGEXEMAIL = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";

    /**
     * 校验手机号码
     */
    public static final String REGEXPHONE = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

    /**
     * 校验"yyyy-mm-dd" 格式的日期校验(已考虑平闰年)
     */
    public static final String REGEXDATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";


    public static void main(String[] args) {
        String idcard = "440663188802156526";
        String email = "13128563251@qq.com";
        System.out.println(Pattern.matches(RegexValidationUtils.REGEXIDCARD,idcard));
        System.out.println(Pattern.matches(RegexValidationUtils.REGEXEMAIL,email));
    }
}

