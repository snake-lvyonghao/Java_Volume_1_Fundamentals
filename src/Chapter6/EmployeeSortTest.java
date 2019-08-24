package Chapter6;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args){
        Employee[] stuff = new Employee[3];

        stuff[0] = new Employee("Harry",5000);
        stuff[1] = new Employee("Carl",37000);
        stuff[2] = new Employee("Tony Tester",9000);

        Arrays.sort(stuff);

        for (Employee e :
                stuff) {
            System.out.println("name=" + e.getName() + ",Salary=" + e.getSalary());
        }
    }
}
