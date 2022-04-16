package bookSystem;

import operation.IOperation;

//User这个类用来作为Admin和NormalUser的父类
//存放两种角色的公共信息
//User类不应该被实例化，角色实际就只有管理员和普通用户两种
//于是就做成抽象类，防止后面不小心对User进行实例化
abstract class User {
    protected String name;
    protected IOperation[] operations;

    //这个方法用来打印该用户的菜单
    //不同的用户支持的操作不一样，菜单内容也不一样
    //此处就做成抽象方法，再由该类的子类来重写这样的方法
    public abstract int menu();

    public void doOperation(int choice,BookList bookList) {
        this.operations[choice-1].work(bookList);
    }
}
