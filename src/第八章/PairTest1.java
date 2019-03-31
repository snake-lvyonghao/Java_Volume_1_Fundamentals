package 第八章;

/**
 * @version 1.00 2019-3-30
 * @author snake_lvyonghao
 */

public class PairTest1 {
    public static void main(String[] args){
        String[] words = {"Marry", "had", "z", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmaxn(words);
        System.out.println("min=" + mm.getFirst());
        System.out.println("max=" + mm.getSecond());
    }
}

/**
 * gets the min ande max of an array of strings
 * @param a an array of strings
 * @reuturn a pair with min and max value,,or null if a is null or empty
 */
class ArrayAlg
{
    public static Pair<String> minmaxn(String[] a){
        if(a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min.compareTo(a[i]) > 0)
                min = a[i];
            if(max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min,max);
    }
}
