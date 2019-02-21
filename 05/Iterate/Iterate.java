/**
Name:   Craig Opie
Class:  ICS111
Date:   February 12th, 2019
File:   Iterate.java - Project 5.2

Problem:
Write a program that gets a phrase from the user.  Then use a for loop to examine each letter of the phrase.  Print out the position and character found at that position.  Count how many times an 'A', 'E', 'I', 'O', or 'U' appears in the phrase.  Your program should print out the character in the original case entered by the user, but should treat 'a' and 'A' the same when counting them.

Algorithm:
1)  Create a public class titled 'Iterate'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will not take any arguments and will only be used to interface with the user and display the result.
        1.  Explain how the program works to the user.
        2.  Creates a 'Scanner' object and named 'scan'.
        3.  Create variables to store the count for each vowel:
            A.  'a_' stores the number of "a"s in the phrase.
            B.  'e_' stores the number of "e"s in the phrase.
            C.  'i_' stores the number of "i"s in the phrase.
            D.  'o_' stores the number of "o"s in the phrase.
            E.  'u_' stores the number of "u"s in the phrase.
        4.  Prompt the user for a phrase input.
        5.  Create a variable and store user input in 'phrase'.
        6.  Create a variable to store the character being iterated in 'char_'.
        7.  Create a for loop that iterates through each character of 'phrase':
            A.  Assign the character at the current pointer location to 'char_'.
            B.  Increment 'a_' if 'char_' is a lower case or upper case "a".
            C.  Increment 'e_' if 'char_' is a lower case or upper case "e".
            D.  Increment 'i_' if 'char_' is a lower case or upper case "i".
            E.  Increment 'o_' if 'char_' is a lower case or upper case "o".
            F.  Increment 'u_' if 'char_' is a lower case or upper case "u".
            G.  Print the pointer location "index" and the character location in that position.
        8.  Print the total number of each vowel contained in the 'phrase'.
*/
import java.util.Scanner; // Required for user input

public class Iterate {
    /** Program takes user input and then iterates over the string displaying the character and index position. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program takes user input and then iterates through the string to display each character, it's index position, and how many of each vowel was used in the phrase.");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Create variables to store the count for each vowel.
        int a_ = 0;
        int e_ = 0;
        int i_ = 0;
        int o_ = 0;
        int u_ = 0;

        // Get user input and store in variable 'phrase'.
        System.out.print("Enter a phrase: ");
        String phrase = scan.nextLine();

        // Variable to store character being iterated.
        char char_ = phrase.charAt(0);

        // Utilize a for loop to iterate through the string to display character, position, and count vowels.
        for (int i = 0; i < phrase.length(); i++) {
            // Store char at current pointer position in 'char_'.
            char_ = phrase.charAt(i);

            // Count number of vowels during iteration.
            a_ = ((char_ == 'a' || char_ == 'A') ? (a_ += 1) : (a_ += 0));
            e_ = ((char_ == 'e' || char_ == 'E') ? (e_ += 1) : (e_ += 0));
            i_ = ((char_ == 'i' || char_ == 'I') ? (i_ += 1) : (i_ += 0));
            o_ = ((char_ == 'o' || char_ == 'O') ? (o_ += 1) : (o_ += 0));
            u_ = ((char_ == 'u' || char_ == 'U') ? (u_ += 1) : (u_ += 0));

            // Display index and character.
            System.out.println(i + " : " + char_);
        }
        System.out.println(); // For formatting purposes.

        // Display total number of vowels.
        System.out.println("This phrase contains: ");
        System.out.println(a_ + " 'A's");
        System.out.println(e_ + " 'E's");
        System.out.println(i_ + " 'I's");
        System.out.println(o_ + " 'O's");
        System.out.println(u_ + " 'U's");
        System.out.println();
    }
}
