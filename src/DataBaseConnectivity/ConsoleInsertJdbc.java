package DataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsoleInsertJdbc {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/javafullstack?characterEncoding=latin1";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the ID: ");
            int empID = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter the Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter the Address: ");
            String Address = scanner.nextLine();

            System.out.print("Enter the City: ");
            String City = scanner.nextLine();

            String sql = "INSERT INTO employee (empID,LastName,FirstName,Address,City) VALUES (?, ?,?,?,?)";


            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, empID);
                statement.setString(2, name);
                statement.setString(3, lastName);
                statement.setString(4, Address);
                statement.setString(5, City);


                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }
            }
        } catch (SQLException e) {

            System.out.println("Exception" + e);
        }
    }
}
