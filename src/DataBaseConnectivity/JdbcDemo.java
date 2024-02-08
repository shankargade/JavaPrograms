package DataBaseConnectivity;

import java.sql.*;

public class JdbcDemo {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafullstack?characterEncoding=latin1", "root", "root");
            Statement stmt = con.createStatement();
            int result=0;

            try {
                 result = stmt.executeUpdate("Insert into employee values('Jyoti','Jyoti','Mane','Pune','Pune')");

            }catch (Exception e)
            {
                System.out.println(e);
            }
            if (result > 0) {
                System.out.println(result +" Data Added Successfully");
            }

            ResultSet rs = stmt.executeQuery("select * from employee");

            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+ "  " + rs.getString(4)+ "  " + rs.getString(5));

            con.close();
        }

        catch (Exception e) {

            System.out.println(e);
        }
    }
}