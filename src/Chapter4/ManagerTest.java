package Chapter4;

public class ManagerTest {
    public static void main(String[] args)
    {
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);

        Employee[] stuff = new Employee[3];

        stuff[0] = boss;
        stuff[1] = new Employee("Harry hacker",50000,1989,10,1);
        stuff[2] = new Employee("Tony Tester",40000,1990,3,15);

        if(stuff[1] instanceof Manager){
            Manager bos = (Manager)stuff[1];
        }

        for (Employee e : stuff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
