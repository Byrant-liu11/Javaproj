package bookSystem;

//通过这个类把多个Book对象给组织起来
public class BookList {
    //100相当于BookList的capacity
    //capacity表示最大容量
    //size表示当前个数
    private Book[] books = new Book[100];
    private int size = 0;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",100,"古典小说");
        books[1] = new Book("西游记","吴承恩",100,"古典小说");
        books[2] = new Book("金瓶梅","兰陵笑笑生",100,"古典小说");
        size = 3;
    }

    //后面需要针对其中某一本书进行操作
    public Book getBook(int index) {
        return books[index];
    }

    public void setBook(int index,Book book) {
        books[index] = book;
    }

    //Java中的getter和setter是两种常规方法，用于检索和更新变量的值
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
