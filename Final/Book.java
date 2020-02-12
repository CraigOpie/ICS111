import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <h1>Book</h1>
 * This class is used to create a book for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 * @param isbn Specifies the books 10 digit ISBN (Global Variable).
 * @param author Specifies the books author - last, first MI - (Global Variable).
 * @param title Specifies the books title (Global Variable).
 */
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

    /**
     * <h2>Set ISBN</h2>
     * Sets the class' isbn variable.
     *
     * @param isbn Int input for class isbn variable.
     *
     */
    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    /**
     * <h2>Set Title</h2>
     * Sets the class' title variable.
     *
     * @param title String input for class title variable.
     *
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <h2>Set Author</h2>
     * Sets the class' author variable.
     *
     * @param author String input for class author variable.
     *
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <h2>Get ISBN</h2>
     * Get the class' isbn variable value.
     *
     * @return int Value from class' isbn variable.
     *
     */
    public int getISBN() {
        return(this.isbn);
    }

    /**
     * <h2>Get Title</h2>
     * Get the class' title variable value.
     *
     * @return String Value from class' title variable.
     *
     */
    public String getTitle() {
        return(this.title);
    }

    /**
     * <h2>Get Author</h2>
     * Get the class' author variable value.
     *
     * @return String Value from class' author variable.
     *
     */
    public String getAuthor() {
        return(this.author);
    }

    /**
     * <h2>Get Due Date</h2>
     * Get the class' due date variable value.
     *
     * @return String Value from class' due date variable.
     *
     */
    public String getDueDate() {
        DateTimeFormatter dt_format = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        return(this.due_date.format(dt_format));
    }

    /**
     * <h2>Get Available</h2>
     * Get the class' available variable value.
     *
     * @return Boolean Value from class' available variable.
     *
     */
    public boolean getAvailable() {
        return(this.available);
    }

    /**
     * <h2>Get Possession</h2>
     * Get the class' has possession variable value.
     *
     * @return Boolean Value from class' has possession variable.
     *
     */
    public int hasPossession() {
        return(this.has_possession);
    }

    /**
     * <h2>To String</h2>
     * Get the class' isbn, author, and title variable values.
     *
     * @return String Value from class' isbn, author, and title variables.
     *
     */
    public String toString() {
        return("ISBN:    " + getISBN() + "\nAuthor:  " + getAuthor() + "\nTitle:   " + getTitle() + "\n");
    }

    /**
     * <h2>Checkout Book</h2>
     * Checks if the book is available, sets the checkout and due dates, marks the book
     * as not available, and sets the id of the user in possession of the book.
     *
     * @param id Int value representing the patron checking out the book.
     * @return boolean value returns true if successfully checked out.
     *
     */
    public boolean checkOut(int id) {
        if (this.available) {
            this.checkout_date = LocalDate.now();
            this.due_date = (this.checkout_date.plusDays(7));
            this.available = false;
            this.has_possession = id;
            return(true);
        } else {
            return(false);
        }
    }

    /**
     * <h2>Checkin Book</h2>
     * Verifies this book is being used by the patron, marks the book as available and
     * sets the has possession value to an unused value.
     *
     * @param id Int value representing the patron returning the book.
     * @return boolean value returns true if successfully returned.
     *
     */
    public boolean checkIn(int id) {
        if(this.has_possession == id) {
            this.available = true;
            this.has_possession = 9999;
            return(true);
        } else {
            return(false);
        }
    }
}
