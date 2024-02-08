package multiThreadingProgram;

import java.util.ArrayList;

public class ThreadDemo1 implements Runnable{

   public static ArrayList<Integer> list = new ArrayList();
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadDemo1 s1 = new ThreadDemo1();
        ThreadDemo1 s2 = new ThreadDemo1();
        ThreadDemo1 s3 = new ThreadDemo1();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println(list);



    }
}
