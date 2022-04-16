package operation;

import bookSystem.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //显示书籍列表
        System.out.println("显示书籍");
        for (int i = 0;i < bookList.getSize();i++) {
            System.out.println(bookList.getBook(i));
        }
    }

}
