package bean;

/**
 * 管理配置信息
 */
public class Configuration {
    /**
     * jdbc的URL
     */
    private String mysqlURL;
    /**
     * 驱动类
     */
    private String mysqlDriver;
    /**
     * 数据库用户名
     */
    private String username;
    /**
     * 数据库密码
     */
    private String password;
    /**
     * 当前使用的数据库
     */
    private String usingDB;

    private String srcPath;

    private String poPackage;

    public String getMysqlURL() {
        return mysqlURL;
    }

    public void setMysqlURL(String mysqlURL) {
        this.mysqlURL = mysqlURL;
    }

    public String getMysqlDriver() {
        return mysqlDriver;
    }

    public void setMysqlDriver(String mysqlDriver) {
        this.mysqlDriver = mysqlDriver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsingDB() {
        return usingDB;
    }

    public void setUsingDB(String usingDB) {
        this.usingDB = usingDB;
    }

    public String getSrcPath() {
        return srcPath;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getPoPackage() {
        return poPackage;
    }

    public void setPoPackage(String poPackage) {
        this.poPackage = poPackage;
    }

    public Configuration(String mysqlURL, String mysqlDriver, String username, String password, String usingDB, String srcPath, String poPackage) {
        this.mysqlURL = mysqlURL;
        this.mysqlDriver = mysqlDriver;
        this.username = username;
        this.password = password;
        this.usingDB = usingDB;
        this.srcPath = srcPath;
        this.poPackage = poPackage;
    }

    public Configuration(){

    }
}
