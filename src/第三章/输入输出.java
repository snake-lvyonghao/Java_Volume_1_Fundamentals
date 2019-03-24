package 第三章;
import java.io.Console;
import java.util.*;

public class 输入输出 {
    public static void main(String[] args){
//        //读取输出
//        Scanner in = new Scanner(System.in);
//
//        //get first input
//        System.out.println("What is your name?");
//        String name = in.nextLine();
//
//        //get second input
//        System.out.println("How old are you?");
//        int age = in.nextInt();

//        //display output on console
//        System.out.println("Helllo," + name + ". Next year,you'will be " + (age + 1));

        //Console读取密码
//        Console cons = System.console();
//        String username = cons.readLine();
//        char[] passwd = cons.readPassword("password: " );

//        //格式化输出
//        double x = 10000.0 / 3.0;
//        System.out.printf("%8.2f",x);
//
//        //格式化的字符串
//        String message = String.format("hello , %S.Next year ,you'will be %d",name ,age);
//        System.out.println(message);

        //日期与时间的格式化选项
        System.out.printf("%tc",new Date());
    }
}
