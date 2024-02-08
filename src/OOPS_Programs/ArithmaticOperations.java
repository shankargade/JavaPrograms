package OOPS_Programs;

public class ArithmaticOperations {

    private int X;
    private int y;

    private int sum;
    private int subs;
    private int mul;
    private  int div;

    public ArithmaticOperations(int x, int y) {
        this.X = x;
        this.y = y;
    }

    public int getX()
    {
        return X;
    }

    public void setX(int x){
      this.X =x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int Addition(int x,int y)
    {
        sum =x+y;

        return sum;
    }

    public  int Sunstraction(int x,int y)
    {
        subs =x-y;
        return  subs;
    }

    public int Multiply(int x,int y)
    {
        mul = x*y;
        return  mul;
    }

    public int Division(int x,int y)
    {
        div =x/y;

        return div;
    }

    @Override
    public String toString() {
        return "ArithmaticOperations{" +
                "X=" + X +
                ", y=" + y +
                ", sum=" + sum +
                ", subs=" + subs +
                ", mul=" + mul +
                ", div=" + div +
                '}';
    }
}
