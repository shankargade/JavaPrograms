package exception_handling;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String str) {
        super(str);
    }

}
