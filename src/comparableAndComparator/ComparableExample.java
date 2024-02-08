package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Shankar",30,"Pune",100000));
        list.add(new Employee(2,"Jyoti",23,"beed",200000));
        list.add(new Employee(3,"Praveen",32,"singhgaderoad",300000));
        list.add(new Employee(4,"Saurabh",23,"warje",400000));
        list.add(new Employee(5,"Mahesh",28,"pendgaon",500000));
        System.out.println("Before Sort");
        for (Employee e : list) {
            System.out.println(e);
        }

        Collections.sort(list);

        System.out.println("After Sort");
        for (Employee e : list) {
            System.out.println(e);
        }


    }
}
