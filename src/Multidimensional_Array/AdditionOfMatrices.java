package Multidimensional_Array;

import java.util.Scanner;

public class AdditionOfMatrices {
    public static void main(String[] args) {

        int[][] matrix1 = new int[3][3]; //9
        int[][] matrix2 = new int[3][3]; //9

        int[][] addition = new int[3][3]; //9

        matrix1 = readMatrix(matrix1);
        matrix2 = readMatrix(matrix2);
        addition = additionMatrix(matrix1, matrix2);

        displayMatrix(addition);
    }


    private static void displayMatrix(int[][] temp) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + temp[i][j]);
            }
            System.out.println();
        }

    }

    private static int[][] readMatrix(int[][] temp) {
        System.out.println("Enter matrix");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][j] = scanner.nextInt();
            }
        }
        return temp;
    }

    private static int[][] additionMatrix(int[][] temp1, int[][] temp2) {
        System.out.println("Addition of  matrix");
        int[][] addition = new int[3][3]; //9

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                addition[i][j] = temp1[i][j] + temp2[i][j];
            }
        }
        return addition;
    }

}
