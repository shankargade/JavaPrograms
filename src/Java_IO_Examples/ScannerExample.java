package Java_IO_Examples;

import java.util.Arrays;
import java.util.*;

public class ScannerExample {

    public static void main(String[] args) {



        // String
        // float
        // int
        // store
        // Array declaration
        int[] numbers;
        // Size allocation and creation
        numbers = new int[5];

        // those are even find the addition of those numbers only

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter number to search in array");
        int searchnumber = scanner.nextInt();
        // int count =0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++)
        {
            if (searchnumber == numbers[i])
            {
                flag = true;
            }
        }
        if (flag)
        {
            System.out.println("Number found");
        }
        else
        {
            System.out.println("Number not found");
        }


        // Evaluate the sum Ascending oder// 1,3,5,10,20, // Descending -->20,10,5,3,1
       // numbers[0] =10;
         //numbers[1] =1;
        //numbers[2] =5;
        //numbers[3] =3;
        //numbers[4] =20;

//        int sum = 0;
//        //sum of Even Number
//        for (int i = 0; i < numbers.length; i++)
//        {
//            if(numbers[i]%2==0)
//            {
//                sum = sum + numbers[i];
//
//            }
//            //
//             //Sum of Odd Numbers
////            if(numbers[i]%2!=0)
////            {
////
////                sum = sum + numbers[i];
////
////            }
//        }
        //System.out.println("Sum of given five numbers = " + sum);



    }

}
