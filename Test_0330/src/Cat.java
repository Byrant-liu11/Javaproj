public class Cat {
    //属性/成员变量
    public String name;
    public int age;
    public String breed;

    //构造方法
    //构造方法也支持重载
    public Cat() {
        name = "小黄";
        age = 0;
        breed = "中华田园猫";
        System.out.println("调用无参数的Cat的构造方法");
    }
    public Cat(String n) {
        name = n;
        age = 0;
        breed = "中华田园猫";
        System.out.println("调用有一个参数的Cat的构造方法");
    }

    //方法/成员函数
    public void eat (String food) {
        System.out.println(name + "正在吃" + food);
    }
    public void run () {
        System.out.println(name + "正在跑");
    }
//    public static int data;
//    public static void func() {
//
//    }
}
