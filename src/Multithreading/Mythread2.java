package Multithreading;

public class Mythread2 extends Thread{
    private MyOneList list;
    public Mythread2(MyOneList list)
    {
        super();
        this.list = list;
    }

    @Override
    public void run()
    {
        MyService myService = new MyService();
        myService.addServiceMethond(list,"B");
    }
}
