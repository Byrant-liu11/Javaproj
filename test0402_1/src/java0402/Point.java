package java0402;

public class Point {
    public int x = 0;
    public int y = 0;

    //这就是代码块
    //这个代码块也是在new的时候执行
    //但是和构造方法相比，这种方式，不能够传参。
    //用途比较少一些，往往可以使用就地初始化方式来代替
    {
        x = 10;
        y = 0;
    }

    public Point() {
        x = 100;
        y = 0;
    }

    public Point(int x) {
        //如果形参名字和成员变量相同
        //此时必须明确作出区分，否则编译器统一会把这个X当成形参
        //使用this这个关键字来表示当前对象本身的引用
        this.x = x;
    }

    public Point(int x,int y) {
        this(x);//调用自身构造方法
        this.y = y;
    }
}
