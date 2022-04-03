package java_0403;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Cat {
    public String name;
    public String gender;

    static {
        //加上static的代码块叫做“静态代码块”
        //静态代码块只在程序启动（更严谨的应该叫做在“类加载的时候”）的时候执行一次
        System.out.println("这是静态代码块");
    }

    {
        System.out.println("这是普通代码块");
    }

    public static int n = 10;

    public static void func() {
        System.out.println("这是一个static方法");
    }

    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;
//        eat("鱼");
    }

    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }

//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
//    }
    public String toString() {
        return this.name + "," + this.gender;
    }
}
