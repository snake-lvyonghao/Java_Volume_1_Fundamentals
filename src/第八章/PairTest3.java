package 第八章;
import 第五章.Emplyoee;
import 第五章.Manager;

public class PairTest3 {
    public static void main(String[] args){
        Manager ceo = new Manager("Gus Greedy",800000,2003,12,15);
        Manager cfo = new Manager("Sid Sneaky",600000,2003,12,15);
        Pair<Manager> buddies = new Pair<>(ceo,cfo);
        printBuddies(buddies);

        ceo.setBonus(100000000);
        cfo.setBonus(5000000);
        Manager[] managers = {ceo,cfo};

        Pair<Emplyoee> result = new Pair<>();
        minmaxBonus(managers,result);
        System.out.println("first:" + result.getFirst().getName() + ",second:" +result.getSecond().getName());
        maxminBonus(managers,result);
        System.out.println("first:" + result.getFirst().getName() + ",second:" +result.getSecond().getName());
    }

    public static void printBuddies(Pair<? extends Emplyoee> p){
        Emplyoee first = p.getFirst();
        Emplyoee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    public static void minmaxBonus(Manager[] a,Pair<? super Manager> result)
    {
        if(a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min.getBonus() > a[i].getBonus()) min = a[i];
            if(max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void maxminBonus(Manager[] a,Pair<? super Manager> result)
    {
        minmaxBonus(a,result);
        PairAlg3.swapHelper(result);
    }
}

class PairAlg3
{
    public static boolean hasNulls(Pair<?> p)
    {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> T){

    }

    public static <T> void swapHelper(Pair<T> p){
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}