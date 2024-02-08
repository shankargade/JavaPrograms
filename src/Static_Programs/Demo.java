package Static_Programs;

public class Demo {

    public static void main(String[] args) {
        System.out.println(StaticDemo.staticMethod());

        StaticDemo staticDemo = new StaticDemo();
        System.out.println( staticDemo.nonStaticMethod());

    }

/*
    public static void main(String[] args) {
        StaticDemo object = new StaticDemo();
        StaticDemo object1 = new StaticDemo();
        // StaticDemo.constantX

        System.out.println("static value with class name" + StaticDemo.constantX);
        object.constantX = StaticDemo.constantX + 10;
        System.out.println("static value with object ::::::" + object.constantX);
        System.out.println("static value with object 1:::::::" + object1.constantX);

    }*/
}
