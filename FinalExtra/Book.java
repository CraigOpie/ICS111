/**
 * <h1>Book</h1>
 * This class is used to create a book for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Book implements BookInterface {
    private int isbn;
    private String title;
    private String author;
    private LocalDate checkout_date = LocalDate.now();
    private LocalDate due_date = (this.checkout_date.plusDays(7));
    private boolean available = true;
    private int has_possession = 9999;

    public Book(int isbn, String author, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return(this.isbn);
    }

    public String getTitle() {
        return(this.title);
    }

    public String getAuthor() {
        return(this.author);
    }

    public String getDueDate() {
        DateTimeFormatter dt_format = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        return(this.due_date.format(dt_format));
    }

    public String toString() {
        return("ISBN:   " + getISBN() + "\nAuthor: " + getAuthor() + "\nTitle:  " + getTitle() + "\n");
    }

    public void checkOut(int id) {
        if (this.available) {
            this.checkout_date = LocalDate.now();
            this.due_date = (this.checkout_date.plusDays(7));
            this.available = false;
            this.has_possession = id;
        } else {
            System.out.println("Sorry, this book is unavailable right now.  Please check again after " + this.getDueDate());
        }
    }

    public void checkIn() {
        this.available = true;
        this.has_possession = 9999;
    }

    public ArrayList<String> save() {
        ArrayList<String> bookDetails = new ArrayList<String>();
        bookDetails.add(isbn, title, author, checkout_date, due_date, available, has_possession);
        return(bookDetails);
    }
}
