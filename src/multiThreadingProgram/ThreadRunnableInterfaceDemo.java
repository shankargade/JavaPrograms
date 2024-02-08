package multiThreadingProgram;

import static java.lang.Thread.sleep;

public class ThreadRunnableInterfaceDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("This is the Run method of Thread");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadRunnableInterfaceDemo t1 = new ThreadRunnableInterfaceDemo();
        //t1.run(); not the way of create thread
        Thread t2 = new Thread(t1);
        t2.start();
        t2.checkAccess();
        t2.setName("Shankar");
        t2.setPriority(1);
        System.out.println("t1.getState():::> "+t2.getState());
        System.out.println("t1.getId()::> "+ t2.getId());
        System.out.println("t1.getName()::> "+t2.getName());
        sleep(2000);
        System.out.println("t1.getPriority()::> "+ t2.getPriority());
        System.out.println("t1.getState():::> "+t2.getState());
        System.out.println("t1.getClass()::> "+ t2.getClass());

        // Array -->
        //t1 --> 0 to 4 -->100,200,1000,500,600
        // t2 --> 5 to 9 -->
        // t3 --> 10 to 14 -->

    }
}
