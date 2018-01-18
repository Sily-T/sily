package com.sily.web.util;

/**
 * @Author:
 * @Version: V 1.0
 * @Description: java实现金钱数字转中文大写功能类
 * @Date: Created in 17:00 2018/1/11
 * @Modified By:
 **/
public class ArabNumToChineseUtil {

    private static final char [] ChineseNum ={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
    private static final char [] ChineseUnit={'里','分','角','元','拾','佰','仟','万','拾','佰','仟','亿','拾','佰','仟'};
    /**
     * public static char[] ChineseNum = "零壹贰叁肆伍陆柒捌玖".toCharArray();
     * public static char[] ChineseUnit = "里分角元拾佰仟万拾佰仟亿拾佰仟".toCharArray();
     */

    /**
     * 返回关于钱的中文式大写数字,支仅持到亿
     * */
    public static String arabNumToChineseRMB(int moneyNum){
        String res="";
        int i=3;
        if(moneyNum==0){
            return "零元";
        }
        while(moneyNum>0){
            res=ChineseUnit[i++]+res;
            res=ChineseNum[moneyNum%10]+res;
            moneyNum/=10;
        }
        return res.replaceAll("零[拾佰仟]", "零")
                .replaceAll("零+亿", "亿").replaceAll("零+万", "万")
                .replaceAll("零+元", "元").replaceAll("零+", "零");

    }

    /**
     * 返回关于钱的中文式大写数字,支仅持到亿
     * @throws Exception
     * */
    private static String arabNumToChineseRMB(String moneyNum) throws Exception{
        String res="";
        int i=3;
        int len=moneyNum.length();
        if(len>12){
            throw new Exception("Number too large!");
        }
        if("0".equals(moneyNum)){
            return "零元";
        }
        for(len--;len>=0;len--){
            res=ChineseUnit[i++]+res;
            int num=Integer.parseInt(moneyNum.charAt(len)+"");
            res=ChineseNum[num]+res;
        }
        return res.replaceAll("零[拾佰仟]", "零")
                .replaceAll("零+亿", "亿").replaceAll("零+万", "万")
                .replaceAll("零+元", "元").replaceAll("零+", "零");

    }
    /**
     * 整数位支持12位,到仟亿
     * 支持到小数点后3位,如果大于3位,那么会四舍五入到3位
     * @throws Exception
     * */
    public static String arabNumToChineseRMB(double moneyNum) throws Exception{
        String res="";
        String money=String.format("%.3f",moneyNum);
        int i=0;
        if(moneyNum==0.0){return "零元";}
        String inte = money.split("\\.")[0];
        int deci=Integer.parseInt(money.split("\\.")[1].substring(0, 3));
        while(deci>0){
            res=ChineseUnit[i++]+res;
            res=ChineseNum[deci%10]+res;
            deci/=10;
        }
        res=res.replaceAll("零[里分角]", "零");
        if(i<3){res="零"+res;}

        res=res.replaceAll("零+", "零");
        if(res.endsWith("零")){res=res.substring(0, res.length()-1);}
        return arabNumToChineseRMB(inte)+res;
    }

    /**
     * @Description: 测试
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(ArabNumToChineseUtil.arabNumToChineseRMB(987654321));
        try {
            System.out.println(ArabNumToChineseUtil.arabNumToChineseRMB(6546.321));
        }catch (Exception e){
            e.getStackTrace();
        }

    }

}