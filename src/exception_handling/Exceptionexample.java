package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionexample {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int x = scanner.nextInt();
            System.out.println("you entered " + x);
        }

        // If you dont know what kind of execution will occur then simply you can take Exception
        catch (ArithmeticException e)
        {
            System.out.println("InputMismatchException block");
        }

        catch (Exception e)
        {
            System.out.println("Exception block");
        }

        finally
        {
            System.out.println("This is the finally block will get executed ate any case");
        }

    }
}
