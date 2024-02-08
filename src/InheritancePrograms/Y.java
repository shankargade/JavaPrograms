package InheritancePrograms;

public class Y extends X{

    int b;

    static{
        System.out.println("I am at Static Block of Class y");
    }

    {
        System.out.println("I am at instance block of class y");
    }

    public Y(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("I am at Constructor class Y");
    }
}
