package 第九章;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PirorityQueueTest {
    public static void main(String[] args)
    {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906,12,9));
        pq.add(LocalDate.of(1815,12,9));
        pq.add(LocalDate.of(1903,12,9));
        pq.add(LocalDate.of(1910,12,9));

        System.out.println("Iterating over elements...");
        for (LocalDate date : pq)
        {
            System.out.println(date);
        }
        System.out.println("Removing elements...");
        while(!pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
    }
}
