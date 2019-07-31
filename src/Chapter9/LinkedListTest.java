package Chapter9;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args){
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erical");
        Collections.sort(a);

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext())
        {
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();
        while(bIter.hasNext())
        {
            bIter.next();
            if(bIter.hasNext())
            {
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);

//        int count = 0;
//        List<String> setting = Collections.nCopies(100,"DEFFULL");
//        ListIterator listIterator = setting.listIterator();
//        while(listIterator.hasNext())
//        {
//            if(listIterator.hasNext())
//            {
//                System.out.println(listIterator.next());
//                System.out.println(count);
//                count++;
//            }
//        }
    }
}