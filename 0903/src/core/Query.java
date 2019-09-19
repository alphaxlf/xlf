package core;

import java.util.List;

/*
 *负责查询（对外提供服务）
 */
public interface Query {
    /*
     *直接执行一个DML语句
     * @param sql SQL语句
     * @param params 参数
     * @return 执行SQL语句后影响记录的行数
     */
    public int excuteDML(String sql,Object[] params);

    /**
     * 将一个对象储存到数据中
     * @param obj 要储存的对象
     */
    public void insert(Object obj);

    /**
     * 删除clazz对应的表中的记录（指定主键id 的记录）
     * @param clazz clazz跟表对应的类的Class的对象
     * @param id 主键的值
     * @return
     */
    public int delete(Class clazz, int id); //delete form User where id =?;
    public void delete(Object obj);
    public int update(Object obj, String[] fieldNames);

    /**
     * 查询返回多行记录，并将返回记录封装到clazz指定的类的对象中
     * @param sql 查询语句
     * @param clazz 封装的JavaBean类的Class对象
     * @param params sql的参数
     * @return 查询的结果
     */
    public List queryRows(String sql,Class clazz,Object[] params);
}
