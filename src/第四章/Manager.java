package 第四章;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name,double salary,int year,int mouth,int day)
    {
        super(name,salary,year,mouth,day);
        bonus = 0;
    }

    public double getSalary(){
        double basesalary = super.getSalary();
        return basesalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }
}
