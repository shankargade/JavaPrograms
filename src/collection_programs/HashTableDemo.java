package collection_programs;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"Shankar");
        hashtable.put(2,"Pravin");
        hashtable.put(3,"Jyoti");
        hashtable.put(4,"Saurabh");
        System.out.println(hashtable);
        System.out.println(hashtable.remove(1));


        // HashMap -->  non synchronized // Faster // Single threaded


               /////////HashTable //////
        // HashTable -->synchronized // Slower // Multi threaded
        //11 default capacity
        //contains only Uniques element
        //does not allow null key or value
        //

    }
}
