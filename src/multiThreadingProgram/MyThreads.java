package multiThreadingProgram;

public class MyThreads implements Runnable {

    SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        synchronizedDemo.printNumber();
    }

    public static void main(String[] args) {



        MyThreads m1 = new MyThreads();

        Thread t1 = new Thread(m1);
        t1.setName("Shankar");

        t1.start();



        Thread t2 = new Thread(m1);
        t2.setName("Saurabh");
        t2.start();







    }
}
