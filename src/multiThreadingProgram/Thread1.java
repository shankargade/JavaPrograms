package multiThreadingProgram;

public class Thread1 extends Thread {
    SyncBlockDemo obj;

    Thread1(SyncBlockDemo s1) {
        this.obj = s1;
    }

    @Override
    public void run() {
        obj.printSomeNumbers(10);
    }
}
