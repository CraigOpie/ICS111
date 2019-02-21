/**
Name:   Craig Opie
Class:  ICS111
Date:   February 4th, 2019
File:   WordSearch.java - Project 4.3

Problem:
Write a program that gets a phrase and a single word from the user.  Then use some String methods to do the following:
Display the phrase in lower case
Display the phrase in upper case
Display the length of the phrase
Determine whether or not the phrase and the word are the same
Display the middle letter of the phrase
Determine whether the phrase contains the word
Determine whether the phrase contains the letter "a"
Display the phrase and the word together (use the String method to put them together rather than just printing one after the other)

Algorithm:
1)  Create a public class titled 'WordSearch'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Explain the program to the user.
        2.  Create a Scanner object that will be used repeatedly.
        3.  Prompt the user to enter a phrase.
        4.  Take input from the user using 'scan', expect a String, and store in 'phrase'.
        5.  Check to ensure the 'phrase' is not empty.  If it is empty, replace it with a ' '.
        6.  Prompt the user to enter a word.
        7.  Take input from the user using 'scan', expect a String, and store in 'word'.
        8.  Check to ensure the 'word' is not empty.  If it is empty, replace it with a ' '.
        9.  Display the 'phrase' in lower case.
        10. Display the 'phrase' in upper case.
        11. Determine the length of the 'phrase' and store in 'length'.
        12. Display the 'length' of the 'phrase'.
        13. Display if the 'phrase' and 'word' are the same.
        14. Find the middle character by dividing the 'length' in half and store character in 'middle'.
        15. If the 'middle' is a blank then use the next character as 'middle'.
        16. Display the 'middle' character of the 'phrase'.
        17. Display if the 'phrase' contains the 'word'.
        18. Display if the 'phrase' contains the letter "a".
        19. Display the 'phrase' and the 'word' concatenated together.
*/
import java.util.Scanner; // Required to take input from the user

public class WordSearch {
    /** This program is used to determine if a word is contained in a phrase. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program is used to determine if a word is contained in a phrase.");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first value.
        System.out.print("Enter a phrase: ");
        String phrase = scan.nextLine();
        // Prevents empty string value.
        phrase = ((phrase.equals("")) ? (" ") : (phrase));

        // Prompt the user for the second value.
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        // Prevents empty string value.
        word = ((word.equals("")) ? (" ") : (word));
        System.out.println();

        // Display the phrase in lower case.
        System.out.println("Lower case: " + phrase.toLowerCase());

        // Display the phrase in upper case
        System.out.println("Upper case: " + phrase.toUpperCase());

        // Display the length of the phrase
        int phrase_length = phrase.length();
        System.out.println("Phrase length: " + phrase_length);

        // Determine whether or not the phrase and the word are the same
        System.out.println("Same strings: " + phrase.equals(word));

        // Display the middle letter of the phrase
        char middle = phrase.charAt(phrase_length/2);
        middle = ((Character.isLetterOrDigit(middle)) ? (middle) : (phrase.charAt(phrase_length/2+1)));
        System.out.println("Middle letter: " + middle);

        // Determine whether the phrase contains the word
        System.out.println("Phrase contains word: " + phrase.contains(word));

        // Determine whether the phrase contains the letter "a"
        System.out.println("Phrase contains \"a\": " + phrase.contains("a"));

        // Display the phrase and the word together
        System.out.println("Phrase plus word: " + phrase.concat(word));
        System.out.println();

    }
}
