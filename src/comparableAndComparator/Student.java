package comparableAndComparator;

public class Student implements Comparable<Student> {
    private int rollNo;

    private String Name;

    private int marks;

    private String division;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                ", division='" + division + '\'' +
                '}';
    }

    public Student(int rollNo, String name, int marks, String division) {
        this.rollNo = rollNo;
        Name = name;
        this.marks = marks;
        this.division = division;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks == o.marks) {
            return 0;
        } else if (this.marks < o.marks) {

            return 1;

        } else {
            return -1;
        }
    }
}
