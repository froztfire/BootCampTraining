package Week2.BDO.Utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Connection conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected to MySQL database!");
                Statement myStmt = conn.createStatement();
                ResultSet rs = myStmt.executeQuery("select * from account");
                while (rs.next()) {
                    System.out.println(rs.getString("name"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting MySQL database");
            ex.printStackTrace();
        }
    }
}
