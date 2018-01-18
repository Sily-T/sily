package com.sily.web.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * @Author:
 * @Version: V 1.0
 * @Description: 中文转拼音工具类
 * @Date: Created in 12:08 2018/1/10
 * @Modified By:
 **/
public class HanyuPinyinHelper {
    /**
     * 将文字转为汉语拼音
     * @param chineselanguage 要转成拼音的中文
     */
    public String toHanyuPinyin(String chineselanguage){
        char[] cl_chars = chineselanguage.trim().toCharArray();
        String hanyupinyin = "";

        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // 输出拼音全部大写    HanyuPinyinCaseType.LOWERCASE全部小写
        defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        // 不带声调
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_V) ;
        try {
            for (int i=0; i<cl_chars.length; i++){
                // 如果字符是中文,则将中文转为汉语拼音   matches():告知此字符串是否匹配给定的正则表达式
                if (String.valueOf(cl_chars[i]).matches("[\u4e00-\u9fa5]+")){
                    //PinyinHelper这个类提供了几个实用功能来将中文字符（简体和繁体）转换成各种中文罗马化表示
                    //toHanyuPinyinStringArray获取单个汉字（简体和繁体）所有的拼音和声调数，返回是个数组，但我们只需要拼音所以加[0]，第一个参数时汉字，第二个参数是规则
                    hanyupinyin += PinyinHelper.toHanyuPinyinStringArray(cl_chars[i], defaultFormat)[0];
                } else {// 如果字符不是中文,则不转换
                    hanyupinyin += cl_chars[i];
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            System.out.println("字符不能转成汉语拼音");
        }
        return hanyupinyin;
    }

    public static String getFirstLettersUp(String chineselanguage){
        return getFirstLetters(chineselanguage ,HanyuPinyinCaseType.UPPERCASE);
    }

    public static String getFirstLettersLo(String chineselanguage){
        return getFirstLetters(chineselanguage ,HanyuPinyinCaseType.LOWERCASE);
    }

    public static String getFirstLetters(String chineselanguage,HanyuPinyinCaseType caseType) {
        char[] cl_chars = chineselanguage.trim().toCharArray();
        String hanyupinyin = "";
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // 输出拼音全部大写
        defaultFormat.setCaseType(caseType);
        // 不带声调
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        try {
            for (int i = 0; i < cl_chars.length; i++) {
                String str = String.valueOf(cl_chars[i]);
                if (str.matches("[\u4e00-\u9fa5]+")) {
                    // 如果字符是中文,则将中文转为汉语拼音,并取第一个字母
                    hanyupinyin += PinyinHelper.toHanyuPinyinStringArray(cl_chars[i], defaultFormat)[0].substring(0, 1);
                } else if (str.matches("[0-9]+")) {
                    // 如果字符是数字,取数字
                    hanyupinyin += cl_chars[i];
                } else if (str.matches("[a-zA-Z]+")) {
                    // 如果字符是字母,取字母
                    hanyupinyin += cl_chars[i];
                } else {// 否则不转换
                    hanyupinyin += cl_chars[i];
                    //如果是标点符号的话，带着
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            System.out.println("字符不能转成汉语拼音");
        }
        return hanyupinyin;
    }

    public static String getPinyinString(String chineselanguage){
        char[] cl_chars = chineselanguage.trim().toCharArray();
        String hanyupinyin = "";
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // 输出拼音全部大写
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        // 不带声调
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        try {
            for (int i = 0; i < cl_chars.length; i++) {
                String str = String.valueOf(cl_chars[i]);
                if (str.matches("[\u4e00-\u9fa5]+")) {
                    // 如果字符是中文,则将中文转为汉语拼音,并取第一个字母
                    hanyupinyin += PinyinHelper.toHanyuPinyinStringArray(
                            cl_chars[i], defaultFormat)[0];
                } else if (str.matches("[0-9]+")) {
                    // 如果字符是数字,取数字
                    hanyupinyin += cl_chars[i];
                } else if (str.matches("[a-zA-Z]+")) {
                    // 如果字符是字母,取字母

                    hanyupinyin += cl_chars[i];
                } else {// 否则不转换
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            System.out.println("字符不能转成汉语拼音");
        }
        return hanyupinyin;
    }
    /**
     * 取第一个汉字的第一个字符
     * @Title: getFirstLetter
     * @Description: TODO
     * @return String
     * @throws
     */
    public static String getFirstLetter(String chineselanguage){
        char[] cl_chars = chineselanguage.trim().toCharArray();
        String hanyupinyin = "";
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        //输出拼音全部大写 HanyuPinyinCaseType.UPPERCASE
        //输出拼音全部小写 HanyuPinyinCaseType.LOWERCASE
        defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        // 不带声调
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        try {
            String str = String.valueOf(cl_chars[0]);
            // 如果字符是中文,则将中文转为汉语拼音,并取第一个字母
            if (str.matches("[\u4e00-\u9fa5]+")) {
                hanyupinyin = PinyinHelper.toHanyuPinyinStringArray(
                        cl_chars[0], defaultFormat)[0].substring(0, 1);
            } else if (str.matches("[0-9]+")) {
                // 如果字符是数字,取数字
                hanyupinyin += cl_chars[0];
            } else if (str.matches("[a-zA-Z]+")) {
                // 如果字符是字母,取字母
                hanyupinyin += cl_chars[0];
            } else {
                // 否则不转换
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            System.out.println("字符不能转成汉语拼音");
        }
        return hanyupinyin;
    }

    /**
     * @Description: 测试
     * @param args
     */
    public static void main(String[] args) {
        HanyuPinyinHelper hanyuPinyinHelper = new HanyuPinyinHelper() ;
        System.out.println(hanyuPinyinHelper.toHanyuPinyin("广东科学技术职业学院"));
    }

}
