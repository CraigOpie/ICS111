/**
 * <h1>Library</h1>
 * This class is used to create a library for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
import java.util.*;   // Required for user input

public class Library {
    static Scanner scan = new Scanner(System.in);  // Create a Scanner object 'scan' for repeated user input
    static ArrayList<Patron> patrons = new ArrayList<Patron>();
    static ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        int choice = 0;

        // Inform the user about the program.
        System.out.println("This program is used to manage a library of books.");
        System.out.println();

        // Repeat the main menu cycle until the user chooses to exit the program
        while (choice != 9) {
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
                case 9:  System.out.println();
                         break;
                default: choice = 0;
            }
        }
    }

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
            System.out.println("9. Exit");
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
                case 9:  return(9);  // Exit the program
                default: System.out.println("Sorry, invalid choice.");
                         System.out.println();
            }
        }
    }

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
                }
            }
        }
    }

    static void showPatrons() {
        System.out.println("List of all patrons: ");
        for(int i = 0; i < patrons.size(); i++) {
            System.out.println(patrons.get(i).toString());
        }
        System.out.println();
    }

    static void showBooks() {
        System.out.println("List of all books: ");
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
        System.out.println();
    }

    static void checkOutBook() {
        System.out.print("Please enter patron's ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Please enter the book's 10 digit ISBN: ");
        int isbn = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getISBN() == isbn) {
                books.get(i).checkOut(id);
            }
        }

        for(int i = 0; i < patrons.size(); i++) {
            if(patrons.get(i).getID() == id) {
                patrons.get(i).borrowBook(isbn);
            }
        }
    }

    static void checkInBook() {
        System.out.print("Please enter patron's ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Please enter the book's 10 digit ISBN: ");
        int isbn = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getISBN() == isbn) {
                books.get(i).checkIn();
            }
        }

        for(int i = 0; i < patrons.size(); i++) {
            if(patrons.get(i).getID() == id) {
                patrons.get(i).returnBook(isbn);
            }
        }
    }
}
