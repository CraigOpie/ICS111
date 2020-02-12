/**
 * <h1>Author</h1>
 * This class is used to create a patron for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
import java.util.*;

class Author {
    private String name;
    private BookList<Book> books = BookList<Book>();
    public Author() {
    }
    public boolean equals(Object node) {
        return name.equals(((Author) node).name);
    }
    public void display() {
        System.out.println(name);
        books.display();
    }
}
