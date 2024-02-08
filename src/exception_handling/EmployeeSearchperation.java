package exception_handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSearchperation {

    public static void main(String[] args) {

        try {
        List<Employes123> empList = new ArrayList<>();


        Employes123 emp1 = new Employes123(55, "ShankarGade", 5555555555555.0);
        Employes123 emp2 = new Employes123(56, "PravinTak", 1000000000.0);
        Employes123 emp3 = new Employes123(57, "JyotiMane", 550000.0);
        Employes123 emp4 = new Employes123(58, "SaurabhBele", 60000000.0);
        Employes123 emp6 = new Employes123(59, "ShamalGade", 70000000000.0);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee name");
        String name = scanner.next();


        boolean flag= false;
        for (Employes123 e : empList)
        {

            if (e.getEmpName().equals(name)) {
                System.out.println("Employee found -->");
                System.out.println(e.getEmpName());
                System.out.println(e.getEmpSalary());
                System.out.println(e.getEmployeeId());
                flag = true;
            }
        }
        if (!flag) {
            throw new ProductNotFoundException("Employee is not found");
        }

    }catch (Exception e){

        System.out.println("e.getMessage()"+e.getMessage());
        e.printStackTrace();
    }

}
}
