package ThreadingTest2;

public class Service {
    public void testMode1(MyObject object)
    {
        synchronized(object){
            try {
                System.out.println("testMethod1_getLock time="
                        + System.currentTimeMillis() + "run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1_releaseLock time="
                        + System.currentTimeMillis() + "run ThreadName="
                        + Thread.currentThread().getName());
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
