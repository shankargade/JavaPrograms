package ObjectClassPrograms;

import exception_handling.Product;

public class ObjectDemo1
{
    public static void main(String[] args) {

        Product product1 = new Product(1, "Parle", 5.0);
        Product product2 = new Product(1, "parle", 5.0);

         product1 = null;
       // System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

      //  System.out.println(product1.equals(product2));

        System.out.println(product1);
        System.out.println(product2);

     //   System.out.println(product1.getClass());
//System.out.println(product1.getClass().getName());

        System.gc();

        //







        // If you say two objects are equals then there hashcode should same

//        Object object = new Object();
//        System.out.println(object.hashCode());
    }


}
