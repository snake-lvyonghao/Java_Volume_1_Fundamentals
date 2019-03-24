package 第四章;

public class Student extends person {
    private String major;

    public Student(String name,String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student majoring in " + major;
    }
}
