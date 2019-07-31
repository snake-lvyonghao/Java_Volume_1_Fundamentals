package Chapter9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args)throws Exception{
        String a = new String("a");
        String b = new String("b");
        String c = new String("c");
        Map<String,String> weakmap = new HashMap();
        weakmap.put(c,"ccc");
        weakmap.put(a,"aaa");
        weakmap.put(b,"bbb");

        System.gc();

//        Iterator j = weakmap.entrySet().iterator();
//        while(j.hasNext())
//        {
//            Map.Entry en = (Map.Entry) j.next();
//            System.out.println("weakmap:" + en.getKey() + ":" + en.getValue());
//        }

        for(HashMap.Entry<String,String> entry : weakmap.entrySet())
        {
            String k = entry.getKey();
            String v= entry.getValue();
            System.out.println("K:" + k + " ,v:" + v);
        }
    }
}
