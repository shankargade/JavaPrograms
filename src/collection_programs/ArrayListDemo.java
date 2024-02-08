package collection_programs;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {


        // ArrayList implements the LIST interface and extends AbstractList class
        // ArrayList contains duplicates
        // Arraylist having default capacity =10;
        // Arraylist size is dynamically growing -->we can store any count of numbers in it.
        // Program to use all the methods in the ArrayList

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(33);
        list.add(44);
        list.add(45);

        System.out.println(list);
        // list.
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.indexOf(3));
//        System.out.println(list.get(4));

//        if (list.contains(50))
//        {
//            System.out.println("Number present");
//        }else {
//
//            System.out.println("Number is not present ");
//        }
//        // surprise test -->10 mins --> -->50
//    }


        // Arraylist  vs Linked List
        //  dynamic array / internally implements doubly LL
        // Manipulation of elements are slow (require shifting) / Manipulation of elements are fast
        // implements list / implements List and Deque
        // require contagious memory  // Not require
        // capacity =10 // not require


    }
}
