package Charpter5;
import java.lang.reflect.*;
import java.util.ArrayList;


public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    /**
     * @param obj 超类
     * @return 类的名字和域的名字和值
     */

    public String toString(Object obj){
        if(obj == null) return "null";
        if(visited.contains(obj)) return "...";
        visited.add(obj);
        Class c1 = obj.getClass();
        if(c1 == String.class) return (String)obj;
        if(c1.isArray())
        {
            String r = c1.getComponentType() + "[]{";
            for(int i = 0; i < Array.getLength(obj); i++){
                if(i > 0) r += ',';
                Object val = Array.get(obj,i);
                if(c1.getComponentType().isPrimitive()) r += val;
                else r += toString(val);
            }
            return r + "}";
        }

        String r = c1.getName();
        do {
            r += "[";
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);

            //get域的名字和值
            for (Field F : fields){
                if(!Modifier.isStatic(F.getModifiers())){
                    if(!r.endsWith("[")) r += ",";
                    r += F.getName() + "=";
                    try {
                        Class t = F.getType();
                        Object val = F.get(obj);
                        if(t.isPrimitive()) r += val;
                        else r += toString(val);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            c1 = c1.getSuperclass();
        }
        while (c1 != null);
        return r;
    }
}
