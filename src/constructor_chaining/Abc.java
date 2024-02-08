package constructor_chaining;

public class Abc {

    int x;
    int y;

    public Abc()
    {
        this(1); // We are calling another constructor here from constructor itself
        System.out.println("This is default constructor" +x);
        System.out.println("This is default constructor" +y);
    }

    public Abc(int x)
    {
        this(x, 2); // When we reach to this constructor again I have called another constructor
        this.x = x;
        System.out.println("This is First parametrized constructor" +x);
        System.out.println("This is First parametrized constructor" +y);
    }

    public Abc(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("This is Second parametrized constructor" +x);
        System.out.println("This is Second parametrized constructor" +y);
    }
}
