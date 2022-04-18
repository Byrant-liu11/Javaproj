package bookSystem;

public class BookList {
    private Book[] books = new Book[100];
    private int size = 0;
    public BookList(){
        books[0] = new Book("三国演义","罗贯中",100,"古典小说");
        books[1] = new Book("西游记","吴承恩",100,"古典小说");
        books[2] = new Book("金瓶梅","兰陵笑笑生",100,"古典小说");
        size = 3;
    }

    public Book getBooks(int index) {
        return books[index];
    }

    public void setBooks(int index,Book book) {
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
