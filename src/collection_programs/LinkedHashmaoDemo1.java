package collection_programs;

import java.util.LinkedHashMap;

public class LinkedHashmaoDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hm = new LinkedHashMap<>();
        hm.put("Shankar","Beed");
        hm.put("Jyoti","Pune");
        hm.put("Pravin","SinhgadRoad");
        hm.put("Saurabh","Warje");
        hm.put(null,"Dighi");
        hm.put(null,null);
        hm.put("Ganesh","Baner");
        System.out.println(hm.containsValue("Ganesh"));
        System.out.println(hm);


    }
}
