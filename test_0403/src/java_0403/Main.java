package java_0403;

public class Main {

    //内部类
    static class Test {
        public int num;
    }

    public void func() {
        Test test = new Test();
        test.num = 10;
    }

    public static void main(String[] args) {

        //成员内部类依赖于外部类的this.  在外部类的static中没有this，此时无法实例化
        //静态内部类不依赖外部类的this，可以随意创建
//        Test test = new Test();

        //此时创建了一个匿名内部类，这个类没有名字
        //这个类是A类的子类（继承自A类）
//        A a = new A() {
//            //定义属性和方法
//        };
//
//        //局部内部类，直接定义到一个方法内部
//        class Test2 {
//
//        }

//        Cat cat = new Cat("小花","公猫");
//        Cat cat2 = new Cat("小黄","公猫");
//        System.out.println(cat);

//        System.out.println(Cat.n);
//        Cat.n = 100;
//        System.out.println(Cat.n);

        //调用静态方法不需要创建实例
        //Cat.func();
        func2();
    }

    public static void func2() {
//        Test t = new Test();
//        System.out.println(t.num);
        B b = new B();
    }
}
