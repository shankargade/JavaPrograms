package DataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafullstack?characterEncoding=latin1", "root", "root");
            PreparedStatement preparedStatement = con.prepareStatement("insert into employee values(?,?,?,?,?)");
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Mahesh");
            preparedStatement.setString(3,"Gade");
            preparedStatement.setString(4,"Beed");
            preparedStatement.setString(5,"Pendgaon");

            int i=preparedStatement.executeUpdate();
            System.out.println(i+" records inserted");
            con.close();


        }catch (Exception e){

            System.out.println(e);

        }
    }
}
