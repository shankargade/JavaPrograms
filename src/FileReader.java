import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        int value1 , value2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        value1 = scanner.nextInt();
        value2= scanner.nextInt();
        System.out.println("Entered Value1:::>"+value1);
        System.out.println("Entered Value2::::>"+value2);
        int sum = value1+value2;
        int substraction=value1-value2;
        int multipy = value1*value2;
        int divide = value1/value2;

        System.out.println("sum::::>"+sum);
        System.out.println("substraction::::>"+substraction);
        System.out.println("multipy::::>"+multipy);
        System.out.println("divide::::>"+divide);


    }
}
