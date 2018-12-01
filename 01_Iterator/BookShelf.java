import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int MAXSIZE;
    public BookShelf(int maxsize) {
        this.books = new ArrayList<Book>(maxsize);
        this.MAXSIZE = maxsize;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public int getMaxsize() {
        return MAXSIZE;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}