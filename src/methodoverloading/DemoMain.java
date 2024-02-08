package methodoverloading;

public class DemoMain {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.display(); // old api -->old clients //We are at public void display()
        d1.display(2); // new api -->New clients will  use that--> //We are at public void display(int a)2
        int x= 10;
        int y= 20;
        d1.display(Integer.valueOf(10), Integer.valueOf(20)); // We are accepting Object a and object b
        d1.display(50.3f,60.3f); //We are at Float display method110.6
        d1.display(x,y); //Addition with the 2 parameters30
        d1.display(20,50.5f); //Addition with the a integer and float b70
        d1.display(20.0d,30.0d); // We are accepting Object a and object b
        d1.display("Shankar", "Jyoti");
    }
}
