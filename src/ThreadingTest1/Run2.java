package ThreadingTest1;

public class Run2 {
    public static void main(String[] args){
        Service service = new Service();
        MyObject object = new MyObject();
        MyObject object1 = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object1);
        b.setName("B");
        b.start();
    }
}
