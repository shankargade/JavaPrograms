public class TypeCastingEx {
    public static void main(String[] args) {
        byte a1 =1;
        short a2 = 2;
        int a3 = 3;
        long a4 = 4;
        float b1 =1.2F;
        double b2 = 3.14;

        // Some is the Widening type cast example
        System.out.println("----------------Widening type cast-----------------");
        short c1 = a1;
        System.out.println(c1);
        int c2 = a2;
        System.out.println(c2);
        long c3 =a3;
        System.out.println(c3);
        float c4 = a2;
        System.out.println(c4);
        float c5= a4;
        System.out.println(c5);
        double c6 = b1;
        System.out.println(c6);

        // Narrowing type cast
        System.out.println("---------------------Narrowing type cast--------------------");
        short d1 = (short) a3; // type cast
        System.out.println(d1);
        int d2 = (int) a4;
        System.out.println(d2);
        long d3 = (long) b1;
        System.out.println(d3);
        float d4 = (float) b2;
        System.out.println(d4);







    }

}
