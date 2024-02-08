public class OperatorEx {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int d = ++b;
        int c = a++ + b++ + --d;  // jyoti = c = 25, a = 6 b =11 d =11 5+ 11 + 10

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        // shankar c =15, a =6 b = 11
        // sau c =16, a= 5 b =11
        // jyoti c= 16 a=6 , b=11

        // 10+

    }
}
