package control_structure_programs;


import java.util.Scanner;

public class InputOutPutStreamDemo {
    public static void main(String[] args) throws Exception {
        int input, input1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        input = scanner.nextInt();
        input1 =scanner.nextInt();
        int sum = input + input1;
        System.out.println("Your number ="+input);
        System.out.println("Your number ="+input1);
        System.out.println("Sum= " +sum);
    }
}
