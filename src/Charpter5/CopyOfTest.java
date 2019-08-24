package Charpter5;
import java.lang.reflect.*;
import java.util.*;

public class CopyOfTest {
    public static void main(String[] args){
        int[] a = {1,2,3};
        a = (int[]) goodCopyOf(a,10);
        System.out.println(Arrays.toString(a));

        String[] b = {"tom","jim","harry"};
        b = (String[]) goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));

//        System.out.println("This following calll will generate an exception");
//        b = (String[]) badCopyOf(b,10);
    }

    public static Object[] badCopyOf(Object[] a,int newlength){
        Object[] newArray = new Object[newlength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newlength));
        return newArray;
    }

    public static Object goodCopyOf(Object a,int newlength){
        Class c1 = a.getClass();
        if(!c1.isArray()) return null;
        Class componentType = c1.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newlength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newlength));
        return newArray;
    }
}
