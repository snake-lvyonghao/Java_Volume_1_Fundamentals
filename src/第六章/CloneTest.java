package 第六章;

public class CloneTest {
    public static void main(String[] args){
        try {
            Employee original = new Employee("John Q.public",5000);
            original.setHireDay(2000,1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);
            System.out.println("orginal=" + original.tostring());
            System.out.println("copy=" + copy.tostring());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
