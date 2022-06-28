package Week2.BDO.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static String url = "jdbc:mysql://localhost:3306/account";
    static String dbUsername = "root";
    static String dbPassword = "P@ssw0rd";
    public static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(url,dbUsername,dbPassword);
    }
}
