package operation;

import bookSystem.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除书籍");
        System.out.println("请输入要删除的书籍的名字：");
        String name = scanner.next();
        int i = 0;
        for (;i < bookList.getSize();i++) {
            if (name.equals(bookList.getBooks(i).getName())) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("您输入的书籍 [" + name + "] 在系统中没有找到，删除失败");
            return;
        }
        if (i == bookList.getSize() - 1) {
            bookList.setSize(bookList.getSize() - 1);
            System.out.println("删除成功！");
            return;
        }
        bookList.setBooks(i,bookList.getBooks(bookList.getSize() - 1));
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除成功！");
    }
}
