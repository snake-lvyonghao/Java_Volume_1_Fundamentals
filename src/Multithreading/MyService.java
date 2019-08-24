package Multithreading;

public class MyService {
    public MyOneList addServiceMethond(MyOneList list,String data){
        try {
            synchronized (list) {
                if (list.getsize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        return list;
    }
}
