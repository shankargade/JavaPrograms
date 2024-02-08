package InheritancePrograms;

public class W extends Y{

    int c;

    static{
        System.out.println("I am at Static Block of Class W");
    }

    {
        System.out.println("I am at instance block of class W");
    }

    public W(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("I am at Constructor class W");
    }
}
