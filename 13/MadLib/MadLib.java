/**
 * <h1>Mad Libs</h1>
 * This class generates five random sentences (like mad libs), prints them to a file, then reads in the sentences and prints them to the console.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-20
 *
 */
import java.util.Scanner;   // Required for user input
import java.io.File;        // Required to read and write to file
import java.io.PrintWriter; // Required to write text to file

/**
 * <h2>MadLib Class</h2>
 * Uses random number generator to choose which words will be used in the sentence.
 *
 * @param filename  Specifies the filename to use for reading and writing (Global Variable).
 * @param color     Specifies the list of different colors to use for random selection (Global Array).
 * @param noun      Specifies the list of different nouns to use for random selection (Global Array).
 * @param verb      Specifies the list of different verbs to use for random selection (Global Array).
 * @param place     Specifies the list of different places to use for random selection (Global Array).
 *
 */
public class MadLib {
    // Create required global variables
    static String filename = "RandomStrings.txt";

    // Create required global arrays for color, noun, verb, and place
    static String[] color = {"red", "orange", "yellow", "green", "blue"};
    static String[] noun = {"car", "flower", "airplane", "submarine", "house"};
    static String[] verb = {"fly", "dance", "drive", "swim", "climb"};
    static String[] place = {"White House", "mountains", "lake", "disco", "racetrack"};

    public static void main(String[] args) throws Exception {
        // Inform the user about this program
        System.out.println("This program generates five random sentences, writes them to a file, reads them from the file, then prints them to the screen.");

        // Write the file with five randomly generated Mad Libs
        writeFile(popContent());

        // Read the file with five randomly generated Mad Libs and print the contents to screen
        System.out.println(readFile());
    }

    /**
     * <h2>getRand()</h2>
     * Get a random number between zero and the value specified (minus one).
     *
     * @param top	Specifies the number of int (0 thru top-1).
     * @return      The int value of the random number.
     *
     */
    public static int getRand(int top) {
        int random = (int)(Math.random() * top);
        return(random);
    }

    /**
     * <h2>popContent()</h2>
     * Populate the content for outfile using random values from global arrays.
     *
     * @return      String containing five lines of MadLib using global String arrays for input.
     *
     */
    private static String popContent() {
        // Create string variable to store MadLib sentences
        String value = "";

        // Populate the string variable 'value'
        for(int i = 0; i < 5; i++) {
            value += "The " + color[getRand(color.length)] + " " + noun[getRand(noun.length)] + " wants to " + verb[getRand(verb.length)] + " at the " + place[getRand(place.length)] + ".\n";
        }
        return(value);
    }

    /**
     * <h2>writeFile()</h2>
     * Write content to a plain text file.
     *
     * @param data	Contains the String of all lines to be written to file.
     *
     */
    private static void writeFile(String data) throws Exception {
        // Prepare file for creation
        File outfile = new File(filename);

        // Check to see if the file exists and inform the user
        if(outfile.exists()) System.out.println("File exists, overwriting file with new content.");
        System.out.println();

        // Create file and write contents to file
        try (PrintWriter content = new PrintWriter(outfile)) {
            content.print(data);
        }
    }

    /**
     * <h2>readFile()</h2>
     * Read the contents of a plain text file.
     *
     * @return      String value of the contents of the file being read.
     *
     */
    private static String readFile() throws Exception {
        // Create string variable to store file contents
        String contentIn = "";

        // Check if the file to be read exists
        File loadfile = new File(filename);
        if(!loadfile.exists()) {
            System.out.println("Infile does not exist, exiting program.");
            System.exit(1);
        }

        // Create a Scanner object to read file
        Scanner infile = new Scanner(new File(filename));


        // Store each line from the plain text file in contentIn and end the line with a new line
        while (infile.hasNext()) {
            contentIn += infile.nextLine() + "\n";
        }
        return(contentIn);
    }
}
