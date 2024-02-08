package Practice_Programs;

import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter employee details");
        System.out.println("Enter EmpID:");
        int id = scanner.nextInt();
        employee.setEmpId(id);
        scanner.nextLine();
        System.out.println("Enter EmpName:");
        String name = scanner.nextLine();
        employee.setEmpName(name);
        System.out.println("Enter EmpAddress:");
        String address = scanner.nextLine();
        employee.setEmpAddress(address);
        System.out.println("Enter EmpSalary:");
        int salary = scanner.nextInt();
        employee.setMonthlySalary(salary);
        System.out.println("Enter Empmobilenumber:");
        long mobileNumber = scanner.nextLong();
        employee.setEmpMobileNumber(mobileNumber);

        System.out.println("******************Employee Information******************");
        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpName());
        System.out.println(employee.getEmpAddress());
        System.out.println(employee.getMonthlySalary());
        System.out.println(employee.getEmpMobileNumber());
    }
}
