package collection_programs;

import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.Thread.sleep;

public class ArrayListExercise {
    public static void main(String[] args) throws InterruptedException {


        // arraylist random numbers -->store -->Pairs -->two numbers -->sum
        // User will enter one Number  -->
        //

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);       // 8 --> 3,5
        arrayList.add(6);       //7,1
        arrayList.add(7);       //6,2
        arrayList.add(8);

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(8);





        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf(4));
        System.out.println(arrayList.isEmpty());
        sleep(2000);
        System.out.println(arrayList.size());
        System.out.println(arrayList.clone());
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList.set(2,9));
        System.out.println(arrayList);
        System.out.println(arrayList.remove(3));
        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder()); // asked interview -->
        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);
        System.out.println(arrayList.contains(50));
        System.out.println(arrayList.addAll(arrayList2));
        arrayList.ensureCapacity(50);
        System.out.println( arrayList.getClass());











    }

}
