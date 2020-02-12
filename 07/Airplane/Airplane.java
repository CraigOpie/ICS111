/**
Name:   Craig Opie
Class:  ICS111
Date:   March 5th, 2019
File:   Airplane.java - Project 7.1


Problem:
Write a program that manages the seating reservations for a small plane, with three rows of three seats per row:

Row 1: A B C
Row 2: A B C
Row 3: A B C

Use a char array to store the three seats for each row.  You should have three arrays.  Each array should be initialized to the seat letter ('A', 'B', 'C').  When the seat is filled, you should replace the seat letter with an 'X'.

Use a loop to print out a menu and perform the appropriate task:

1 - Select Seat - Ask the user for a row and seat letter.  Then fill the appropriate seat with an 'X'.  If the user enters something invalid, print a message stating their selection was invalid.  You don't need to check whether the seat is available or not (assume the user will only select an available seat).
2 - Print Seating Chart - Print the current seating chart so the user can see which seats are available and which seats are filled.
3 - Exit the program
Any other number - Print a message stating that this option was invalid


Algorithm:
1)  Create a public class titled 'Airplane'.
    A)  Create a static Scanner object 'scan' to use within all static methods.
    B)  Create static variables to store the arrays for each row.
    C)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will take two arguments and will only be used to interface with the user and display the result.
        1.  Declare and initialize variables for the main().
        2.  Inform the user the purpose of the program.
        3.  Determine the users navigation choice using the menu() and a switch statement;
    D)  Create a private static method that is used to display the overall navigation menu to the user and returns
        the users choice as an integer.
        1.  Repeatedly display the main menu until a valid choice is made.
        2.  Return that choice as an integer.
    E)  Create a private static method that is used to scan the char array for comparing user input to see if the
        user provided a valid input and update the char array with updated user choice information.
        1.  Create variables for selectSeat().
        2.  Create a loop that repeatedly asks the user for input until the user provides a valid seat choice.
        3.  Populate the char array using the user provided choice.
    F)  Create a private static method that will print the contents of the char arrays to the screen for the user.
        1.  Iterate through each cell of each array using a for loop and print the contents to screen for the user.
*/

import java.util.Scanner; // Required for user input

public class Airplane {
    /** Program used to manage seating reservations onboard an airplane.
        Arguments (Integers) separated by a space:
            [0] - This value represents the number of rows in the airplane
            [1] - This value represents the number of seats in the airplane
    */

    // Global Variable
    static Scanner scan = new Scanner(System.in);  // Create a Scanner object 'scan' for repeated user input
    static char[] row1 = {'A', 'B', 'C'};
    static char[] row2 = {'A', 'B', 'C'};
    static char[] row3 = {'A', 'B', 'C'};

    public static void main(String[] args) {

        // Variables for main()
        int choice = 0;

        // Inform the user about the program.
        System.out.println("This program is used to manage seating reservations onboard an airplane.");
        System.out.println();

        // Repeat the main menu cycle until the user chooses to exit the program
        while (choice != 3) {
            choice = menu();
            switch (choice) {
                case 1:  selectSeat();
                         choice = 0;
                         break;
                case 2:  displaySeatingChart();
                         choice = 0;
                         break;
                case 3:  System.out.println();
                         break;
                default: choice = 0;
            }
        }
    }


    private static int menu() {
        /** Displays the menu for users to select from and checks for valid input.
            Returns (Integer):
                Returns user input as an integer
        */

        // Continue to loop unless a valid input is choosen
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Select Seat");
            System.out.println("2. Print Seating Chart");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            switch (scan.nextInt()) {
                case 1:  return(1);  // Select Seat
                case 2:  return(2);  // Print Seating Chart
                case 3:  return(3);  // Exit the program
                default: System.out.println("Sorry, invalid option");
                         System.out.println();
            }
        }
    }


    private static void selectSeat() {
        /** Verifies the user is selecting a valid seat and mark the seat as reserved. */

        // Variables for selectSeat()
        int row;
        char seat;
        boolean condition = true;

        // Repeat the seat selection process until the user chooses a valid seat
        while (condition) {

            // Display available rows
            System.out.print("Select row (1");
            for (int i = 2; i <= 3; i++) {
                System.out.print(", " + i);
            }
            System.out.print("): ");
            row = scan.nextInt();
            row = ((row >= 1 && row <= 3) ? row : 0);

            // Display available seats
            System.out.print("Select seat (A");
            for (int i = 1; i < 3; i++) {
                System.out.print(", " + row1[i]);
            }
            System.out.print("): ");
            seat = scan.next().charAt(0);
            seat = (((int)seat > 90) ? (char)((int)seat - 32) : seat);
            seat = (((int)seat >= 65 && (int)seat <= 67) ? seat : 64);

            // Check to see if the user chose a valid empty seat and update the char array
            if (row == 0 || (int)seat == 64) {
                System.out.println("Sorry, invalid seat selection");
                System.out.println();
            } else {
                switch (row) {
                    case 1:  if (row1[((int)seat - 65)] == 'X') {
                                 System.out.println("Sorry, invalid seat selection");
                                 System.out.println();
                                 break;
                             } else {
                                 row1[((int)seat - 65)] = 'X';
                                 condition = false;
                                 System.out.println();
                                 break;
                             }
                    case 2:  if (row2[((int)seat - 65)] == 'X') {
                                 System.out.println("Sorry, invalid seat selection");
                                 System.out.println();
                                 break;
                             } else {
                                 row2[((int)seat - 65)] = 'X';
                                 condition = false;
                                 System.out.println();
                                 break;
                             }
                    case 3:  if (row3[((int)seat - 65)] == 'X') {
                                 System.out.println("Sorry, invalid seat selection");
                                 System.out.println();
                                 break;
                             } else {
                                 row3[((int)seat - 65)] = 'X';
                                 condition = false;
                                 System.out.println();
                                 break;
                             }
                     default: System.out.println("Sorry, invalid seat selection");
                }
            }
        }
    }


    private static void displaySeatingChart() {
        /** Displays the seating chart which reflects seats available for the user. */

        // Iterate through each cell of the arrays and print the contents to screen for the user
        System.out.println();
        System.out.println("Seating Chart");
        System.out.print("Row 1: ");
        for (int col = 0; col < 3; col++) {
            System.out.print(row1[col] + " ");
        }
        System.out.println();
        System.out.print("Row 2: ");
        for (int col = 0; col < 3; col++) {
            System.out.print(row2[col] + " ");
        }
        System.out.println();
        System.out.print("Row 3: ");
        for (int col = 0; col < 3; col++) {
            System.out.print(row3[col] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
