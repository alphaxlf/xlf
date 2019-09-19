package DBUtil;


import java.lang.reflect.Method;

/**
 * 反射的相关操作
 */
public class ReflectUtils {
    public static void invokeSet(Object obj,String columnName,Object columnValue){


        try {
            String methodName = "set"+StringUtils.firstChar2UpperCase(columnName);
            Method m = obj.getClass().getDeclaredMethod(methodName,columnValue.getClass());
            m.invoke(obj,columnValue);
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
