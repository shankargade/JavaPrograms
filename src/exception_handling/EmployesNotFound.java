package exception_handling;

public class EmployesNotFound extends RuntimeException {


    public EmployesNotFound(String str) {
        super(str);
    }


}
