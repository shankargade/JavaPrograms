package methodoverloading;

public class Demo {

    public void display(){
        System.out.println("We are at public void display()");
        //display(10);

    }

    public int   display(int a ){
        System.out.println("We are at public void display(int a)"+a); // new method
        return a;
    }


//    public void display(Integer a,Integer b)
//    {
//        int sum =a+b;
//        System.out.println("Wrapper class Addition with the 2 parameters"+sum);
//    }

    public void display(Object a,Object b)
    {
      //  int sum =a+b;
        System.out.println("We are accepting Object a and object b");
    }

    public void display(String a,String b)
    {
        //  int sum =a+b;
        System.out.println("We are accepting String a and String b");
    }

    public void display(int a,int b) {
        int sum = a + b;
        System.out.println("Addition with the 2 parameters" + sum);
    }

    public void display(float a,float b)
    {
        float sum = a+b;
        System.out.println("We are at Float display method"+sum);
    }

    public void display(int a,float b) {
        int sum = (int) (a + b);
        System.out.println("Addition with the a integer and float b" + sum);
    }
}
