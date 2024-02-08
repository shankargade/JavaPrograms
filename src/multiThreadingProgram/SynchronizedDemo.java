package multiThreadingProgram;


public class SynchronizedDemo {


    public synchronized void printNumber() {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
    }


}
