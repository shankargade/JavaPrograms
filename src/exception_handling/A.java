package exception_handling;

public class A {

    public static void main(String[] args) {

           // System.out.println("I am at demo main");
        Object obj = new Object();
        try
        {
            demo();
           // System.out.println("Just Fun"); // why -->???-->// code -->
        }
        catch (NullPointerException e)
        {
            //throw new RuntimeException(e);
            System.out.println("I am at NullPointerException catch of main");
        }
        catch (Exception e)
        {
            System.out.println("I am at Exception catch of main");
            e.printStackTrace();
            System.out.println("e.toString() "+ e.toString());
            System.out.println("e.fillInStackTrace() "+e.fillInStackTrace());
            System.out.println("e.getLocalizedMessage() "+e.getLocalizedMessage());
            System.out.println("e.getMessage() "+e.getMessage());
            System.out.println("e.getCause() "+e.getCause());
            System.out.println("e.getSuppressed() "+e.getSuppressed());
            System.out.println("e.getStackTrace() "+e.getStackTrace());
           // System.out.println("e.initCause() "+e.initCause();
            System.out.println("e.hashCode() "+e.hashCode());
            // 10 hours -->Code reviews -->code quality -->Optimization -->
            // Code reviews --> PR delete --> -->Code -->

            // You dont have notes
            System.out.println("e.getClass() "+e.getClass());
           // e.
          //  System.out.println("e.addSuppressed() "+e.addSuppressed(););
            //throw new RuntimeException(e);
        }

      //  System.out.println("I am at end of demo main");

    }

    private static void demo() throws ArithmeticException  {
         //   System.out.println("Before div operation");
            int a,b;
            a = 10;
            b = 10;
            int c = a / b;
            performSubs();
         //   System.out.println("After div operation");

// Exception propagation from method demo to main


            //throw new ArithmeticException("demo");


    }

    private static void performSubs() throws ArithmeticException {
       // System.out.println("I am at performSubs method");
        int c, d;
        c = 20;
        d = 0;
        int e = c / d;
     //   System.out.println("I am at end of performSubs method");
    }


}
