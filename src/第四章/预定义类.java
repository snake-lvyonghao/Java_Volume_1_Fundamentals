package 第四章;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class 预定义类 {
    public static void main(String[] args){
        System.out.println(new Date());

        //返回日期的字符串描述
        String s = new Date().toString();
        System.out.println(s);

        //定义对象变量，但不引用对象，不能使用任何类的方法
//        Date deadline;
//        s = deadline.toString();    //not yet

        //初始化对象或者引用一个已存在的对象
        Date deadline;
        deadline = new Date();      //表达式new Date()构造了一个Date类型的对象，并它的值是对新创建对象的引用，这个引用存储在deadline中
        Date birthday = new Date();
        deadline = birthday;

        //可以显示的将队相比那辆设置为null，表明这个对象变量目前没有引用任何对象
        deadline = null;
        if(deadline == null){
            System.out.println(deadline);
        }

        //若方法应用于一个值为null的对象上，报错
//        birthday = null;
//        s = birthday.toString();     //runtime error!

        //LocalDate 更改其方法，访问器方法
        LocalDate newYearsEve = LocalDate.of(1999,06,25);
        LocalDate  aThousanDatsLater = newYearsEve.plusDays(1000);          //plusDays方法没有更改调用这个方法的对象
        int year = aThousanDatsLater.getYear();
        int mouth = aThousanDatsLater.getMonthValue();
        int day = aThousanDatsLater.getDayOfMonth();
        System.out.println(year + " " + mouth + " "+ day + "\n");
        //只访问对象而不修改对象方法有时称为访问器方法

    }
}
