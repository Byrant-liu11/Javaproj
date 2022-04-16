package bookSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.先准备好书籍的数据
        BookList bookList = new BookList();
        //2.创建用户（涉及到登录过程）
        //写main方法（整合整体逻辑，不关注用户是啥）
        User user = login();
        //3.进入主循环
        while (true) {
            //此时user是父类的引用，调用的menu是哪个版本的方法？
            //就看user到底指向哪种子类的实例
            //这就是多态，在这个场景中，调用者根本无需关注user到底是啥类型~~
            int choice = user.menu();
            //有了用户输入的选择之后，需要根据选择项执行相应的操作
            user.doOperation(choice,bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的角色：1 管理员，0 普通用户");
        int who = scanner.nextInt();
        if (who == 1) {
            return new Admin(name);
        }

        return new NormalUser(name);
    }
}
