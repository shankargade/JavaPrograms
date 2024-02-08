package collection_programs;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(38);
        list.add(66);
        list.add(34);
        list.add(89);
        list.add(45);
        list.add(2323);
        list.add(78);
        list.add(10);
        list.add(38);

        System.out.println("Elements in ArrayList"+list);

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);

// write the program to remove duplicates from arraylist without using hashset.
        // write the program to sort from arraylist without using existing methods.
        // ArrayList vs LinkedList
        // ArrayList vs Set
        // HashSet vs LinkedHashSet vs TreeSet
        //
    }
}
