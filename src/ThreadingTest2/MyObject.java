package ThreadingTest2;

public class MyObject {
    synchronized public void speedPringtString()
    {
        System.out.println("speedPrintString_getLock time="
                + System.currentTimeMillis()
                + Thread.currentThread().getName());
        System.out.println("----------------------");
        System.out.println("speedPrintString_getLock time="
                + System.currentTimeMillis()
                + Thread.currentThread().getName());
    }
}
