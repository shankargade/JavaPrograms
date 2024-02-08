package DataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUpdateDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javafullstack?characterEncoding=latin1";
        String userName ="root";
        String passWord = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,userName,passWord);




        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
