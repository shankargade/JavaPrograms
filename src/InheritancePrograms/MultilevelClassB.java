package InheritancePrograms;

public class MultilevelClassB extends MultilevelClassA
{
    int b;

    public void display()
    {
        System.out.println("MultilevelClassB");
        System.out.println(this.b);
        super.display();
    }

}
