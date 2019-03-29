package 第七章;
import java.util.*;
import java.util.logging.Logger;

/**
 * @version 1.00 2019-3-30
 * @author snake_lvyonghao
 */
public class StackTrace {

    /**
     * Comeputes the factorial of a number
     * @param n a non-negative intger
     * @return n! = 1 * 2 * 3 * ...* n
     */
    public static int factorail(int n){
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frams = t.getStackTrace();
        for (StackTraceElement f :
                frams) {
            System.out.println(f);
        }
        int r;
        if (n <= 1){
            r = 1;
        }
        else
            r = n * factorail(n - 1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        factorail(n);

    }
}
