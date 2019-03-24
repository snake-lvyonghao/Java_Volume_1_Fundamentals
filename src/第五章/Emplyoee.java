package 第五章;
import java.time.*;
import java.util.Objects;

public class Emplyoee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Emplyoee(String name,double salary,int year,int mouth,int day){
        this.name = name;
        this.salary = salary;
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

    public boolean equals(Object otherObject)
    {
        //快速测试类是否相同
        if(otherObject == this) return true;

        //判断otherObject是否为NULL
        if(otherObject == null) return false;

        //判断类，否则不能比较
        if(getClass() != otherObject.getClass()) return false;

        //创建一个类把OtherObject强制转换为Employee
        Emplyoee other = (Emplyoee) otherObject;

        //测试数据域是否相等
        return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
