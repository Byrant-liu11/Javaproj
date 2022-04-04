package bag0404;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        String a = "aello";
//        String b = "bello";
        //compareTo，返回一个int值
        //a>b,返回一个>0的值
        //a<b,返回一个<0的值
        //a==b,返回0;
        //考虑大小写
//        int result = a.compareTo(b);
        //忽略大小写
//        int result = a.compareToIgnoreCase(b);
//        boolean result = a.equalsIgnoreCase(b);
//        System.out.println(result);

//        String a = "hello world world";
//        String b = "world";
//        System.out.println(a.contains(b));
//        int result = a.indexOf(b);
//        System.out.println(result);
//        result = a.indexOf(b,result+1);
//        System.out.println(result);

//        System.out.println(a.startsWith(b));
//        System.out.println(a.endsWith(b));
//        String result = a.replaceAll(b,"java");
//        System.out.println(result);
//        System.out.println(a);
//        String result = a.replaceFirst(b,"java");
//        System.out.println(result);
//        System.out.println(a);

//        String a = "hello world java";
//        String[] result = a.split(" ");
//        System.out.println(Arrays.toString(result));
        //正则表达式的坑
        //ip地址
//        String a = "192.168.0.1";
        //正则表达式里面有很多特殊符号代表特殊含义，'.'也是其中之一
        //为了解决这个问题，需要使用“正则表达式”中的转义字符
        //正则表达式见到一个'.'当成特殊符号来对待
        //正则表达式见到'\.'才是当成'.'本身来对待
        //Java的字符串将\当成Java的转义字符了，为了表示一个原始的\，需要再次转义
//        String[] result = a.split("\\.");
//        System.out.println(Arrays.toString(result));
//        String a = "hello world java";
//        System.out.println(a.substring(6,11));

//        String a = "";//空字符串
//        String b = null;//空引用

        //1.append 使用append能够把字符串内容进行追加，相当于String的+=
        //String的+=会产生新的String对象，如果在循环中使用，是比较低效的
//        String str = "hello";
//        for (int i = 0;i < 100;i++) {
//            str += i;
//        }
        StringBuilder stringBuilder = new StringBuilder("hello");
//        for (int i = 0;i < 100;i++) {
//            stringBuilder.append(i);
//        }
//        stringBuilder.reverse();
//        System.out.println(stringBuilder.toString());
//        stringBuilder.delete(2,4);
//        System.out.println(stringBuilder.toString());
//        stringBuilder.insert(2,"world");
//        System.out.println(stringBuilder.toString());

    }
}
