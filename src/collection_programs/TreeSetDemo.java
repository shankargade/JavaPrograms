package collection_programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {
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

        TreeSet<Integer> treeSet = new TreeSet<>(list);
//        treeSet.add(10);
//        treeSet.add(5);
//        treeSet.add(30);
//        treeSet.add(45);
//        treeSet.add(34);
        System.out.println(treeSet);
    }
}
