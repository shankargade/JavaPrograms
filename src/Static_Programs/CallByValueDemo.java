package Static_Programs;

public class CallByValueDemo {

    // Call by Value -->

    public static void main(String[] args)
    {

        int x = 10;
        int y = 20;

        swap(x, y);  // Value send functions -->x copy and paste a
        // y copy and b

        // a, b

        //x = incrementX(x);

        System.out.println(x);

        System.out.println("After Swapping x=" + x);
        System.out.println("After Swapping y=" + y);

    }

    private static int incrementX(int a) {

        System.out.println(a);
        return a + 1;
    }

    private static void swap(int x, int y) // a, y formal variable
    {
        System.out.println("Inside function swap");
        System.out.println("Before swap x=" + x);
        System.out.println("Before swap y =" + y);
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping x= "+x);
        System.out.println("After swapping y= "+y);

    }


}
