package bag_0402;

//给这个类前面加上abstract此时这就是一个抽象类
//如果尝试创建抽象类的实例，就会编译报错
//abstract public class Shape {
//    //给方法牵头加上abstract此时这就是一个抽象方法了
//    //抽象方法不需要抽象体
//    //抽象方法只能在抽象类中存在（也可以在接口中存在），不能在普通的类中存在
//    //抽象方法存在的意义就是为了让子类进行重写
//    abstract public void draw();
//}
interface Shape{
    void draw();

}
