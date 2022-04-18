package operation;

import bookSystem.Book;
import bookSystem.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("增加书籍：");
        System.out.println("请输入新的书籍的名称：");
        String name = scanner.next();
        System.out.println("请输入新的书籍的作者：");
        String author = scanner.next();
        System.out.println("请输入新的书籍的价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入新的书籍的类型：");
        String type = scanner.next();
        Book newBook = new Book(name,author,price,type);
        int curSize = bookList.getSize();
        bookList.setBooks(curSize,newBook);
        bookList.setSize(curSize + 1);
        System.out.println("新的书籍增加成功！");
    }
}
