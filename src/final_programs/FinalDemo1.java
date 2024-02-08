package final_programs;

public class FinalDemo1 {

    public final int a = 200; // only final // instance -->object associated
    public final static int b = 300; // final and static -->class level // single copy //constant
    public static int c =500; // class level // it's not constant -->we can change


    public void showMessage() {
        System.out.println("This is my showMessage method");
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Value of c = " + c);
    }
}
