package Multidimensional_Array;

import java.util.Scanner;

public class MultiDiArray {

    public static void main(String[] args) {

        // Write a program to accept the values for 3 by 3 matrix and display it on console

        // How we can declare multidimensional array
        // data type[] [] array_name = new data_type [size] [size]
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }


}
