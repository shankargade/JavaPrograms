package inneClass;

public class MathMain {

    public static void main(String[] args) {

        MathOp outerClassObject = new MathOp(); // Outer class and outerClassObject is outer class object
        outerClassObject.doSomeMagic();
        // Outer class object will not access the attributes of inner class and vice versa


        MathOp.Addition  addObject = outerClassObject.new Addition();
        System.out.println(addObject.doAdd(10,20));
        


       MathOp.Substraction subObject = new MathOp.Substraction();
        System.out.println(subObject.doSub(20,10));



    }
}
