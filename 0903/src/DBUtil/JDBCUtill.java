package DBUtil;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtill {
    /**
     * //给sql设参
     * @param ps 预编译sql语句对象
     * @param params 参数
     */
    public static void handleParams(PreparedStatement ps, Object[] params){
        if(params != null){
            for(int i=0;i<params.length;i++){
                try {
                    ps.setObject(i+1,params[i]);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
