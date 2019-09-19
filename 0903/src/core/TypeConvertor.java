package core;

/**
 * 负责java数据类型和数据库类型的相互转换
 */
public interface TypeConvertor {
    /**
     * 将数据库类型转换成java数据类型
     * @param columnType 数据库字段的类型
     * @return java的数据类型
     */
    public String databaseType2JavaType(String columnType);
}
