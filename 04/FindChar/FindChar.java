/**
Name:   Craig Opie
Class:  ICS111
Date:   February 4th, 2019
File:   FindChar.java - Project 4.2

Problem:
Write a program that gets a single character from the user.  If the user enters more than one character, use the first one.  Then determine whether that character is a letter, number, or something else.  If it's a letter, determine whether it is a vowel or consonant.  If it's a number, determine whether it's odd or even.  Here are a few example runs of the program:
Enter a single character: a
a is a lower case vowel
Enter a single character: X
X is an upper case consonant
Enter a single character: 8
8 is an even number
Enter a single character: 94
9 is an odd number
Enter a single character: !
! is neither a letter or number

Algorithm:
1)  Create a public class titled 'FindChar'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Explain the program to the user.
        2.  Create a Scanner object that will be used repeatedly.
        3.  Create a default string to use if the character is unknown.
        4.  Prompt the user to enter a single character.
        5.  Take input from the user using 'scan', expect a String, and store in 'input_'.
        6.  Check to ensure the 'input_' is not empty.  If it is empty, replace it with a ' '.
        7.  Store the first character in 'input_' in 'char_'.
        8.  Convert 'char_' to the unicode decimal equivalent.
        9.  Determine the type of character the user provided:
            A.  If the 'char_' is an integer (between 0-9):
                i.  Determine if 'char_' is even or odd.
                ii. Store the result in 'identity'.
            B.  Else if the 'char_' is an upper case letter (A-Z):
                i.  Determine if 'char_' is a vowel or consonant.
                ii. Store the result in 'identity'.
            C.  Else if the 'char_' is a lower case letter (a-z):
                i.  Determine if 'char_' is a vowel or consonant.
                ii. Store the result in 'identity'.
        10. Inform the user the 'char_' value and it's 'identity'.
*/
import java.util.Scanner; // Required to take input from the user

public class FindChar {
    /** This program is used to determine the type of character input by the user. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program is used to determine the type of character input by the user.");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Create a default string for the characters identity.
        String identity = " is neither a letter nor number.";

        // Prompt the user for the first value.
        System.out.print("Enter a single character: ");
        String input_ = scan.nextLine();

        // Prevents empty string value.
        input_ = ((input_.equals("")) ? (" ") : (input_));

        // Takes first character in users input and converts it to the decimal value.
        char char_ = (char)input_.charAt(0);
        int value = (int)char_;

        // Determine the type of character provided by the user.
        if (value >= 48 && value <= 57) {
            identity = ((value % 2 == 0) ? (" is an even number.") : (" is an odd number."));
        } else if (value >= 65 && value <= 90) {
            identity = ((value == 65 || value == 69 || value == 73 || value == 79 || value == 85 || value == 89) ? (" is an upper case vowel.") : (" is an upper case consonant."));
        } else if ( value >= 97 && value <= 122) {
            identity = ((value == 97 || value == 101 || value == 105 || value == 111 || value == 117 || value == 121) ? (" is a lower case vowel.") : (" is a lower case consonant."));
        }

        // Inform the user the type of character provided.
        System.out.println(char_ + identity);
        System.out.println();

    }
}
