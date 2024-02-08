package multiThreadingProgram;

import java.util.ArrayList;

public class ThreadExcercise extends Thread
{
    ThreadArrayList arrayList;

    public ThreadExcercise(ThreadArrayList arrayList)
    {
        this.arrayList = arrayList;
    }
    @Override
    public void  run()
    {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++)
        {
            arrayList.addElement(i * 10);
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        ThreadArrayList list = new ThreadArrayList();
        ThreadExcercise t1 = new ThreadExcercise(list);
        ThreadExcercise t2 = new ThreadExcercise(list);
        ThreadExcercise t3 = new ThreadExcercise(list);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(list.getMyArrayList());
    }




}
