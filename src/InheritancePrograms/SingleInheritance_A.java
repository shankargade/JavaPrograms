package InheritancePrograms;

public class SingleInheritance_A
{
   int a;

   static int c = 100;
   // public -->accessible anywhere
   // protected -->it can be accessible to subclasses and within package
   // private --> Those members are only accessible within class
   // When you have not defined any data type then it will consider as default // are get accessible with package

    public SingleInheritance_A(int a) {
        this.a = a;
    }


    public void display()
    {
        System.out.println(this.a);
    }

    public static void showMessage()
    {
        System.out.println(c);
        System.out.println("This is show method from class SingleInheritance_A");
    }

}
