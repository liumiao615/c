package dao;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//dao数据访问层，这里面的代码主要围绕数据操作展开
//用JDBC访问数据库
public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/java_image_server?characterEncoding=utf8&useSSL=true";
    //通过jdbc的方式访问MySQL 数据库服务器IP：mysql服务器默认端口号，具体访问的数据库的名字
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    private static volatile DataSource dataSource = null;
    public static DataSource getDataSource(){
        //通过这个方法来创建Database 的实例,获取数据库连接
        if(dataSource == null) {
            synchronized (DBUtil.class) {
                if (dataSource == null) {
                    dataSource = new MysqlDataSource();
                    //线程不安全的单例模式
                    MysqlDataSource tmpDataSource = (MysqlDataSource) dataSource;
                    tmpDataSource.setURL(URL);
                    tmpDataSource.setUser(USERNAME);
                    tmpDataSource.setPassword(PASSWORD);
                }
            }
        }
        return dataSource;
    }
    //获取连接
    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    //关闭连接
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
