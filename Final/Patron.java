import java.util.ArrayList;

/**
 * <h1>Patron</h1>
 * This class is used to create a patron for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 * @param id Specifies the patron id to use (Global Variable).
 * @param fname Specifies the patron first name to use (Global Variable).
 * @param lname Specifies the patron last name to use (Global Variable).
 * @param address Specifies the patron address to use (Global Variable).
 *
 */
class Patron {
    private int id;
    private String first_name;
    private String last_name;
    private String address;
    private ArrayList<Integer> books_borrowed = new ArrayList<Integer>();

    public Patron(int id, String fname, String lname, String address) {
        this.id = id;
        this.first_name = fname;
        this.last_name = lname;
        this.address = address;
    }

    /**
     * <h2>Set First Name</h2>
     * Sets the class' first name variable.
     *
     * @param fname String input for class first name variable.
     *
     */
    public void setFirstName(String fname) {
        this.first_name = fname;
    }

    /**
     * <h2>Set Last Name</h2>
     * Sets the class' last name variable.
     *
     * @param lname String input for class last name variable.
     *
     */
    public void setLastName(String lname) {
        this.last_name = lname;
    }

    /**
     * <h2>Set Address</h2>
     * Sets the class' address variable.
     *
     * @param address String input for class address variable.
     *
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <h2>Get ID</h2>
     * Get the class' id variable value.
     *
     * @return int Value from class' id variable.
     *
     */
    public int getID() {
        return(this.id);
    }

    /**
     * <h2>Get First Name</h2>
     * Get the class' first name variable value.
     *
     * @return String Value from class' first name variable.
     *
     */
    public String getFirstName() {
        return(this.first_name);
    }

    /**
     * <h2>Get Last Name</h2>
     * Get the class' last name variable value.
     *
     * @return String Value from class' last name variable.
     *
     */
    public String getLastName() {
        return(this.last_name);
    }

    /**
     * <h2>Get Address</h2>
     * Get the class' address variable value.
     *
     * @return String Value from class' address variable.
     *
     */
    public String getAddress() {
        return(this.address);
    }

    /**
     * <h2>To String</h2>
     * Get the class' id, first name, last name, and address variable values.
     *
     * @return String Value from class' id, first name, last name, and address variables.
     *
     */
    public String toString() {
        return("ID:      " + getID() + "\nFirst:   " + getFirstName() + "\nLast:    " + getLastName() + "\nAddress: " + getAddress() + "\n");
    }

    /**
     * <h2>Borrow Book</h2>
     * Marks the book as being borrowed and adds the book to the patron's list of books borrowed.
     *
     * @param isbn Int value representing the books 10 digit ISBN.
     * @return boolean value returns true if successfully borrowed.
     *
     */
    public boolean borrowBook(int isbn) {
        if(books_borrowed.size() < 3) {
            if(books_borrowed.contains(isbn)) {
                System.out.println("You already have this book borrowed.  Please select another book.");
                return(false);
            } else {
                books_borrowed.add(isbn);
                return(true);
            }
        } else {
            System.out.println("You already have three books checked out.  Please return one before checking out another.");
            return(false);
        }
    }

    /**
     * <h2>Return Book</h2>
     * Removes the book from the patrons' list of borrowed books.
     *
     * @param isbn Int value representing the books 10 digit ISBN.
     * @return boolean value returns true if successfully returned.
     *
     */
    public boolean returnBook(int isbn) {
        if(books_borrowed.contains(isbn)) {
            for(int i = 0; i < books_borrowed.size(); i++) {
                if((int)books_borrowed.get(i) == isbn) {
                    books_borrowed.remove(i);
                    return(true);
                } else {
                    return(false);
                }
            }
            return(false);
        } else {
            return(false);
        }
    }

    /**
     * <h2>Borrow Book</h2>
     * Marks the book as being borrowed and adds the book to the patron's list of books borrowed.
     *
     * @return ArrayList value returns the array list containing all books borrowed for use.
     *
     */
    public ArrayList<Integer> booksBorrowed() {
        return(books_borrowed);
    }
}
