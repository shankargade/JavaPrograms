package control_structure_programs;

import java.util.Scanner;

public class JavaPracticeFileReader {

    public static void main(String[] args) {
        int Value1 , Value2 ;
        String Xyz ;
        float Abc;




        System.out.println("Enter your InPuts");
        Scanner scanner = new Scanner(System.in);

        Xyz =scanner.nextLine();

        System.out.println("Enter Your String Value"+Xyz);

        Abc=scanner.nextFloat();

        System.out.println("Enter Your Float Value"+Abc);


        Value1 =scanner.nextInt();
        Value2 = scanner.nextInt();
        int Sum =Value1 + Value2 ;
        int Sub =Value1 - Value2 ;
        int Mul =Value1 * Value2 ;
        int Div =Value1 / Value2 ;

        System.out.println("Your Sum is"+Sum);
        System.out.println("Your Sub is"+Sub);
        System.out.println("Your Mul is"+Mul);
        System.out.println("Your Div is"+Div);

        System.out.println("Operation Complete adn end of program ");








    }


}
