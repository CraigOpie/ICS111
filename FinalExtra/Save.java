/**
 * <h1>Save</h1>
 * This class is used to create a patron for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;                  // Required for user input


class Save {
    public Save(ArrayList<Book> books, ArrayList<Patron> patrons) {

        JSONObject bookDetails = new JSONObject();
        JSONObject bookObject = new JSONObject();
        JSONArray bookList = new JSONArray();

        JSONObject patronDetails = new JSONObject();
        JSONArray patronList = new JSONArray();

        ArrayList<String> objectIndex = new ArrayList<String>();
        objectIndex = ["isbn", "title", "author", "checkout_date", "due_date", "available", "has_possession"];

        for(int i = 0; i < books.size(); i++) {
            ArrayList<String> details = new ArrayList<String>();
            details = (books.get(i).save());
            for(int k = 0; k < details.size(); k++) {
                bookDetails.put(objectIndex.get(k), details.get(k));
            }
            bookObject.put("book", bookDetails);
            bookList.add(bookObject);
        }

        try(FileWriter outFile = new FileWriter("library.json")) {
            outFile.write(bookList.toJSONString());
            outFile.flush();
        }
    }
}
