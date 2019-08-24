package Chapter9;

import Chapter6.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464",new Employee("Amy Lee",5000));
        staff.put("567-24-2546",new Employee("Harry Hacker",5000));
        staff.put("157-62-7935",new Employee("Gray Cooper",5000));
        staff.put("456-62-5527",new Employee("Francesca Cruz",5000));

        System.out.println(staff);

        staff.remove("567-24-2546");

        staff.put("456-62-5527",new Employee("Francesa Miller",5000));

        System.out.println(staff.get("157-62-7953"));

        staff.forEach((k,v)->
            System.out.println("key" + k + ", value=" + v));

    }
}
