package 第八章;

<<<<<<< HEAD
import org.jetbrains.annotations.Contract;

import java.time.LocalDate;



/**
 * @version 1.00 2019-4-1
 * @author snake_lvyonghao
 */

public class PairTest2 {
    public static void main(String[] args){
        LocalDate[] birthdays =
                {
                        LocalDate.of(1902,12,9),
                        LocalDate.of(1812,12,10),
                        LocalDate.of(1903,12,3),
                        LocalDate.of(1910,6,22),

                };
        Pair<LocalDate> mm = ArrayAlg2.minmax(birthdays);
        System.out.println("min=" + mm.getFirst());
        System.out.println("max=" + mm.getSecond());
    }
}

class ArrayAlg2{

    public static <T extends Comparable> Pair<T> minmax(T[] a)
    {
        if(a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
=======
import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args){
        LocalDate[] birthdays = {
                LocalDate.of(1904,12,9),
                LocalDate.of(1815,12,10),
                LocalDate.of(1903,12,3),
                LocalDate.of(1910,6,22),
        };
        String[] b = {
                "aaaaa",
                "bbbbb",
                "ccccc",
                "eeeeee"
        };
        Pair<String> nn = ArraryAlg.minmax(b);
        Pair<LocalDate> mm = ArraryAlg.minmax(birthdays);
        System.out.println(nn.getFirst());
        System.out.println(nn.getSecond());
    }
}
class ArraryAlg{
    /**
     *
     * @param a an array of objects of type T.
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for(int i = 1;i < a.length;i++){
>>>>>>> 更新第七章，第八章，第九章内容
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}