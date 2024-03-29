package bean;

/**
 * 封装Java属性和get、set方法
 */
public class JavaFieldGetSet {
    /**
     * 属性的源码信息： 如：private int userID
     */
    private String fieldInfo;
    /**
     * get方法的源码信息。 如：public int getUserID(){}
     */
    private String getInfo;
    /**
     * set方法的源码信息。如：public void setUserID(int id){this.id = id;}
     */
    private String setInfo;

    @Override
    public String toString() {
        System.out.println(fieldInfo);
        System.out.println(getInfo);
        System.out.println(setInfo);
        return super.toString();
    }

    public String getFieldInfo() {
        return fieldInfo;
    }

    public void setFieldInfo(String fieldInfo) {
        this.fieldInfo = fieldInfo;
    }

    public String getGetInfo() {
        return getInfo;
    }

    public void setGetInfo(String getInfo) {
        this.getInfo = getInfo;
    }

    public String getSetInfo() {
        return setInfo;
    }

    public void setSetInfo(String setInfo) {
        this.setInfo = setInfo;
    }

    public JavaFieldGetSet(String fieldInfo, String getInfo, String setInfo) {
        this.fieldInfo = fieldInfo;
        this.getInfo = getInfo;
        this.setInfo = setInfo;
    }
    public JavaFieldGetSet(){

    }
}
