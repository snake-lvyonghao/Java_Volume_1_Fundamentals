package Chapter4;

public class PersonTest {
    public static void main(String[] args){
        person[] people = new person[2];

        people[0] = new Employee("Harry Hacker",5000,1989,10,1);
        people[1] = new Student("Maria Morris","Computer science");

        for(person p : people)
            System.out.println(p.getName() + p.getDescription());
    }
}
