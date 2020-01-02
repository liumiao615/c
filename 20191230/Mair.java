import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;
public class Mair {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2，通过DriverManager获取连接
        //连接的地址
        //CMD中
        String url = "jdbc.mysql://127.0.0.1:3306/java11_12_06?useSSL = false";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println(connection);


        connection.close();
    }
}
