package operation;

import bookSystem.Book;
import bookSystem.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的书名：");
        String name = scanner.next();
        int i = 0;
        for (;i < bookList.getSize();i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("未找到书籍，无法借阅");
            return;
        }
        Book currentBook = bookList.getBooks(i);
        if (currentBook.isBorrowed()) {
            System.out.println("该书已被借出！");
        }
        bookList.getBooks(i).setBorrowed(true);
        System.out.println("成功借阅！");
    }
}
