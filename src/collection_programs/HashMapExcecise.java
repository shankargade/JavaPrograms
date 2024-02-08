package collection_programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapExcecise {
    public static void main(String[] args) {

        EmployeeHash emp1 = new EmployeeHash(1, "Shankar", 10000, "Dighi");
        EmployeeHash emp2 = new EmployeeHash(2, "Pravin", 20000, "SinhgadRoad");
        EmployeeHash emp3 = new EmployeeHash(3, "Jyoti", 30000, "Kasarwadi");
        EmployeeHash emp4 = new EmployeeHash(4, "Saurabh", 40000, "Warje");


        HashMap<Integer, EmployeeHash> hashMapObj = new HashMap<Integer, EmployeeHash>();
        hashMapObj.put(emp1.getEmpId(), emp1);
        hashMapObj.put(emp2.getEmpId(), emp2);
        hashMapObj.put(emp3.getEmpId(), emp3);
        hashMapObj.put(emp4.getEmpId(), emp4);
        System.out.println(hashMapObj);

    }
}
