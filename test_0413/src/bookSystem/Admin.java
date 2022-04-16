package bookSystem;

import operation.*;

import java.util.Scanner;

public class Admin extends User{
//    private String name;
//    //管理员能支持的操作，看起来这是一个 接口数组，实际上知道接口不能实例化
//    //所以这个数组中放置的内容，就是实现了该接口的类的实例。
//    private IOperation[] operations;

    public Admin(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("======================================");
        System.out.println("Hello !" + name + "欢迎使用图书管理系统");
        System.out.println("1.查阅书籍信息");
        System.out.println("2.新增书籍信息");
        System.out.println("3.删除书籍信息");
        System.out.println("4.打印书籍列表");
        System.out.println("5.退出系统");
        System.out.println("======================================");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
