/**
 * <h1>Web Scrape</h1>
 * This class scans a user provided URL for a user provided word (not case sensitive).
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-20
 *
 */
import java.util.Scanner;   // Required for user input
import java.io.File;        // Required to read and write to file
import java.net.URL;        // Required to write text to file

/**
 * <h2>WebScrape Class</h2>
 * Scans a webpage and counts how many times a user provided word appears (not case sensitive).
 *
 * @param content   String value of content from webpage.
 * @param count     Integer representing how many times the keyword appears in the text.
 * @param input     Raw data from the webpage prior to being processed into a String.
 * @param keyword   User provided String which is the search term for the webpage (Default is 'windward').
 * @param page      String value of webpage location (Default is 'https://windward.hawaii.edu/About_WCC/').
 * @param url       URL object of the 'page' String value.
 * @param words     String Array with each item separated using white space.  Some items may contain HTML tag information other than words.
 *
 * @exception MalformedURLException If user provided URL can't be resolved.
 * @exception IOException           On input error.
 *
 */
public class WebScrape {
    public static void main(String[] args) {
        // Create required variables
        String content = "";
        int count = 0;

        // Inform the user about this program
        System.out.println("This program scans a webpage and counts how many times a user provided word appears (not case sensitive).");
        System.out.println();

        // Prompt the user for the URL to search
        System.out.print("Please enter the URL you wish to search (Leave blank for default): ");
        String page = new Scanner(System.in).nextLine();

        // Prompt the user for the keyword to search
        System.out.print("Please enter the keyword you are searching for (Leave blank for default): ");
        String keyword = new Scanner(System.in).nextLine();

        // Determine and assign default values as necessary
        if (page == "" || page == null || page.isEmpty()) page = "https://windward.hawaii.edu/About_WCC/";
        if (keyword == "" || keyword == null || keyword.isEmpty()) keyword = "windward";

        // Format keyword for comparison
        keyword = keyword.toLowerCase();

        // Try to obtain web content and throw exceptions as required
        try {
            // Open URL and process content to a String array
            URL url = new URL(page);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                content += input.nextLine() + " \n";
            }
            String[] words = content.split("\\s+");

            // Search through the String array for the keyword
            for (int i = 0; i < words.length; i++) {
                if (words[i].toLowerCase().contains(keyword)) count += 1;
            }

            // Show the user how many times the keyword appeared in the HTML file
            System.out.println(keyword + " appears " + count + " time(s).");
        }

        // Catch a bad URL and inform the user before exiting the program
        catch(java.net.MalformedURLException badURL) {
            System.out.println("Invalid URL");
            System.exit(1);
        }

        // Catch any IO errors and inform the user before exiting the program
        catch(java.io.IOException ioError) {
            System.out.println("IO Errors");
            System.exit(2);
        }
    }
}
