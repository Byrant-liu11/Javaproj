package bag_0409;

//泛型版本，实现刚才的数组封装类
//类名后面就需要加上<E>泛型参数.<>表示当前这个类是个泛型类
//E相当于是一个形参，E表示某一种具体的类型，会在实例化的时候确定E具体是哪种类型

import java.util.Objects;

public class MyArray2<E extends Animal> {
    //创建的数组，类型就不是object，而是直接使用E作为类型
    //后续在实例化这个MyArray2时，确定了E代表啥类型，也就知道data最后的类型了
    private E[] data = null;
    private int size = 0;
    private int capacity = 10;

    public MyArray2() {
        //由于E这样的类型还不确定，无法直接创建E类型的实例
        data = (E[]) new Object[capacity];
    }

    public void add(E data) {
        if (size >= capacity) {
            return;
        }
        this.data[size++] = data;
    }

    public E get(int index) {
        return this.data[index];
    }


    public static void main(String[] args) {
        //后面的<String>尖括号中的内容可以省略
        //因为前后泛型的参数必须要一致
        //MyArray2<String> myArray2 = new MyArray2<String>();
//        MyArray2<String> myArray2 = new MyArray2<>();
//        myArray2.add("hello");
//        myArray2.add("world");
//        //此时进行元素获取的时候，就不需要进行类型转换了
//        String str = myArray2.get(0);
//
//        MyArray2<Integer> myArray21 = new MyArray2<>();
//        myArray21.add(10);
//        myArray21.add(10);
//        Integer ret = myArray21.get(0);

        MyArray2<Animal> myArray2 = new MyArray2<>();
        MyArray2<Cat> myArray21 = new MyArray2<>();
    }

}
