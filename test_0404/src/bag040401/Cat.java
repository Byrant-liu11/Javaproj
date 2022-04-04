package bag040401;

public class Cat extends Animal{

    public Cat(String name) {
        //通过super关键字调用父类的构造方法（有一个String参数版本的构造方法）
        super(name);
    }

    public void  jump() {

        System.out.println(name + "正在跳");
    }
}
