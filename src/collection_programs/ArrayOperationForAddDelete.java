package collection_programs;

import java.util.Arrays;

public class ArrayOperationForAddDelete {

    public static void main(String[] args) {

        int array[] ={1,3,4,5,7,8,9,5,53,34,2,32,56,3,4,5,6};
        int arraylenth = array.length;
        int newaddNew[] = new int[arraylenth+1];
        int newvalue = 7;
        System.out.println(Arrays.toString(array));
        for(int i = 0; i<arraylenth; i++) {
            newaddNew[i] = array[i];
        }
        newaddNew[arraylenth] = newvalue;
        System.out.println(Arrays.toString(newaddNew));


        System.out.println(" New Element Original Array : " + Arrays.toString(newaddNew));
        int removeIndex = 1;

        for (int i = removeIndex; i < newaddNew.length - 1; i++) {
            newaddNew[i] = newaddNew[i + 1];
        }

        System.out.println("After removing the second element: " + Arrays.toString(newaddNew));

    }
}