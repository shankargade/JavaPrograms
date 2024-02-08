package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Abc {
    // declare two variables -->accept values from user -->Div,Mul,Sub,Add

    public static void main(String[] args) {
        try {

            // m1 -->m2 -->m3 -->error -->stop // throws

            int x = 0;

            int y;

            int sum,div = 0,mul,sub;

            // throw -->actual usage -->industry
            // throws  -->actual usage -->industry

            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter First Number");
            try {
                x= sc.nextInt();

            }catch (Exception e)
            {
                System.out.println("Exception"+e);
            }

            System.out.println("Please Enter Second Number");
            sc.nextLine();
            y=sc.nextInt();

            sum = x+y;

            try {
                div = x / y;  // We cant perform here div operation but we can perform rest all operation

            }catch (ArithmeticException e)
            {
                System.out.println("ArithmeticException"+e);
            }
            mul=x*y;
            sub=x-y;

            System.out.println("Sum of Number ="+sum);
            System.out.println("div of Number ="+div);
            System.out.println("mul of Number ="+mul);
            System.out.println("sub of Number ="+sub);

        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException"+e);
        }

        catch (Exception e)
        {
            System.out.println("Exception"+e);
        }



    }

}
