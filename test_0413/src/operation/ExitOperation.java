package operation;

import bookSystem.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //退出程序
        System.out.println("退出程序");
        //通过这里的exit方法就可以直接结束当前程序（结束了当前jvm对应的java进程）
        System.exit(0);
    }
}
