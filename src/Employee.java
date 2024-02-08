public class Employee{
    private int empId;
    private String empName;
    private int empSal;

    public Employee(int empId, String empName, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public static int bonusAmount = 5000; // class level

    public long calulateAnnualSal(int empSal)
    {
        long annualSal; // local variable
        annualSal = empSal * 12;
        return annualSal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }
}
