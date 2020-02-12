/**
 * <h1>Patron</h1>
 * This class is used to create a patron for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
import java.util.*;

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

    public void setFirstName(String fname) {
        this.first_name = fname;
    }

    public void setLastName(String lname) {
        this.last_name = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return(this.id);
    }

    public String getFirstName() {
        return(this.first_name);
    }

    public String getLastName() {
        return(this.last_name);
    }

    public String getAddress() {
        return(this.address);
    }

    public String toString() {
        return("ID:      " + getID() + "\nFirst:   " + getFirstName() + "\nLast:    " + getLastName() + "\nAddress: " + getAddress() + "\n");
    }

    public void borrowBook(int isbn) {
        if(books_borrowed.size() < 3) {
            if(books_borrowed.contains(isbn)) {
                System.out.println("You already have this book borrowed.  Please select another book.");
            } else {
                books_borrowed.add(isbn);
            }
        } else {
            System.out.println("You already have three books checked out.  Please return one before checking out another.");
        }
    }

    public void returnBook(int isbn) {
        if(books_borrowed.contains(isbn)) {
            for(int i = 0; i < books_borrowed.size(); i++) {
                if((int)books_borrowed.get(i) == isbn) {
                    books_borrowed.remove(i);
                }
            }
        } else {
            System.out.println("You don't have this book checked out right now.");
        }
    }

    public ArrayList<Integer> booksBorrowed() {
        return(books_borrowed);
    }
}
