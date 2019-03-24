package 第六章;

public class Employee  implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
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
}
