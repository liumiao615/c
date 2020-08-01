package lab;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class 插入诗词Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String 朝代 = "唐代";
        String 作者 = "白居易";
        String 标题 = "问刘十九";
        String 正文 = "绿蚁新醅酒，红泥小火炉" +
                "晚来天欲雪，能饮一杯无？";
        /*
        {
            //用JDBC的方式访问数据库
            //1，注册driver
            //2，获取Connection通过DriverManger
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/tangshi0720?useSSL=false&characterEncoding = uft8";
            Connection connection = DriverManager.getConnection(url, "root", "123456");
            System.out.println(connection);
        }
        */
        /*
        通过DataSource获取Connection
        DataSource dataSource = new MysqlDataSource();
        */
        //带有连接池
        MysqlDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setServerName("127.0.0.1");
        dataSource.setPort(3306);
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setDatabaseName("tangshi0720");
        dataSource.setUseSSL(false);
        dataSource.setCharacterEncoding("UTF8");

        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        String sql = "INSERT INTO tangshi0720(sha256,dynasty,title,author,content,words)";
        String sql = "INSERT INTO tangshi(sha256,dynastay,title,author,content,words) VALUES(?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"sha256");
        statement.setString(2,"朝代");
        statement.setString(3,"标题");
        statement.setString(4,"作者");
        statement.setString(5,"正文");
        statement.setString(6,"");
        statement.executeUpdate();

    }
}
