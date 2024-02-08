package control_structure_programs;

import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args) {
/*        int i = 0;
        for (i = 1; i < 3; ++i) { // i =1,2,3
            for (int j = 0; j < 5; j++) { // j=0,1,2,3,4
                System.out.println(i + " " + j); // 10 11 12 13 14
            }                                   //20  21, 22 , 23 24
        }*/


        // Input //Output -->Home work-->console
        // Array --> Questions -->Logical Building -->
        // int array[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        for (Integer i : numberList) { // advanced for loop
            System.out.println(i);
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }


    }
}
