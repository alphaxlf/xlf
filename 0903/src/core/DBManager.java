package core;

import bean.Configuration;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 根据配置信息，维持链接对象的管理
 */
public class DBManager {
    private static Configuration conf;

    static { //静态代码块
        Properties pros = new Properties();

        try {
            pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        conf = new Configuration();
        conf.setMysqlDriver(pros.getProperty("mysqlDriver"));
        conf.setMysqlURL(pros.getProperty("mysqlURL"));
        conf.setUsername(pros.getProperty("username"));
        conf.setPassword(pros.getProperty("password"));
        conf.setUsingDB(pros.getProperty("usingDB"));
        conf.setSrcPath(pros.getProperty("srcPath"));
        conf.setPoPackage(pros.getProperty("poPackage"));
    }

    public static Connection getConn() {


        try {
            Class.forName(conf.getMysqlDriver());
            return DriverManager.getConnection(conf.getMysqlURL(), conf.getUsername(), conf.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void close(ResultSet rs, Statement ps, Connection conn){

        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close( Statement ps, Connection conn){

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return 返回conf对象
     */
    public static Configuration getConf(){
        return conf;
    }


}
