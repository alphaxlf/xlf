package DBUtil;

import bean.ColumnInfo;
import bean.JavaFieldGetSet;
import bean.TableInfo;
import core.DBManager;
import core.MysqlTypeConvertor;
import core.TableContext;
import core.TypeConvertor;
import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 封装了java 文件的常用操作
 */
public class JavaFileUtils {

    /**
     * 根据字段信息生成java属性信息。如：var username-->private String username及相应的get、set方法
     * @param column 字段信息
     * @param convertor 类型转换器
     * @return java属性和get/set方法
     */
    public static JavaFieldGetSet createFieldGetSetSRC(ColumnInfo column, TypeConvertor convertor){
        JavaFieldGetSet jfgs = new JavaFieldGetSet();

        String javaFieldType = convertor.databaseType2JavaType(column.getDataType());

        jfgs.setFieldInfo("private "+javaFieldType+" "+column.getName()+";\n");

        //public void get getUsername(){return username}
        StringBuilder getSrc = new StringBuilder();

        getSrc.append("\tpublic "+javaFieldType+" get"+StringUtils.firstChar2UpperCase(column.getName())+"(){\n");
        getSrc.append("\t\treturn "+column.getName()+";\n");
        getSrc.append("\t}\n");

        jfgs.setGetInfo(getSrc.toString());


        StringBuilder setSrc = new StringBuilder();
        setSrc.append("\tpublic void set"+StringUtils.firstChar2UpperCase(column.getName())+"(");
        setSrc.append(javaFieldType+" "+column.getName()+"){\n");
        setSrc.append("\t\tthis. "+column.getName()+" = "+column.getName()+";\n");
        setSrc.append("\t}\n");
        jfgs.setSetInfo(setSrc.toString());

        return jfgs;

    }

    /**
     * 根据表信息生成Java类的源代码
     * @param tableInfo 表信息
     * @param convertor 数据类型转换器
     * @return java类的源代码
     */
    public static String createJavaSrc(TableInfo tableInfo,TypeConvertor convertor){


        Map<String,ColumnInfo> colums = tableInfo.getColumns();
        List<JavaFieldGetSet> javaFields = new ArrayList<JavaFieldGetSet>();

        for(ColumnInfo c:colums.values()){
            javaFields.add(createFieldGetSetSRC(c,convertor));
        }

        StringBuilder src = new StringBuilder();
        //生成package语句
        src.append("package "+DBManager.getConf().getPoPackage()+";\n\n");

        //生成import语句
        src.append("import java.sql.*;\n");
        src.append("import java.util.*\n\n");
        //生成类声明语句
        src.append("public class "+StringUtils.firstChar2UpperCase(tableInfo.getTname())+" {\n\n");

        //生成属性列表
        for(JavaFieldGetSet f:javaFields){
            src.append(f.getFieldInfo());
        }
        src.append("\n\n");
        //生成get方法列表
        for(JavaFieldGetSet f:javaFields){
            src.append(f.getGetInfo());
        }
        //生成set方法列表
        for(JavaFieldGetSet f:javaFields){
            src.append(f.getSetInfo());
        }
        //生成类结束
        src.append("}\n");
        System.out.println(src);
        return src.toString();
    }

//    public static void main(String[] args){
////        ColumnInfo ci = new ColumnInfo("username","int",0);
////        JavaFieldGetSet f = createFieldGetSetSRC(ci,new MysqlTypeConvertor());
////        System.out.println(f);
//
//        Map<String,TableInfo> map = TableContext.tables;
//        TableInfo t = map.get("class");
//        createJavaSrc(t,new MysqlTypeConvertor());
//    }
}
