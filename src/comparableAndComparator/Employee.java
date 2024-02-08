package comparableAndComparator;

public class Employee implements Comparable<Employee> {

    private int empId;
    private String name;
    private int age;
    private String city;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int empId, String name, int age, String city, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }

    // I am comparing here the age attribute
    // 0,1,-1
    // 0 -->if two objects (this, empObject) parameters are same
    // 1 -->current object parameter is greater/smaller than the empObject
    // -1 -->if current object parameter is not greater/smaller than the empoObject
    @Override
    public int compareTo(Employee empObject) {
        if (this.age == empObject.age) {
            return  0;
        }
        else if (this.age < empObject.age) {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
