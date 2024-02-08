package InheritancePrograms;

public class MultilevelClassC extends MultilevelClassB  {

    int c;

    public void display()
    {
        System.out.println("MultilevelClassC");
        System.out.println(this.c);
        super.display();
    }



}
