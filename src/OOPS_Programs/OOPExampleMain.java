package OOPS_Programs;

public class OOPExampleMain {


    public static void main(String[] args) {
        OOPExample object1 = new OOPExample();

        object1.setX(10);
        object1.setY(20);


        System.out.println("Object1-->X-->" + object1.getX());

        System.out.println("Object1-->Y-->" + object1.getY());
        System.out.println("Object1 --> sum-->" + OOPExample.Addition(object1.getX(), object1.getY()));
        System.out.println(object1);


        OOPExample object2 = new OOPExample();
        object2.setX(30);
        object2.setY(50);

        System.out.println("Value of object2(X)::>"+object2.getX());
        System.out.println("Value of object2(Y)::>"+object2.getY());
        System.out.println("AdditionOf"+OOPExample.Addition(object2.getX(), object2.getY()));
        System.out.println(object2);
        
    }


}
