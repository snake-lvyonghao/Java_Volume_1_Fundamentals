package 第五章;

public class Manager extends Emplyoee {
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
