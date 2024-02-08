package exception_handling;

import java.util.Objects;

public class Product {

    int productNumber;
    String productName;

    double productPrice;


    public Product(int productNumber, String productName, double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productNumber == product.productNumber && Double.compare(productPrice, product.productPrice) == 0 && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNumber, productName, productPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Its finalize called by garbage collector");
    }
}
