/**
Name:   Craig Opie
Class:  ICS111
Date:   February 12th, 2019
File:   Shapes.java - Project 5.3

Problem:
Write a program that uses a do-while loop to get a number between 5 and 15, inclusive, from the user.  Then use some loops to display a square and a triangle of the number the user entered.  You can choose which type of loop to use, and you may have to nest one or more loops together.

Algorithm:
1)  Create a public class titled 'Shapes'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will not take any arguments and will only be used to interface with the user and display the result.
        1.  Explain how the program works to the user.
        2.  Creates a 'Scanner' object and named 'scan'.
        3.  Create variables to store the user input 'num'.
        4.  Create a do-while loop that prompts the user to enter a value between 5 and 15:
            A.  If the value is out of range, inform the user and repeat the loop.
            B.  If the value is in range, store the value in 'num' and exit the loop.
        5.  Create a 2D array using nested for loops to make a square:
            A.  First loop is for each row.
            B.  Second loop is for each column value:
                a.  Print each column value 's_col'.
        6.  Create a 2D array using nested for loops to make a triangle:
            A.  First loop is for each row and contains two for loops:
                a.  First for loop counts down and only displays the value if it is less than or equal to the row number.
                b.  Second for loop counts back up and only displays the value if it si less than or equal to the row number.
*/
import java.util.Scanner; // Required for user input

public class Shapes {
    /** Program takes user input and then outputs two shapes, a square and a triangle, using the value specified by the user. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program takes user input and then outputs two shapes, a square and a triangle, using the value specified by the user.");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Create a variable to store the user input and control the user input do-while loop.
        int num = 0;

        do {
            // Get user input and store in variable 'num'.
            System.out.print("Enter a number between 5 and 15: ");
            num = scan.nextInt();

            // Inform the user if a value out of range was specified by the user.
            if (num < 5 || num > 15) {
                System.out.println("Sorry, " + num + " is invalid.  Please try again.");
            }
        } while (num < 5 || num > 15); // Repeat loop if the user enters a value outside of the desired range.
        System.out.println(); // For formatting purposes.

        // Print box shape using a 2D array.
        for (int s_row = 1; s_row <= num; s_row++) {
            for (int s_col = 1; s_col <= num; s_col++) {
                System.out.print(s_col + " ");
            }
            System.out.println(); // Begins new row.
        }
        System.out.println(); // For formatting purposes.

        // Print triangle shape using a 2D array.
        for (int t_row = 1; t_row <= num; t_row++) {
            // Count down to one.
            for (int t_col = num; t_col > 0; t_col--) {
                if (t_col > t_row) {
                    // If the t_col is greater than 9 then print out an additional space for formatting.
                    if (t_col > 9) {
                        System.out.print("   ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(t_col + " ");
                }
            }
            // Count back up to 'num' without repeating one.
            for (int t_col = 2; t_col <= num; t_col++) {
                if (t_col > t_row) {
                    // If the t_col is greater than 9 then print out an additional space for formatting.
                    if (t_col > 9) {
                        System.out.print("   ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(t_col + " ");
                }
            }
            System.out.println(); // Begins new row.
        }
        System.out.println(); // For formatting purposes.
    }
}
