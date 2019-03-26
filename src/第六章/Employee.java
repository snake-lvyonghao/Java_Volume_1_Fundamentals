package 第六章;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee  implements Comparable<Employee>,Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year,int mouth,int day){
        Date newHireDay = new GregorianCalendar(year,mouth - 1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employee by salary
     * @param other another Employee object
     * @return a negative lower salary than other,0 if the salaries are the same,a positive value others
     */
    public int compareTo(Employee other){
        return Double.compare(salary,other.salary);
    }

    public String tostring(){
        return "Employee[name=" + name + ",salary=" + salary + ",hirday=" + hireDay + "]";
    }
}
