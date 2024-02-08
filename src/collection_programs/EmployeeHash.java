package collection_programs;

public class EmployeeHash {
    private int empId;
    private String empName;
    private int empSalary;
    private String empAddress;

    @Override
    public String toString() {
        return "EmployeeHash{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }

    public EmployeeHash(int empId, String empName, int empSalary, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
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

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
}
