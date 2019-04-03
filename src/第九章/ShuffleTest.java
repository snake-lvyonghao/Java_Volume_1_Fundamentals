package 第九章;
import java.util.*;

/**
 * This program demonstrates the random shuffle and sort algorithms
 * @version 1.00
 * @author snake_lvyonghao
 */

public class ShuffleTest {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1;i <= 49; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0,6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
