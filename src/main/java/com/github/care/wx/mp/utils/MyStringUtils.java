package com.github.care.wx.mp.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringUtils {

    static String  regEx = "[\u4e00-\u9fa5]";
    static Pattern pat   = Pattern.compile(regEx);

    static Pattern pattern = Pattern.compile("[A-Z]");
    /**
     * 判断是否为中文
     * */
    public static boolean isContainsChinese(String str)
    {
        Matcher matcher = pat.matcher(str);
        boolean flg = false;
        if (matcher.find())    {
            flg = true;
        }
        return flg;
    }

    public static boolean isEmpty(String strMsg){

        if(strMsg==null||strMsg.trim().equals("")){
            return true;
        }
        return false;
    }


    public static String capitalize(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static String toMapKey(String name){
        StringBuffer sb = new StringBuffer();
        Matcher m = pattern.matcher(name);
        while (m.find())
        {
            m.appendReplacement(sb, "_\\" + m.group().toLowerCase());
        }
        m.appendTail(sb);
        return sb.toString();
    }
    /**
     * 判断String是否是整数
     */
    public static boolean isInteger(String s){
        if((s != null)&&(s!=""))
            return s.matches("^[0-9]*$");
        else{
            return false;
        }
    }
    /**
     * 判断字符串是否是浮点数
     */
    public static boolean isDouble(String value) {
        if(value == null || value.trim().equals("")){
            return false;
        }
        try {
            Double.parseDouble(value);
            if (value.contains("."))
                return true;
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * 判断字符串是否是数字
     */
    public static  boolean isNumber(String value) {
        return isInteger(value) || isDouble(value);
    }
}
