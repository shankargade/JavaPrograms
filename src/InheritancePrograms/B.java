package InheritancePrograms;

public class B extends A {

    int y;

    public static void displayMessage()
    {
        System.out.println("I am at displayMessage class B");
    }

    @Override
    public void showMessage() {
        System.out.println("I am at showMessage method of class B");
    }
}
