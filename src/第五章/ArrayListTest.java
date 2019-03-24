package 第五章;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Emplyoee> staff = new ArrayList<>();

        staff.add(new Emplyoee("carl",75000,1987,12,15));
        staff.add(new Emplyoee("Harry Hacker",50000,1989,10,1));
        staff.add(new Emplyoee("Tony Tester",40000,1990,3,15));

        for(Emplyoee e : staff)
            e.raiseSalary(5);

        for (Emplyoee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}
