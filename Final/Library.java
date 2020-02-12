import java.util.Scanner;
import java.util.ArrayList;

/**
 * <h1>Library</h1>
 * <h2>Main Class</h2>
 * This class is used to create a library for a simple library checkout system.
 * Library.java requires Patron.class, Book.class, and BookInterface.class to
 * properly compile and execute.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
public class Library {
    // Create global variables
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Patron> patrons = new ArrayList<Patron>();
    static ArrayList<Book> books = new ArrayList<Book>();

    /**
     * This is the main method which makes use of project files.
     *
     */
    public static void main(String[] args) {
        // Load setup objects
        Setup setupObjects = new Setup();

        patrons.addAll(setupObjects.getSetupPatrons());
        books.addAll(setupObjects.getSetupBooks());

        // Inform the user about the program.
        System.out.println("This program is used to manage a library of books.");
        System.out.println();

        // Create int variable for storing the users menu choice
        int choice = 0;

        // Repeat the main menu cycle until the user chooses to exit the program
        while (choice != 10) {
            choice = menu();
            switch (choice) {
                case 1:  addPatron();
                         choice = 0;
                         break;
                case 2:  addBook();
                         choice = 0;
                         break;
                case 3:  editPatron();
                         choice = 0;
                         break;
                case 4:  editBook();
                         choice = 0;
                         break;
                case 5:  showPatrons();
                         choice = 0;
                         break;
                case 6:  showBooks();
                         choice = 0;
                         break;
                case 7:  checkOutBook();
                         choice = 0;
                         break;
                case 8:  checkInBook();
                         choice = 0;
                         break;
                case 9:  booksOut();
                         choice = 0;
                         break;
                case 10: System.out.println();
                         break;
                default: choice = 0;
            }
        }
    }

    /**
     * <h2>Menu</h2>
     * This method uses a switch statement to display a menu for the user to interface with.
     *
     * @return int This returns the valid menu choice from the user.
     *
     */
    static int menu() {
        // Continue to loop unless a valid input is choosen
        while (true) {
            System.out.println("Please select from the following options:");
            System.out.println("1. Add new patron");
            System.out.println("2. Add new book");
            System.out.println("3. Edit patron");
            System.out.println("4. Edit book");
            System.out.println("5. Display all patrons");
            System.out.println("6. Display all books");
            System.out.println("7. Check out book");
            System.out.println("8. Check in book");
            System.out.println("9. Display all books checked out");
            System.out.println("10.Exit");
            System.out.print("Choice: ");

            int condition = scan.nextInt();
            scan.nextLine();
            System.out.println();
            switch (condition) {
                case 1:  return(1);  // Add new patron
                case 2:  return(2);  // Add new book
                case 3:  return(3);  // Edit patron
                case 4:  return(4);  // Edit book
                case 5:  return(5);  // Display all patrons
                case 6:  return(6);  // Display all books
                case 7:  return(7);  // Check out book
                case 8:  return(8);  // Check in book
                case 9:  return(9);  // Display all books checked out
                case 10:  return(10);// Exit the program
                default: System.out.println("Sorry, invalid choice.");
                         System.out.println();
            }
        }
    }

    /**
     * <h2>Add Patron</h2>
     * This method is used to collect a name and address for adding a new patron to the
     * library.  The method then adds the patron to an array list for use.
     *
     */
    static void addPatron() {
        System.out.print("Please enter the patron's first name: ");
        String fname = scan.nextLine();

        System.out.print("Please enter the patron's last name: ");
        String lname = scan.nextLine();

        System.out.print("Please enter the patron's address: ");
        String address = scan.nextLine();
        System.out.println();

        patrons.add(new Patron(patrons.size(), fname, lname, address));
    }

    /**
     * <h2>Add Book</h2>
     * This method is used to collect a book's 10 digit ISBN, author's name, and title.
     * The method then adds the book to an array list for use.
     *
     */
    static void addBook() {
        System.out.print("Please enter the book's 10 digit ISBN: ");
        int isbn = scan.nextInt();
        scan.nextLine();

        System.out.print("Please enter the book's author's name (Last, First MI): ");
        String author = scan.nextLine();

        System.out.print("Please enter the book's title: ");
        String title = scan.nextLine();
        System.out.println();

        books.add(new Book(isbn, author, title));
    }

    /**
     * <h2>Edit Patron</h2>
     * This method is used to collect a patron's id and scan the database to find the patron.
     * If the patron is found, the patron's information will be displayed for the user to see
     * and the user will be able to enter the patrons new first name, last name, and/or address.
     * If the patron is now found, then the user will be informed that the user id was invalid.
     */
    static void editPatron() {
        boolean found = false;

        System.out.print("Please enter patron's ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < patrons.size(); i++) {
            if(patrons.get(i).getID() == id) {
                found = true;
                System.out.print("Please enter patron's first name: ");
                if(scan.findInLine("(?=\\S)") != null) {
                    patrons.get(i).setFirstName(scan.nextLine());
                } else {
                    System.out.println("Value did not change.");
                    scan.nextLine();
                }

                System.out.print("Please enter patron's last name: ");
                if(scan.findInLine("(?=\\S)") != null) {
                    patrons.get(i).setLastName(scan.nextLine());
                } else {
                    System.out.println("Value did not change.");
                    scan.nextLine();
                }

                System.out.print("Please enter patron's address: ");
                if(scan.findInLine("(?=\\S)") != null) {
                    patrons.get(i).setAddress(scan.nextLine());
                } else {
                    System.out.println("Value did not change.");
                    scan.nextLine();
                }
            }
            if(found == false) System.out.println("Invalid ID.  Please try again.");
        }
    }

    /**
     * <h2>Edit Book</h2>
     * This method allows the user to search for a book by 10 digit ISBN, author, or title and
     * edit the remaining information about the book. Once the book is found, all of the books
     * information will be displayed for the user.  If the book is not found then the user will
     * be informed that the application was not able to find the information.
     */
    static void editBook() {
        String keyword = "";
        int keyID = 0;

        System.out.print("Search by: \n1 - ISBN \n2 - Author \n3 - Title \n\nEnter search method: ");
        int method = scan.nextInt();
        scan.nextLine();
        switch (method) {
            case 1:  System.out.print("Please enter the book's 10 digit ISBN: ");    // Search by ISBN
                     keyword = scan.nextLine();
                     keyID = Integer.parseInt(keyword);
                     break;
            case 2:  System.out.print("Please enter the book's author's name (Last, First MI): ");  // Search by Author
                     keyword = scan.nextLine();
                     break;
            case 3:  System.out.print("Please enter the book's title: ");   // Search by Title
                     keyword = scan.nextLine();
                     break;
            default: System.out.println("Sorry, invalid choice.");
        }

        if(method == 1) {
            for(int i = 0; i < books.size(); i++) {
                if(books.get(i).getISBN() == keyID) {
                    System.out.println(books.get(i).toString());

                    System.out.print("Please enter the book author's name (Last, First MI): ");
                    if(scan.findInLine("(?=\\S)") != null) {
                        books.get(i).setAuthor(scan.nextLine());
                    } else {
                        System.out.println("Value did not change.");
                        scan.nextLine();
                    }

                    System.out.print("Please enter the book's title: ");
                    if(scan.findInLine("(?=\\S)") != null) {
                        books.get(i).setTitle(scan.nextLine());
                    } else {
                        System.out.println("Value did not change.");
                        scan.nextLine();
                    }
                } else {
                    System.out.print("Sorry, but the provided ISBN cannot be found.");
                }
            }
        }

        if(method == 2) {
            for(int i = 0; i < books.size(); i++) {
                if(books.get(i).getAuthor() == keyword) {
                    System.out.println(books.get(i).toString());

                    System.out.print("Please enter the book's 10 digit ISBN: ");
                    if(scan.findInLine("(?=\\S)") != null) {
                        books.get(i).setISBN(scan.nextInt());
                        scan.nextLine();
                    } else {
                        System.out.println("Value did not change.");
                        scan.nextLine();
                    }

                    System.out.print("Please enter the book's title: ");
                    if(scan.findInLine("(?=\\S)") != null) {
                        books.get(i).setTitle(scan.nextLine());
                    } else {
                        System.out.println("Value did not change.");
                        scan.nextLine();
                    }
                } else {
                    System.out.print("Sorry, but the provided author cannot be found.");
                }
            }
        }

        if(method == 3) {
            for(int i = 0; i < books.size(); i++) {
                if(books.get(i).getTitle() == keyword) {
                    System.out.println(books.get(i).toString());

                    System.out.print("Please enter the book's 10 digit ISBN: ");
                    if(scan.findInLine("(?=\\S)") != null) {
                        books.get(i).setISBN(scan.nextInt());
                        scan.nextLine();
                    } else {
                        System.out.println("Value did not change.");
                        scan.nextLine();
                    }

                    System.out.print("Please enter the book's author's name (Last, First MI): ");
                    if(scan.findInLine("(?=\\S)") != null) {
                        books.get(i).setAuthor(scan.nextLine());
                    } else {
                        System.out.println("Value did not change.");
                        scan.nextLine();
                    }
                } else {
                    System.out.print("Sorry, but the provided title cannot be found.");
                }
            }
        }
    }

    /**
     * <h2>Show Patrons</h2>
     * This method prints a list of all patrons to the screen for the user to view.
     */
    static void showPatrons() {
        System.out.println("List of all patrons: ");
        for(int i = 0; i < patrons.size(); i++) {
            System.out.println(patrons.get(i).toString());
        }
        System.out.println();
    }

    /**
     * <h2>Show Books</h2>
     * This method prints a list of all books to the screen for the user to view.
     */
    static void showBooks() {
        System.out.println("List of all books: ");
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
        System.out.println();
    }

    /**
     * <h2>Checkout Book</h2>
     * This method allows a user to checkout the selected book by entering in the patron's id
     * and the book's 10 digit ISBN.
     */
    static void checkOutBook() {
        System.out.print("Please enter patron's ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Please enter the book's 10 digit ISBN: ");
        int isbn = scan.nextInt();
        scan.nextLine();

        for(int k = 0; k < patrons.size(); k++) {
            if(patrons.get(k).getID() == id) {
                if(patrons.get(k).booksBorrowed().size() < 3) {
                    for(int i = 0; i < books.size(); i++) {
                        if(books.get(i).getISBN() == isbn) {
                            if(books.get(i).checkOut(id)) {
                                patrons.get(k).borrowBook(isbn);
                                System.out.println("The book has been successfully checked out.");
                            } else {
                                if(i == (books.size() - 1)) {
                                    System.out.println("Sorry, there are no copies of that book available at this time.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * <h2>Checkin Book</h2>
     * This method allows a user to checkin the selected book by entering in the patron's id
     * and the book's 10 digit ISBN.
     */
    static void checkInBook() {
        System.out.print("Please enter patron's ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Please enter the book's 10 digit ISBN: ");
        int isbn = scan.nextInt();
        scan.nextLine();

        for(int k = 0; k < patrons.size(); k++) {
            if(patrons.get(k).getID() == id) {
                if(patrons.get(k).returnBook(isbn)) {
                    for(int i = 0; i < books.size(); i++) {
                        if(books.get(i).getISBN() == isbn) {
                            if(books.get(i).checkIn(id)) {
                                System.out.println("This book has been returned. ");
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * <h2>Show Books Checked Out</h2>
     * This method allows a user to see what books are checked out and by whom.
     */
    static void booksOut() {
        boolean found = false;
        for(int i = 0; i < books.size(); i++) {
            if(!books.get(i).getAvailable()) {
                found = true;
                System.out.println(books.get(i).toString() + "is checked out by: ");
                System.out.println(patrons.get(books.get(i).hasPossession()).toString());
                System.out.println();
            }
        }
        if(!found) System.out.println("No books are checked out at this time.");
        System.out.println();
    }
}
