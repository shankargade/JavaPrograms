package OOPS_Programs;

import java.util.Scanner;

public class ArithMaticMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of X");
        int x = scanner.nextInt();
        System.out.println("Enter value of y");
        int y = scanner.nextInt();

        ArithmaticOperations object1 = new ArithmaticOperations(x, y);
        //  object1.setX(20);
        //  object1.setY(50)

        System.out.println("Value of X=" + object1.getX());
        System.out.println("Value of y=" + object1.getY());

        System.out.println("Addition of X & Y=" + object1.Addition(object1.getX(), object1.getY()));
        System.out.println("Substraction of X & Y=" + object1.Sunstraction(object1.getX(), object1.getY()));
        System.out.println("Mutiplication of X & Y=" + object1.Multiply(object1.getX(), object1.getY()));
        System.out.println("Division of X & Y=" + object1.Division(object1.getX(), object1.getY()));
        System.out.println(object1);


    }
}
