package operation;

import bookSystem.Book;
import bookSystem.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还书籍");
        System.out.println("请输入要归还的书籍：");
        String name = scanner.next();
        int i = 0;
        for (;i < bookList.getSize();i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("未找到该书籍，无法归还");
            return;
        }
        Book currentBook = bookList.getBooks(i);
        if (!currentBook.isBorrowed()){
            System.out.println("该书未被借出，无法归还！");
            return;
        }
        currentBook.setBorrowed(false);
        System.out.println("归还书籍成功！");
        return;
    }
}
