package operation;

import bookSystem.Book;
import bookSystem.BookList;

import java.util.Scanner;

//往BookList中新增一本书

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        //里面实现具体的新增操作
        System.out.println("增加书籍");
        //
        System.out.println("请输入新的书籍的名称：");
        String name = scanner.next();
        System.out.println("请输入新的书籍的作者：");
        String author = scanner.next();
        System.out.println("请输入新的书籍的价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入新的书籍的类型：");
        String type = scanner.next();
        Book newBook = new Book(name,author,price,type);
        //将新的书籍放到Book的末尾即可
        int curSize = bookList.getSize();
        bookList.setBook(curSize,newBook);
        bookList.setSize(curSize + 1);
        System.out.println("新增书籍成功！");
    }
}
