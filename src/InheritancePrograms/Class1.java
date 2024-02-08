package InheritancePrograms;

public class Class1 implements interface1
{
    int b;
    @Override
    public void showMessage()
    {
        System.out.println(a);
        System.out.println("This is show method");
    }

    @Override
    public void display()
    {
        System.out.println(this.b); //
        System.out.println("interface b ="+ interface1.b);
        //System.out.println(interface1.b);
        System.out.println("THis is display method");
    }
}
