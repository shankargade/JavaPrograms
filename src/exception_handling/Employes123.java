package exception_handling;

public class Employes123 {

    int employeeId;
    String empName;

    double empSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Employes123(int employeeId, String empName, double empSalary) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
}
