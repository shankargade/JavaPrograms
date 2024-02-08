package collection_programs;

import java.util.HashMap;

public class HashMapDemo
{

    public static void main(String[] args)
    {

        HashMap<String, String> studentNamesMap = new HashMap<>();

        // If you want to add new elements into hashmap then use method put

        studentNamesMap.put("Shankar","Beed");
        studentNamesMap.put("Sourabh", "Beed");
        studentNamesMap.put("Jyoti","Beed");
        studentNamesMap.put("Pravin", "Pune");

        System.out.println(studentNamesMap);
        System.out.println(studentNamesMap.values());
        System.out.println(studentNamesMap.keySet());
        System.out.println(studentNamesMap.get("Pravin"));
        System.out.println(studentNamesMap.size());
        System.out.println(studentNamesMap.containsKey("Pravin"));
        studentNamesMap.put("Pravin", "Pune");
        //System.out.println(studentNamesMap.putIfAbsent("Pravin","Beedsdsd"));
        System.out.println(studentNamesMap);
        studentNamesMap.compute("Pravin", (key, value) -> value.concat("Sinhagad road"));
        System.out.println(studentNamesMap.containsValue("Satara"));
        System.out.println(studentNamesMap);
    }
}
