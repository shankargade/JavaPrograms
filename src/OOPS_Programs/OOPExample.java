package OOPS_Programs;

// POJO
public class  OOPExample {
    private int x;
    private int y;

    private static int sum;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public  static int Addition(int x, int y) {
        sum = x + y;
        return sum;
    }

    @Override
    public String toString() {
        return "OOPExample{" +
                "x=" + x +
                ", y=" + y +
                ", sum=" + sum +
                '}';
    }
}
