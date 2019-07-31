package Chapter9;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args)
    {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Toaster",9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescriptiom = new TreeSet<>(
            Comparator.comparing(Item::getDescription)
        );
        sortByDescriptiom.addAll(parts);
        System.out.println(sortByDescriptiom);
    }
}
