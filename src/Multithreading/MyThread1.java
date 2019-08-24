package Multithreading;

public class MyThread1 extends Thread {
    public MyOneList list;
    public MyThread1(MyOneList list)
    {
        super();
        this.list = list;
    }

    @Override
    public void run(){
        MyService myService = new MyService();
        myService.addServiceMethond(list,"B");
    }
}
