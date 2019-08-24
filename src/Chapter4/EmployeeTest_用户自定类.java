package Chapter4;

import java.time.LocalDate;

public class EmployeeTest_用户自定类 {
    public static void  main(String[] args){
        Employee[] stuff = new Employee[3];

        stuff[0] = new Employee("carl",75000,1987,12,15);
        stuff[1] = new Employee("Harry hacker",50000,1989,10,1);
        stuff[2] = new Employee("Tony Tester",40000,1990,3,15);

        for (Employee e : stuff)
            e.raiseSalary(5);
        for(Employee e : stuff)
            System.out.println("name = " + e.getName() + ",Salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());

        //静态域
        Employee harry = new Employee("lv",5000,1999,6,25);
        harry.setID();
        System.out.println(harry.getID());

        //静态方法访问自身类中静态域
        int n = Employee.getNexID();
        System.out.println(n);


        //当Employee中有可变的对象时，不要编写返回引用可变对象的访问器方法，如果需要则编写可变数据域的拷贝
//        Employee harry = new Employee("lv",5000,1999,06,25);
//        Date d = harry.getHireDay();
//        double tenYearsInMilliSeconds = 10 * 365.25 * 60 * 60 * 1000;
//        d.setTime(d.getTime() - (long)tenYearsInMilliSeconds);
    }
}
class Employee extends person
{
    private static int nexID = 1;
    private int ID;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int mouth,int day){
        super(n);
        salary = s;
        hireDay = LocalDate.of(year,mouth,day);
    }
 
    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Raise the salary of an employee
     * @praram byPercent the percentage by which to raise the salary(e.g. 10 menans 10%)
     * @return the amount of hte raise
     */

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setID(){
        ID = nexID;
        nexID++;
    }

    public int getID() {
        return ID;
    }

    public static int getNexID(){
        return nexID;
    }

    public String getDescription()
    {
        return String.format("an employ ee with a salary of $%.2f",salary);
    }
    public static void main(String[] args){
        Employee e = new Employee("lv",23333,1978,12,12);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}