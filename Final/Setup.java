import java.util.ArrayList;

/**
 * <h1>Setup</h1>
 * This class is used to setup the book and patron list for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-05-11
 *
 */
public class Setup {
    static ArrayList<Patron> setupPatrons = new ArrayList<Patron>();
    static ArrayList<Book> setupBooks = new ArrayList<Book>();

    public Setup() {
        setupPatrons.add(new Patron(setupPatrons.size(), "Craig", "Opie", "725 Kapiolani Blvd, Apt 3304, Honolulu, HI, 96813"));
        setupPatrons.add(new Patron(setupPatrons.size(), "Janelle", "Wells", "725 Kapiolani Blvd, Apt 3304, Honolulu, HI, 96813"));
        setupPatrons.add(new Patron(setupPatrons.size(), "Kailani", "Wells", "725 Kapiolani Blvd, Apt 3304, Honolulu, HI, 96813"));
        setupPatrons.add(new Patron(setupPatrons.size(), "Carter", "Wells", "725 Kapiolani Blvd, Apt 3304, Honolulu, HI, 96813"));

        setupBooks.add(new Book(679805273, "Dr. Seuss", "Oh, the Places You'll Go!"));
        setupBooks.add(new Book(394800133, "Dr. Seuss", "One Fish, Two Fish, Red Fish, Blue Fish"));
        setupBooks.add(new Book(394823370, "Dr. Seuss", "The Lorax"));
        setupBooks.add(new Book(394800788, "Dr. Seuss", "Horton Hears a Who!"));
    }

    /**
     * <h2>Get Setup Patrons</h2>
     * Get the class' list of setup patrons.
     *
     * @return ArrayList<Patron> returns the list of setup patrons.
     *
     */
    public ArrayList<Patron> getSetupPatrons() {
        return(setupPatrons);
    }

    /**
     * <h2>Get Setup Books</h2>
     * Get the class' list of setup books.
     *
     * @return ArrayList<Book> returns the list of setup books.
     *
     */
    public ArrayList<Book> getSetupBooks() {
        return(setupBooks);
    }
}
