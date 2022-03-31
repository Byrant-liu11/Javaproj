public class Test {
    public static void main(String[] args) {
        //类和对象
        //面向对象程序设计的核心

        //创建 Cat 对象
        //这个操作也可以叫做“实例化”对象
        Cat cat = new Cat("小花");
//        cat.name = "mimi";
//        cat.age = 1;
//        cat.breed = "中华田园猫";
        System.out.println(cat.name);

//        Cat cat2 = new Cat();
//        cat2.name = "huahua";
//        cat2.age = 2;
//        cat2.breed = "玳瑁猫";

        cat.eat("猫粮");
//        cat2.eat("蚂蚱");

    }
}
