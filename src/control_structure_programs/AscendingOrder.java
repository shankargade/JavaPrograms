package control_structure_programs;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] Sort;

        Sort = new int[5];
        Scanner scanner = new Scanner(System.in);
         for (int i =0;i<Sort.length;i++)
         {
            Sort[i]= scanner.nextInt();
         }

      //  System.out.println(Sort);
        int temp;
        for (int i =0;i<Sort.length;i++)
        {
            for (int j=i +1;j<Sort.length;i++)
            {
                if (Sort[i]>Sort[j])
                {
                    temp =Sort[i];
                    Sort[i]=Sort[j];
                    Sort[j]=temp;
                }

            }
        }

        System.out.println();

        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < Sort.length; i++) {
            System.out.print(Sort[i] + " ");
        }

    }
}
