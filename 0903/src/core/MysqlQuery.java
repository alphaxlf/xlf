//package core;
//
//import DBUtil.JDBCUtill;
//import DBUtil.ReflectUtils;
//import DBUtil.StringUtils;
//
//import java.lang.reflect.Method;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MysqlQuery implements Query {
//    @Override
//    public int excuteDML(String sql, Object[] params) {
//        return 0;
//    }
//
//    @Override
//    public void insert(Object obj) {
//
//    }
//
//    @Override
//    public int delete(Class clazz, int id) {
//        return 0;
//    }
//
//    @Override
//    public void delete(Object obj) {
//
//    }
//
//    @Override
//    public int update(Object obj, String[] fieldNames) {
//        return 0;
//    }
//
//    @Override
//    public List queryRows(String sql, Class clazz, Object[] params) {
//        Connection conn = DBManager.getConn();
//        List list = null;  //储存查询结果
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//
//        try {
//            ps = conn.prepareStatement(sql);
//
//            //给sql 传参
//            JDBCUtill.handleParams(ps,params);
////            System.out.println(ps);
//            rs = ps.executeQuery();
//
//            ResultSetMetaData  metaData = rs.getMetaData();
//            //多行
//            while (rs.next()){
//                if(list == null){
//                    list = new ArrayList();
//                }
//                Object rowObj = clazz.newInstance(); //调用javabean的无参构造器
//                //多列  例如: select username,pwd,age from user where id > ?
//                for(int i=0; i<metaData.getColumnCount();i++){
//                    String columnName = metaData.getColumnLabel(i+1);
//                    Object columnValue = rs.getObject(i+1);
//
//                    //调用rowObj对象的setUsername方法，将columnValue的值设置进去
//                    ReflectUtils.invokeSet(rowObj,columnName,columnValue);
//                }
//
//                list.add(rowObj);
//            }
//
//
//        } catch (Exception e) {
//           e.printStackTrace();
//        }finally {
//            DBManager.close(ps,conn);
//        }
//
//
//        return list;
//    }
//
////    public List queryRows(String sql, Object[] params) {
////        Connection conn = DBManager.getConn();
////        List list = null;  //储存查询结果
////        PreparedStatement ps = null;
////        ResultSet rs = null;
////
////        try {
////            ps = conn.prepareStatement(sql);
////
////
////            //给sql 传参
////            JDBCUtill.handleParams(ps,params);
////            System.out.println(ps);
////            rs = ps.executeQuery();
////
////
////            ResultSetMetaData  metaData = rs.getMetaData();
////            for(int i=0; i<metaData.getColumnCount();i++){
////                Object[]  objs = new Object[metaData.getColumnCount()];
////                objs[0] = rs.getObject(1);
////                objs[1] = rs.getObject(2);
////                objs[2] = rs.getObject(3);
////                objs[3] = rs.getObject(4);
////                objs[4] = rs.getObject(5);
////                objs[5] = rs.getObject(6);
////                objs[6] = rs.getObject(7);
////                objs[7] = rs.getObject(8);
////                objs[8] = rs.getObject(9);
////                list.add(objs);
////            }
////
////            }catch (Exception e){
////            e.printStackTrace();
////        }finally {
////            DBManager.close(ps,conn);
////        }
////
////
////
////
////        return list;
////    }
//
////    public static void main(String[] args){
////        new MysqlQuery().queryRows("")
////    }
//}
