package collection_programs;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String > tm = new TreeMap<>();
        tm.put("Shankar","Beed");
        tm.put("Jyoti","Pune");
        tm.put("Pravin","SinhgadRoad");
        tm.put("Saurabh","Warje");
        //tm.put(null,"Dighi");
        tm.put("null",null);
        tm.put("Ganesh","Baner");
      //  tm.put("Ganesh","Baner");

        System.out.println(tm);
    }
}
