package multiThreadingProgram;

public class SyncBlockDemo {

    //Defining the synchronized block inside method

    public void printSomeNumbers(int n)
    {
//        synchronized (this)
//        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(i);
            }

            System.out.println();
//        }
        System.out.println("End of sync block");

    }
}
