package ThreadingTest2;

public class ThreadB extends Thread{
    private Service service;
    private MyObject object;

    public ThreadB(Service service, MyObject object)
    {
        super();
        this.object = object;
        this.service = service;
    }

    public void run(){
        super.run();
        object.speedPringtString();
    }
}
