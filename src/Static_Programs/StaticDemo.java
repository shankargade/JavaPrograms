package Static_Programs;

public class StaticDemo {

    // static variable
    public static int constantX = 100;

    private int x;
    // instance variables
    private int y;

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

    public static int staticMethod() {
        return constantX;
    }

    public int nonStaticMethod(){
        return constantX;
    }





}
