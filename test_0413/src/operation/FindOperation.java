package operation;

import bookSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    //实现查找某个书籍的信息
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的书籍：");
        String name = scanner.next();
        //循环遍历书籍列表
        for (int i = 0; i < bookList.getSize();i++) {
            //此处不使用equals,而是使用contains
            if (bookList.getBook(i).getName().contains(name)) {
                System.out.println(bookList.getBook(i));
            }
        }
    }
}
