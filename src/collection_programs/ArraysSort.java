package collection_programs;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {

        int array[] ={2,4,6,7,8,8,9,5,4,3,6,7,9,6,4,5,6,0,98,7,65};
        Arrays.sort(array);
        for (int i =0;i<=array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
