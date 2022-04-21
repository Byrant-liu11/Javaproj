package bag_0421;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        //1.创建ArrayList实例
        //ArrayList<String> arrayList = new ArrayList<>();
        //向上转型，多态操作，触发动态绑定
        List<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());


        //2.往ArrayList中添加一些元素
        //add一个参数的版本，是把元素添加到顺序表末尾（常用）
        arrayList.add("C");
        arrayList.add("Java");
        arrayList.add("python");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);//打印触发ArrayList重写的toString方法

        //add两个参数的版本，是把元素添加到指定的位置上
        arrayList.add(2,"javaScript");
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        //3.删除操作
//        arrayList.remove(2);
//        System.out.println(arrayList);//按位置删除

        arrayList.remove("javaScript");//按内容删除
        //remove操作每次从左至右，只删除一个元素
        //如果需要删除多个，需要搭配循环
        System.out.println(arrayList);

        //4.查找
        boolean ret = arrayList.contains("Java");
        System.out.println(ret);

        int index = arrayList.indexOf("Java");//查找该元素的位置
        System.out.println(index);

        //5.获取元素/修改元素
        String elem = arrayList.get(0);
        System.out.println("0号元素为：" + elem);
        arrayList.set(0,"PHP");
        System.out.println(arrayList);

        //6.遍历操作
        //a)通过下标进行遍历
        System.out.println("通过下标进行遍历");
        for (int i = 0;i < arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        //b)通过迭代器来进行遍历
        //先通过iterator方法获取到迭代器对象
        //再通过while循环进行遍历
        System.out.println("通过迭代器进行遍历");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
        }
        //c)直接使用for-each来遍历（本质上是基于迭代器的方式来实现的）
        System.out.println("通过for-each进行遍历");
        for (String e : arrayList) {
            System.out.println(e);
        }



//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.remove(2);
    }

}
