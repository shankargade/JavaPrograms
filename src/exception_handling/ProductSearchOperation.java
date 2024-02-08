package exception_handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSearchOperation {
    // This is the class where we search the product from db/array/list

    public static void main(String[] args) {

        try {
//            Object object = new Object();
//            object.hashCode();

            List<Product> productList = new ArrayList<>();
            Product product1 = new Product(1, "Parle", 5.0);
            Product product2 = new Product(2, "Good-day", 10.0);
            Product product3 = new Product(3, "bourborn", 10.0);
            Product product4 = new Product(4, "Happy-Happy", 5.0);
            Product product5 = new Product(5, "Krack-Jack", 5.0);
            productList.add(product1);
            productList.add(product2);
            productList.add(product3);
            productList.add(product4);
            productList.add(product5);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product name");
            String name = scanner.next();

            boolean flag= false;
            for (Product p : productList)
            {

                if (p.getProductName().equals(name)) {
                    System.out.println("Product found -->");
                    System.out.println(p.getProductName());
                    System.out.println(p.getProductNumber());
                    System.out.println(p.getProductPrice());
                    flag = true;
                }
            }
            if (!flag) {
                throw new ProductNotFoundException("Your product is not found");
            }


        }catch (Exception e){

            System.out.println("e.getMessage()"+e.getMessage());
            e.printStackTrace();
        }






    }

}
