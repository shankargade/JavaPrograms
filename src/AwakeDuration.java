import java.util.Scanner;

public class AwakeDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shankar! How long you want to keep your system awake?");
        System.out.print("Enter minutes: ");

        int minutes = 0;
        boolean isValidInput = false;

        try {
            minutes = Integer.parseInt(scanner.nextLine());
            if (minutes > 0) {
                isValidInput = true;
            } else {
                System.out.println("Input must be a numeric value greater than zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. Please enter a numeric value.");
        }

        if (isValidInput) {
            for (int i = 0; i < minutes; i++) {
                try {
                    Thread.sleep(60000); // 60 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print((char) 12); // Clear screen (equivalent to sending Scroll Lock key in Windows)
            }
            System.out.println("Forced awake time over. Back to normal routine.");
        } else {
            System.out.println("Task failed. Incorrect input, script won't run.");
        }
    }
}
