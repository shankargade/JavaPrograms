package collection_programs;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExcercise {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);


        LinkedList<Integer> newList = new LinkedList<>(list);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(50));
        int ele = 90;
        //  System.out.println(list.indexOf(ele));
        System.out.println(list.indexOf(20));
        System.out.println(list.equals(newList));
        list.clear();




    }
}
