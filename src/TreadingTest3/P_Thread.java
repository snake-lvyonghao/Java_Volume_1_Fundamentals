package TreadingTest3;

public class P_Thread extends Thread{
    private P p;
    public P_Thread(P p){
        this.p = p;
    }

    @Override
    public void run(){
        while(true){
            p.pushService();
        }
    }
}
