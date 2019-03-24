public class Main {

    public static void main(String[] args) {
        A a = new A();
        int x = a.N;
        System.out.println(x);
        a.N = 11;
        System.out.println(a.getN());

    }
}
class A{
    public int N = 10;

    public int getN() {
        return N;
    }
}
