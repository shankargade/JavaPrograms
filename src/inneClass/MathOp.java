package inneClass;

public class MathOp {
    int value1;
    int value2;
    public class Addition
    {
        int num1;
        int num2;
        public int doAdd(int num1, int num2)
        {
            this.num1 = num1;
            this.num2 = num2;
            return num1 + num2;
        }

    }

    public static class Substraction
    {
        int num1;
        int num2;
        public int doSub(int num1, int num2)
        {
            this.num1 = num1;
            this.num2 = num2;
            return num1 - num2;
        }

    }

    public void doSomeMagic()

    {
        System.out.println(value1);
        System.out.println(value2);
    }

}
