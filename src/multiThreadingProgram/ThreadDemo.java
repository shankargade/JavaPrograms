package multiThreadingProgram;

public class ThreadDemo extends Thread
{
    @Override
    public void run() {
        System.out.println("This is my Thread class ThreadDemo and I have created it ");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        t1.checkAccess();
        t1.setName("Shankar");
        t1.setPriority(1);
        System.out.println("t1.getState():::> "+t1.getState());
        System.out.println("t1.getId()::> "+ t1.getId());
        System.out.println("t1.getName()::> "+t1.getName());
        sleep(1000);
        System.out.println("t1.getPriority()::> "+ t1.getPriority());
        System.out.println("t1.getState():::> "+t1.getState());
        System.out.println("t1.getClass()::> "+ t1.getClass());

       // Four States of thread

        // New
        //Active
        //Runnable
        //Block/Waiting
        //Terminated

      //  t1.run();
      /*  ThreadDemo t2 = new ThreadDemo();
        t2.start();*/

    }
}
