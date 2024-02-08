package InheritancePrograms;

public class SingleInheritance_B extends SingleInheritance_A
{
    int b; //

    public SingleInheritance_B(int a, int b) {
        super(a);
        this.b = b;
    }

    public void display()
    {
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
