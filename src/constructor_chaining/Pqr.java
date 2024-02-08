package constructor_chaining;

public class Pqr {

    int x;
    int y;

    public Pqr()
    {
      //  this(1); // We are calling another constructor here from constructor itself
        System.out.println("This is default constructor" +x);
        System.out.println("This is default constructor" +y);
    }

    public Pqr(int x)
    {
        this(); // When we reach to this constructor again I have called another constructor
        this.x = x;
        System.out.println("This is First parametrized constructor" +x);
        System.out.println("This is First parametrized constructor" +y);
    }

    public Pqr(int x, int y) {
        this(8);
        this.x = x;
        this.y = y;
        System.out.println("This is Second parametrized constructor" +x);
        System.out.println("This is Second parametrized constructor" +y);
    }
}
