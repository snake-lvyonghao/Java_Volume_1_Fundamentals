package Multithreading;

public class Run {
    public static void main(String[] args) throws InterruptedException
    {
        MyOneList myOneList = new MyOneList();
        MyThread1 myThread1 = new MyThread1(myOneList);
        myThread1.setName("A");
        myThread1.start();
        Mythread2 mythread2 = new Mythread2(myOneList);
        mythread2.setName("B");
        mythread2.start();
        Thread.sleep(6000);
        System.out.println("listsize=" + myOneList.getsize());
    }
}
