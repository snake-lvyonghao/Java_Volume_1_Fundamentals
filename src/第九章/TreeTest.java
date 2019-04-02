package 第九章;

import java.util.*;

/**
 * This program sorts a set of item by comparing their descriptions
 * @version 1.00
 * @author snake_lvyonghao
 */

public class TreeTest {
    public static void main(String[] args)
    {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toster",1234));
        parts.add(new Item("Widdget",4562));
        parts.add(new Item("Modem",9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescription = new TreeSet<>(
                Comparator.comparing(Item::getDecription)
        );

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
