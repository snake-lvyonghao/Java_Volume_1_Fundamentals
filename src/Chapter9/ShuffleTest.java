package Chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1;i <= 49;i++)
        {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(11,33);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
