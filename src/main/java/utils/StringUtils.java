package utils;

public class StringUtils {

    public static String contactStr(String ...strs){
        return String.join(" ",strs);
    }
    public static String formatTemplate(String str,Object ...args){
        return String.format(str,args);
    }
}
