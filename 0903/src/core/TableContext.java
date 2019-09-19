package core;

import bean.TableInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * 负责获取管理数据库所有表结构和类结构的关系，并可以根据表结构生成类结构
 */
public class TableContext {

    public static Map<String, TableInfo> tables = new HashMap<String, TableInfo>();


    public static Map<Class,TableInfo> poClassTableMap = new HashMap<Class, TableInfo>();
}
