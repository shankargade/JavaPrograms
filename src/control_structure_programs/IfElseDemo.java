package control_structure_programs;

public class IfElseDemo {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -10;
        // Ternary operator
        if(num1 <0 || num2 <0)
        {
            System.out.println("num1 or num2 are negative");
        }
         if(num1>num2)
        {
            System.out.println("Greatest Number-->" + num1);
        }
         if (num2 > num1) {
            System.out.println("Greatest Number-->" + num2);
        }
         if (num1 == num2)
        {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("nothing here");
        }
        System.out.println("Program end here");
   }
    // Syntax -->
    // If(Conditional Statement)
    // {
    //  Statements
    // }
    // else
    //{
     // else statements
    //}

    // Program to find the greater number from given numbers
    // We can accept this numbers from user that is from console







}
