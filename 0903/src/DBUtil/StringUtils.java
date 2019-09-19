package DBUtil;

/**
 *
 */
public class StringUtils {
    /**
     * 将首字母大写
     * @param str 目标字符串
     * @return 首字母变大学的字符串
     */
    public  static String firstChar2UpperCase(String str){
        return  str.toUpperCase().substring(0,1)+str.substring(1);
    }
}
