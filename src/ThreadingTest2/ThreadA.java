package ThreadingTest2;

public class ThreadA extends Thread{
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object)
    {
        super();
        this.object = object;
        this.service = service;
    }

    public void run(){
        super.run();
        service.testMode1(object);
    }
}
