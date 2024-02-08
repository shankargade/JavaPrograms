package collection_programs;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(10); // bucket number
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);
       // set.add(20);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.clone());
        System.out.println(set);


    }
}
