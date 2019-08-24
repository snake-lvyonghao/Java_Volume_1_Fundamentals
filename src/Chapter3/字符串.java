package Chapter3;

public class 字符串 {
    public static void main(String[] args){
        //3.6 字符串
        //子串
        String e = "";
        String greeting = "Hello";
        String s = greeting.substring(0,3);
        System.out.println(s);
        int age = 13;

        //拼接
        String rating = "PG" + age;
        System.out.println(rating);
        String all = String.join("P","S","M","L","XL");
        System.out.println(all);

        //String不可变字符串
        greeting = greeting.substring(0,3) + "p!";
        if("hello".equals("hell")){
            System.out.println("Helloword");
        }

        //空串与Null串
        String str = "";
        if(str.length() == 0){
            System.out.println("str length is 0");
        }

        //检测字符串是否相等
        if(str.equals("")){
            System.out.println("str lenght is 0");
        }
        int n = greeting.codePointCount(0,greeting.length());
        System.out.println(n);

        //构建字符串
        String ch = "Fuck yf";
        //由较短的字符串构建字符串
        StringBuilder builder = new StringBuilder();          //构建一个空的字符串构建器
        builder.append(ch);                                  //每次添加内容调用append方法
        String completedString =  "abc" + builder.toString();         //在需要构建字符串时就调用toString方法
        System.out.printf(completedString);
    }
}
