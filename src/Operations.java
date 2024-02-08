//public class Operations {
//    public static void main(String[] args) {
//        Employee employee = new Employee(1, "Pravin", 10000);
//        Employee employee1 = new Employee(2, "Shankar", 20000);
//        System.out.println(employee.getEmpId());
//        System.out.println(employee.getEmpName());
//        System.out.println(employee.getEmpSal());
//        employee.bonusAmount =550;
//        System.out.println(Employee.bonusAmount);
//
//
//        System.out.println("Annual Sal:"+employee.calulateAnnualSal(employee.getEmpSal()));
//
//
//
//
//        System.out.println("------------------------------------");
//        System.out.println(employee1.getEmpId());
//        System.out.println(employee1.getEmpName());
//        System.out.println(employee1.getEmpSal());
//        System.out.println(Employee.bonusAmount);
//
//    }
//}
//
//
// // Super class -->Object

public class Operations {

    public static void main(String[] args) {
        Student student1 =new Student(1,"ShankarGade",55);
        Student student2 =new Student(2,"JyotiHnadibag",45);
        Student student3 =new Student(3,"Saurabhbele",56);




        Object obj = new Object(); // parent
       // obj = student1;
     //   student1 = (Student) obj;
        // student
        obj = student2;
        System.out.println(obj.toString());


        System.out.println(student1.getStudentId());
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentRollNo());

        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");

        System.out.println(student2.getStudentId());
        System.out.println(student2.getStudentName());
        System.out.println(student2.getStudentRollNo());

        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");


        System.out.println(student3.getStudentId());
        System.out.println(student3.getStudentName());
        System.out.println(student3.getStudentRollNo());



    }
}
