package Chapter4;

import java.util.Random;

public class ConstructorTest {
    public static void  main(String[] args){
        Employee3[] stuff = new Employee3[3];

        stuff[0] = new Employee3("Harry",5000);
        stuff[1] = new Employee3(60000);
        stuff[2] = new Employee3();

        for (Employee3 e : stuff){
            System.out.println("name = " + e.getName() + ",id =" + e.getID() + ",salary =" + e.getSalary());
        }
    }
}
class Employee3
{
    private static int nexID ;
    private int ID;
    private String name = "";
    private double salary;

    static {
        Random generator = new Random();
        nexID = generator.nextInt(100000);
    }


    {
        ID = nexID;
        nexID++;
    }

    public Employee3(String n,double s){
        name = n;
        salary = s;
    }

    public Employee3(double s){
        this("Employee3 #" + nexID,s);
    }

    public Employee3(){}

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }
}