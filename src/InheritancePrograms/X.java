package InheritancePrograms;

public class X {

    int a;

     static{
         System.out.println("I am at Static Block of Class X");
    }

    {
        System.out.println("I am at instance block of class x");
    }

    public X(int a) {
        System.out.println("I am at Constructor class X");
        this.a = a;
    }
}
