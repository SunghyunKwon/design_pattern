import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        System.out.println("BookShelf size is " + bookShelf.getLength());
        System.out.println("BookShelf Max : " + bookShelf.getMaxsize());
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible")); 
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Exceed book 1"));
        bookShelf.appendBook(new Book("Exceed book 2"));
        System.out.println("BookShelf size is " + bookShelf.getLength());
        
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}