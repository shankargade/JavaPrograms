package collection_programs;

import java.util.ArrayList;

public class ArrayOperations {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1100);
        arrayList.add(1200);
        arrayList.add(1300);
        arrayList.add(1400);
        arrayList.add(1500);
        arrayList.add(1600);
        arrayList.add(1700);
        arrayList.add(1800);
        arrayList.add(1900);
        arrayList.add(2000);
        System.out.println("First Arraylist      "+arrayList);
        arrayList.add(4,2200);
        System.out.println("After adding element at 4 th index Arraylist      "+arrayList);
        arrayList.remove(6);
        System.out.println("After Deletion of Item at 6 th position"+arrayList);


    }
}
