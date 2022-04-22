package bag_0422;

class MyArrayListIndexOutOfRangeException extends RuntimeException {
    public MyArrayListIndexOutOfRangeException(String message) {
        super(message);
    }
}
//为了代码简单，就不写泛型版本了，直接认为ArrayList中存的是若干的String
public class MyArrayList {
    //属性
    String[] data = null;
    //当前顺序表中的有效元素个数
    int size = 0;
    //当前顺序表中的最大容纳元素个数，如果size超过了capacity,就需要扩容
    int capacity = 100;

    //方法，增删改查

    public MyArrayList() {
        data = new String[capacity];
    }
    //实现扩容
    private void realloc() {
        //先把capacity变大,具体变大的公式，可以随意来确定
        capacity = 2 * capacity;
        String[] newData = new String[capacity];
        //把旧的数组中的数据拷贝到新数组中
        for (int i = 0;i < data.length;i++) {
            newData[i] = data[i];
        }
        // 把新的大的数组赋值给原有的属性data，同时就会释放掉旧的数组（GC）
        data = newData;
    }

    //1.把元素尾插到顺序表末尾
    public void add (String elem) {
        if (size >= capacity) {
            //需要先扩容
            realloc();
        }
        //就直接把新的元素放到下标为size的位置上即可
        data[size] = elem;
        size++;
    }
    //2.把元素插入到任意中间位置
    public void add (int index,String elem) {
        //如果index == size,相当于把新元素插入到末尾
        if (index < 0 || index > size) {
            return;
        }
        if (size >= capacity) {
            realloc();
        }
        //把elem放到index位置上，不能覆盖掉已有的元素
        //把index位置的元素，依次往后搬运，给index位置腾出一个空闲空间，来放置elem
        for (int i = size - 1;i >= index;i--) {
            data[i+1] = data[i];
        }
        //搬运完毕，把新的元素放在index位置上
        data[index] = elem;
        size++;
    }


    //3.按照下标位置删除元素
    public String remove(int index) {
        //仍然是需要进行搬运，把index位置的元素覆盖掉即可
        if (index < 0 || index >= size) {
            return null;
        }
        String result = data[index];
        for (int i = index;i < size - 1;i++) {
            data[i] = data[i + 1];
        }
        size--;
        return result;
    }

    //4.按照元素的值来删除元素,这个方法返回成功失败
    public boolean remove(String elem) {
        //先找到元素所在的位置
        int index = 0;
        for (;index < size;index++) {
            if (data[index].equals(elem)) {
                break;
            }
        }
        if (index >= size) {
            //没找到匹配的元素，删除失败
            return false;
        }
        //找到匹配元素，从index位置开始进行搬运
        for (int i = index;i < size - 1;i++) {
            data[i] = data[i+1];
        }
        size--;
        return true;
    }

    //5.根据下标获取元素
    public String get(int index) {
        if (index < 0 || index >= size) {
            //此处可以返回null,也可以抛出一个异常
            //return null;
            throw new MyArrayListIndexOutOfRangeException("下标越界了！index：" + index);
        }
        return data[index];
    }

    //6.根据下标修改元素
    public void set(int index,String elem) throws MyArrayListIndexOutOfRangeException {
        if (index < 0 || index >= size) {
            //此处可以返回null,也可以抛出一个异常
            //return null;
            throw new MyArrayListIndexOutOfRangeException("下标越界了！index：" + index);
        }
        data[index] = elem;
    }

    //7.判断元素是否存在
    public boolean contains(String elem) {
        //此处不太方便用for each
        //for each 是遍历了整个data的所有元素
        //实际上只需要遍历其中的前size个元素即可
        for (int i = 0;i < size;i++) {
            if (data[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

    //8.查找元素位置
    public int indexof(String elem) {
        for (int i = 0;i < size;i++) {
            if (data[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    //9.查找元素位置(从后往前找)
    public int lastIndexOf(String elem) {
        for (int i = size - 1;i >= 0;i--) {
            if (data[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0;i < size;i++) {
            stringBuilder.append(data[i]);
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static void testAdd() {
        MyArrayList myArrayList = new MyArrayList();
        //1.验证尾插
        myArrayList.add("C");
        myArrayList.add("Java");
        myArrayList.add("Python");
        System.out.println(myArrayList);
        //2.验证中间位置插入
        myArrayList.add(1,"javaScript");
        System.out.println(myArrayList);
    }

    private static void testRemove() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("C");
        myArrayList.add("Java");
        myArrayList.add("Python");
        myArrayList.remove(1);
        System.out.println(myArrayList);
        myArrayList.remove("Python");
        System.out.println(myArrayList);
    }
    private static void testGetAndSet() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("C");
        myArrayList.add("Java");
        myArrayList.add("Python");
        try {
            System.out.println(myArrayList.get(1));
        } catch (MyArrayListIndexOutOfRangeException e) {
            e.printStackTrace();
        }
        myArrayList.set(1,"Go");
        System.out.println(myArrayList);
        myArrayList.get(100);
    }

    private static void testContainsAndIndexOf() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("C");
        myArrayList.add("Java");
        myArrayList.add("Python");
        System.out.println(myArrayList.contains("C"));
        System.out.println(myArrayList.indexof("Python"));
        System.out.println(myArrayList.lastIndexOf("C"));
    }

    private static void testSizeEmptyClear() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("C");
        myArrayList.add("Java");
        myArrayList.add("Python");
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
        myArrayList.clear();
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
    }

    public static void main(String[] args) {
        testSizeEmptyClear();
    }
}
