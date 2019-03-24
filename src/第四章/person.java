package 第四章;

public abstract class person {
    private String name;

    public abstract String getDescription();

    public person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
