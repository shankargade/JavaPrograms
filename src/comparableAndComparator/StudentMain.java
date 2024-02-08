package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> list =new ArrayList<>();
        list.add(new Student(1,"Shankar",80,"A"));
        list.add(new Student(2,"Jyoti",90,"B"));
        list.add(new Student(3,"Saurabh",92,"C"));
        list.add(new Student(4,"Parvin",89,"A"));
        list.add(new Student(5,"Mahesh",70,"B"));

        System.out.println("Before Sort");
        for (Student s:list){

            System.out.println(s);
        }

        Collections.sort(list);

        System.out.println("After Sort");
        for (Student s:list){

            System.out.println(s);
        }




    }
}
