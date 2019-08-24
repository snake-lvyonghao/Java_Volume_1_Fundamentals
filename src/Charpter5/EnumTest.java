package Charpter5;
import java.util.*;

public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size : (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbberviation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Good job -- you paid attention to the _.");
    }
}
enum Size
{
    SMALL("s"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String abberviation;

    private Size(String abbreviation){
        this.abberviation = abbreviation;
    }

    public String getAbberviation(){
        return abberviation;
    }
}
