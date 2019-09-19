package service;

import DBUtil.JDBCUtill;
import DBUtil.ReflectUtils;
import core.DBManager;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class paperService {

    public  List getPaperInfo(String sql, Class clazz, Object[] params){
        Connection conn = DBManager.getConn();
        List list = null;  //储存查询结果
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(sql);
            JDBCUtill.handleParams(ps,params);
            System.out.println(ps);
            rs = ps.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();

            while (rs.next()){
                if(list == null){
                    list = new ArrayList();
                }


                Object rowObj = clazz.newInstance();
                for(int i=0; i<metaData.getColumnCount();i++){
                    String columnName = metaData.getColumnLabel(i+1);
                    Object columnValue = rs.getObject(i+1);

                    //调用rowObj对象的setUsername方法，将columnValue的值设置进去
                    ReflectUtils.invokeSet(rowObj,columnName,columnValue);
                }
                list.add(rowObj);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBManager.close(ps,conn);
        }

        return list;

    }
}
