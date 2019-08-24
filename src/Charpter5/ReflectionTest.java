package Charpter5;
import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String[] args){
        String name;
        if(args.length > 0) name = args[0];
        else{
            Scanner in =  new Scanner(System.in);
            System.out.println("Enter class name(e.g java.util.Date): ");
            name = in.next();
        }

        try
        {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println("class " + name);
            if(superc1 != null && superc1 != Objects.class)
                System.out.println("extends " + superc1.getName());
            System.out.println("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printFields(c1);
            System.out.println();
            System.out.println("}");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * 输出所有类的构造器信息
     * @param c1 a class
     */
    public static void printConstructors(Class c1){
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0)  System.out.print(modifiers + " ");
            System.out.println(name + "(");

            //输出参数类型
            Class[] paramTypes = c.getParameterTypes();
            for(int j = 0;j < paramTypes.length; j++){
                if(j > 0) System.out.print(",");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 输出所有的所有的类方法
     * @param c1 a class
     */
    public static void printMethods(Class c1){
        Method[] methods = c1.getDeclaredMethods();
        for(Method m : methods){
            Class reType = m.getReturnType();
            String name = m.getName();

            System.out.println("    ");

            //输出modifiers，返回类型和方法名称
            String modifers = Modifier.toString(m.getModifiers());
            if(modifers.length() > 0) System.out.println(modifers + " ");
            System.out.println(reType.getName() + " " + name + "(");

            //输出参数类型
            Class[] parameterTypes = m.getParameterTypes();
            for(int j = 0;j < parameterTypes.length; j++){
                if(j > 0) System.out.println("  ");
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 输出所有类的域
     * @param c1 a class
     */
    public static void printFields(Class c1){
        Field[] fields = c1.getDeclaredFields();

        for(Field f : fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
