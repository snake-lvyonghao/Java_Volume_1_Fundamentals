package ThreadingTest2;

public class Run2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].run();
        }
    }
}
