package TreadingTest3;

public class Run {
    public static void main(String[] args){
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        P p7 = new P(myStack);
        P p8 = new P(myStack);
        P p9 = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);
        C r6 = new C(myStack);
        C r7 = new C(myStack);
        C r8 = new C(myStack);
        C r9 = new C(myStack);
        P_Thread p_thread1 = new P_Thread(p1);
        P_Thread p_thread2 = new P_Thread(p2);
        P_Thread p_thread3 = new P_Thread(p3);
        P_Thread p_thread4 = new P_Thread(p4);
        P_Thread p_thread5 = new P_Thread(p5);
        P_Thread p_thread6 = new P_Thread(p6);
        P_Thread p_thread7 = new P_Thread(p7);
        P_Thread p_thread8 = new P_Thread(p8);
        P_Thread p_thread9 = new P_Thread(p9);
        C_Thread c_thread1 = new C_Thread(r1);
        C_Thread c_thread2 = new C_Thread(r2);
        C_Thread c_thread3 = new C_Thread(r3);
        C_Thread c_thread4 = new C_Thread(r4);
        C_Thread c_thread5 = new C_Thread(r5);
        C_Thread c_thread6 = new C_Thread(r6);
        C_Thread c_thread7 = new C_Thread(r7);
        C_Thread c_thread8 = new C_Thread(r8);
        C_Thread c_thread9 = new C_Thread(r9);
        p_thread1.start();
        p_thread2.start();
        p_thread3.start();
        p_thread4.start();
        p_thread5.start();
        p_thread6.start();
        p_thread7.start();
        p_thread8.start();
        p_thread9.start();
        c_thread1.start();
        c_thread2.start();
        c_thread3.start();
        c_thread4.start();
        c_thread5.start();
        c_thread6.start();
        c_thread7.start();
        c_thread8.start();
        c_thread9.start();
    }
}