package 第九章;
import 第六章.Employee;

import java.util .*;

/** This program demonstrates the use of a map with key type String and value type Employee.
 * ©version 1.00 2019-4-3
 * ©author snake_lvyonghao
 */
public class MapTest {
    public static void main(String[] args)
    {
        Map<String, Employee>staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee",5000));
        staff.put("567-24-2546", new Employee("Harry Hacker",80000));
        staff.put("157-62-7935", new Employee("Cary Cooper",6000));
        staff.put("456-62-5527", new Employee("Francesca Cruz",30000));
// print all entries
        System.out.println(staff);
// remove an entry

        staff.remove("567-24-2546");
// replace an entry
        staff.put("456-62-5527", new Employee("Francesca Hiller",6000));
// look up a value
        System.out.println (staff.get("157-62-7935")); // iterate through all entries
        staff.forEach((k, v) ->
                System.out.println("key = " + k + "value:" + v));
    }
}