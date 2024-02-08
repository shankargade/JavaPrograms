package control_structure_programs;

public class SwitchDemo {
    public static void main(String[] args) {

        int number = 10;
        int number2 = 5;

        switch (number)
        {
            default:
                System.out.println("Its not between 1 to 5");
                break;

            case 5:
                System.out.println("Its Five");
                break;
            case 4:
                System.out.println("Its four");
                if (number2 != 4) {
                }
                else{
                    System.out.println("Number2 is  four");
                }
                break;
            case 1:
                System.out.println("Its one");
                // statements
                break;
            case 2:
                System.out.println("Its Two");
                break;
            case 3:
                System.out.println("Its three");
                break;
        }
        System.out.println("Program end here");

    }
}
