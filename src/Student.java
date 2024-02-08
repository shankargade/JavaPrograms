public class Student extends Object {
    private int StudentId;
    private String StudentName;
    private  int StudentRollNo;


    public Student(int studentId, String studentName, int studentRollNo) {
        StudentId = studentId;
        StudentName = studentName;
        StudentRollNo = studentRollNo;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentRollNo() {
        return StudentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        StudentRollNo = studentRollNo;
    }
}
