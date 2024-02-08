public class TernaryOp {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        int result = num1 > num2 ? num1 : num2;
                    // Here check condition ? if true then execute first one : if false execute second one
      //  System.out.println(result);

        //exp1? block1 : block2;



        // type casting
        // long -->fractional/real -->whole number


        // widening and Narrowing Type -->assign
        // float -->Int
        //Inter -->float

        int a= 10;
        long b = a;
        // from left to right -->Narrowing
        //              double(8) -- float(4) -- long(8) -- int(4) -- short(2) -- byte(1)
        // right to left -->Widening
        int a11 =100; // 4 bytes
        //byte b12 = a; // 1 bytes

        byte a1 = 10; // 1 bytes
        int b1 = a1; // 4 bytes


        float input = 3.14F;
        long input2 = (long) input;
        System.out.println(input2);
        System.out.println(input2 > input ? input : input2);




    //    System.out.println(input instanceof Float ? true : false);
    }
}
