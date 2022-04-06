package bag_0402;

public class Test {
    public static void main(String[] args) {

//        Animal animal = new Cat();
//        //向下转型，将父类的引用转换成子类的引用
////        Cat cat = (Cat)animal;
//        //判断当前父类的引用是否指向该子类
//        if (animal instanceof Cat) {
//            Cat cat = (Cat)animal;
//        }

        //Shape本身虽然也有draw方法，此时draw方法没有实质性的内容
        //存在的目的只是为了让其他的子类进行重写
        //Shape本身也不需要去创建实例，shape存在的目的是为了创建Shape的子类
        //搭配多态来使用
        //像这种不需要去实例化（没有实例化必要的类）就可以把这个类作为一个“抽象类”
        //像这种本身没有方法体，只是为了被子类重写的方法，就可以把这个方法作为一个“抽象方法”

        Shape shape = new Circle();
        Shape shape1 = new Rect();
    }
}
