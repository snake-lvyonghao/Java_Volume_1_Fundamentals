package 第四章;

public class ParamTest {
    public static void main(String[] args){
        //Test 1
        System.out.println("Testing numeric parameters");
        double percent = 10;
        System.out.println("Before: parcent=" + percent);
        tripValue(percent);
        System.out.println("After: parcent=" + percent);

        //Test 2
        System.out.println("\nTesting tirpsalary");
        Employee2 harry =  new Employee2("Harry",1000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripSarlary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        //Test 3
        System.out.println("\nTesting swap");
        Employee2 a = new Employee2("Alice",7000);
        Employee2 b = new Employee2("Bob",6000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a,b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

    }
    public static void tripValue(double x){
        x = 3 * x;
        System.out.println("End of  nethod: x=" + x);
    }

    public static void tripSarlary(Employee2 x)
    {
        x.raisesalary(200);
        System.out.println("End of method salary=" + x.getSalary());
    }

    public static void swap(Employee2 x,Employee2 y)
    {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method x=" + x.getName());
        System.out.println("End of method y=" + y.getName());
    }
}

class Employee2
{
    private String name;
    private double salary;

    public Employee2(String n,double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raisesalary(double byPercent){
        double raiser = salary * byPercent / 100;
        salary += raiser;
    }
}