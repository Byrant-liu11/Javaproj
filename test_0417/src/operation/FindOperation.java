package operation;

import bookSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找书籍的名字：");
        String name = scanner.next();
        for (int i = 0;i < bookList.getSize();i++) {
            if (bookList.getBooks(i).getName().contains(name)) {
                System.out.println(bookList.getBooks(i));
            }
        }
    }
}
