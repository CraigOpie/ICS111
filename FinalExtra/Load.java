/**
 * <h1>Load</h1>
 * This class is used to create a patron for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.FileReader;
import java.io. IOException;

class Load {
    public Load() {

    }

    static ArrayList<Book> loadBooks() {
        try(FileReader fileReader = new FileReader("books.json")) {
            JsonArray objects = Jsoner.deserializeMany(fileReader);
            Mapper mapper = new DozerBeanMapper();
            JsonArray o = (JsonArray) objects.get(0);
            ArrayList<Book> books = o.stream().map(x -> mapper.map(x, Book.class)).collect(collectors.toList());
            collect.forEach(x -> System.out.println(x));
        }
    }

    static ArrayList<Patron> loadPatrons() {
        try(FileReader fileReader = new FileReader("patrons.json")) {
            JsonArray objects = Jsoner.deserializeMany(fileReader);
            Mapper mapper = new DozerBeanMapper();
            JsonArray o = (JsonArray) objects.get(0);
            ArrayList<Patron> patrons = o.stream().map(x -> mapper.map(x, Book.class)).collect(collectors.toList());
        }
    }
}
