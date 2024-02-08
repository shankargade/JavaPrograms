package multiThreadingProgram;

public class ThreadMain {
    public static void main(String[] args) {

        SyncBlockDemo s1 = new SyncBlockDemo();

        Thread1 t1 = new Thread1(s1);
        Thread2 t2 = new Thread2(s1);

        t1.start();
        t2.start();

    }
}
