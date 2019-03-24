package 第五章;

public class EqualsTest {
    public static void main(String[] args){
        Emplyoee alice1 = new Emplyoee("Alice Adams",75000,1983,12,15);
        Emplyoee alice2 = alice1;
        Emplyoee alice3 = new Emplyoee("Alice Adams",75000,1983,12,15);
        Emplyoee Bob = new Emplyoee("Bob Brandson",50000,1989,10,1);

        System.out.println("alice1 == alice2:" + (alice1 == alice2));
        System.out.println("alice1 == alice3:" + (alice1 == alice3));
        System.out.println("alicel.equals(alice3):" + alice1.equals(alice3));
        System.out.println("alicel.equals(Bob):" + alice1.equals(Bob));
        System.out.println("Bob,toString:" + Bob.toString());

        Manager Boss = new Manager("Alice Adams",75000,1983,12,15);
        Manager carl = new Manager("Carl Cracker",80000,1987,12,15);
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        System.out.println("boss.toString:" + boss.toString());
        System.out.println("carl.equals(boss):" + carl.equals(boss));
        System.out.println("alice1.equals(Boss):" + alice1.equals(Boss));
        System.out.println("alice1.hashcode:" + alice1.hashCode());
        System.out.println("alice3.hashcode:" + alice3.hashCode());
        System.out.println("Bob.hashcode:" + Bob.hashCode());
        System.out.println("carl.hashcode:" + carl.hashCode());

    }
}
