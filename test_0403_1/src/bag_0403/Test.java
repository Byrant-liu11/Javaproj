package bag_0403;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        char[] value = {'a','b'};
        String str = new String(value);

        String s = "abcd";
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        //字符串转字节
        s.getBytes();

        //tocharArray方法相当于是在内部创建了一个新的字符数组并返回
        //修改这个返回值不会影响到s本身的内容
//        char[] value2 = s.toCharArray();
//        String str = "hello";
//        //通过反射的方式修改“hello”的内容
//        //特殊手段，而不是常规手段
//
//        //1）获取到String的类对象
//        //2）根据value这个字段名字，在类对象中拿到对应的字段(仍然是图纸的一部分，相当于局部放大)
//        Field valueField = String.class.getDeclaredField("value");
//        //让value这个private的成员也能被访问到
//        valueField.setAccessible(true);
//        //3）根据图纸，将str这个对象给拆开，取出零件
//        char[] value = (char[])valueField.get(str);
//        //4）修改内容
//        value[4] = 'a';
//        System.out.println(str);




        //a是一个常量
//        final A a = new A();
        //此时编译会出错
//        a = new A();
        //此时a就是一个“可变对象”
//        a.num = 1000;
//        String str = "";
//        String a = new String("hello").intern();
//        System.out.println(a == "hello");

//        String a = "hello";
//        String b = "hello";
//        String a = new String("hello");
//        String b = new String("hello");
//        System.out.println(a == b);//比较的是里面存的地址
        //比较两字符串是否相等，需要使用.equals()
//        System.out.println(a.equals(b));
//        String a = null;
//        String a = new String();
        //不建议写成以下这样
        //一旦a为null，此时就会抛出空指针异常
//        if (a.equals("hello")) {
//
//        }

        //建议使用以下这种方式
        //如果a是null，不会抛异常，而是返回false
//        if ("hello".equals(a)) {
//            System.out.println("相等");
//        }else {
//            System.out.println("不相等");
//        }

    }
}
