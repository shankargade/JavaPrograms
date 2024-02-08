package exception_handling;

import java.util.Scanner;

public class ArithmeticOp {
    // declare two variables -->accept values from user -->Div,Mul,Sub,Add

    public static void main(String[] args) {
        int x;

        int y;

        int sum,div = 0,mul,sub;


        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number");
        x= sc.nextInt();

        System.out.println("Please Enter Second Number");

        y=sc.nextInt();

        sum = x+y;
        try
        {
            div = x / y;  // We cant perform here div operation but we can perform rest all operation
        }
        catch (Exception e)
        {
            System.out.println("we got exception as -- "+ e);
        }
        mul=x*y;
        sub=x-y;

        System.out.println("Sum of Number ="+sum);
        System.out.println("div of Number ="+div);
        System.out.println("mul of Number ="+mul);
        System.out.println("sub of Number ="+sub);



    }

}
