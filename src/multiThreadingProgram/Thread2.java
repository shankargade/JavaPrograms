package multiThreadingProgram;

public class Thread2 extends Thread {

    SyncBlockDemo obj2;

    Thread2(SyncBlockDemo s2)
    {
        this.obj2=s2;
    }


    @Override
    public void run() {
        obj2.printSomeNumbers(8);
    }
}
