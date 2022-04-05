package bag_0405;

public class Test {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Animal animal = null;
//
//        //向上转型；
//        animal = cat;

        //将上面的代码合并
//        Animal animal = new Cat();
//        Animal animal1 = new Bird();

        //向上转型也可能出现在方法传参的过程中
        //方法传参，本质上也就是在进行“赋值”操作
//        func(new Cat());

        //向上转型也可能发生在方法返回的时候
//        Animal animal = func2();
        //name是父类的属性
//        System.out.println(animal.name);
        //gender是子类的属性，是无法访问到的
        //由于访问属性这件事，是编译过程中确定的，编译的时候编译器就会检查当前的属性
        //是否在类中存在
        //方法也是同理
        //System.out.println(animal.gender);

//        Animal animal = new Cat();
//        System.out.println(animal.getGender());;


        //这里体现多态
//        Shape shape1 = new Rect();
//        Shape shape2 = new Circle();
//        Shape shape3 = new Flower();
//
//        draw(shape1);
//        draw(shape2);
//        draw(shape3);

        Shape[] shapes = {
                new Rect(),
                new Circle(),
                new Flower(),
        };
        for (Shape shape: shapes) {
            draw(shape);
        }

    }

    public static void draw(Shape shape) {
        shape.draw();
    }

//    public static void func(Animal animal) {
//
//    }
//
//    public static Animal func2() {
//        return new Cat();
//    }
}
