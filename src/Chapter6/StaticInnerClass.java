package Chapter6;

public class StaticInnerClass {
    public static void main(String[] args){
        double[] d = new double[20];
        for (int i = 0;i < d.length; i++){
            d[i] = 100 * Math.random();
        }
        ArratAlg.Pair P = ArratAlg.minmax(d);
        System.out.println("min=" + P.getFirst());
        System.out.println("min=" + P.getSecond());
    }
}

class ArratAlg
{
    public static class Pair
    {
        private double first;
        private double second;

        public Pair(double f,double s)
        {
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
    
    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v :
                values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min,max);
    }
}