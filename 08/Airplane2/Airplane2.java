/**
Name:   Craig Opie
Class:  ICS111
Date:   March 5th, 2019
File:   Airplane2.java - Project 8.1


Problem:
Create a new version of your airplane reservation program from Project 7.1 that uses a single, two-dimensional array
of chars to store all the seats, rather than three separate single arrays.  The menu and output for Project 8.1 should
be the same as Project 7.1.


Algorithm:
1)  Create a public class titled 'Airplane'.
    A)  Create a static Scanner object 'scan' to use within all static methods.
    B)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will take two arguments and will only be used to interface with the user and display the result.
        1.  Declare and initialize variables for the main().
        2.  Determine if the user passed arguments during application execution and assign to correct variables.
        3.  Declare a 2D char array using size constraints provided by the user.
        4.  Inform the user the purpose of the program.
        5.  Populate the 2D char array using the createBlueprint().
        6.  Determine the users navigation choice using the menu() and a switch statement;
    C)  Create a private static method to populate the 2D char array.  This method receives the number of rows and
        columns as arguments and returns the completely populated 2D char array when complete.
        1.  Create variables for createBlueprint()
        2.  Populate seat letters using unicode.
        3.  Populate 2D char array using seat information.
        4.  Return the 2D char array after being populated.
    D)  Create a private static method that is used to display the overall navigation menu to the user and returns
        the users choice as an integer.
        1.  Repeatedly display the main menu until a valid choice is made.
        2.  Return that choice as an integer.
    E)  Create a private static method that is used to scan the 2D char array for comparing user input to see if the
        user provided a valid input and return the 2D char array with updated user choice information.
        1.  Create variables for selectSeat().
        2.  Create a loop that repeatedly asks the user for input until the user provides a valid seat choice.
        3.  Populate the 2D char array using the user provided choice.
    F)  Create a private static method that will print the contents of the 2D char array to the screen for the user.
        1.  Iterate through each cell of the 2D array using a for loop and print the contents to screen for the user.
*/

import java.util.Scanner; // Required for user input

public class Airplane2 {
    /** Program used to manage seating reservations onboard an airplane.
        Arguments (Integers) separated by a space:
            [0] - This value represents the number of rows in the airplane
            [1] - This value represents the number of seats in the airplane

    */

    // Global Variable
    static Scanner scan = new Scanner(System.in);  // Create a Scanner object 'scan' for repeated user input

    public static void main(String[] args) {
        /** Arguments default to a minimum of '3' */

        // Variables for main()
        int rows = 3;
        int cols = 3;
        int choice = 0;

        // Assign arguments to main() variables
        if (args.length == 2) {
            if (args[0] != "") rows = Integer.parseInt(args[0]);
            if (args[1] != "") cols = Integer.parseInt(args[1]);
        } else if (args.length == 1) {
            if (args[0] != "") rows = Integer.parseInt(args[0]);
        }

        // Create a 2D char array using the constraints specified by the user
        char[][] seating_chart = new char[rows][cols];

        // Inform the user about the program.
        System.out.println("This program is used to manage seating reservations onboard an airplane.");
        System.out.println();

        // Create the 2D array containing seat information
        seating_chart = createBlueprint(rows, cols);

        // Repeat the main menu cycle until the user chooses to exit the program
        while (choice != 3) {
            choice = menu();
            switch (choice) {
                case 1:  seating_chart = selectSeat(seating_chart);
                         choice = 0;
                         break;
                case 2:  displaySeatingChart(seating_chart);
                         choice = 0;
                         break;
                case 3:  System.out.println();
                         break;
                default: choice = 0;
            }
        }
    }


    private static char[][] createBlueprint(int rows, int cols) {
        /** Creates a 2D array containing seat information
            Arguments (Integer):
                rows - The number of rows for the 2D array
                cols - The number of cols for the 2D array
            Returns (2D char array):
                blue_print - 2D char array identifying seats by row and column
        */

        // Variables for createBlueprint()
        char[] seats = new char[cols];
        char[][] blue_print = new char[rows][cols];

        // Populate seat letters using unicode
        for (int k = 0; k < cols; k++) {
            seats[k] = (char)(k + 65);
        }

        // Populate 2D array using seat information for each row
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                blue_print[r][c] = seats[c];
            }
        }

        // Return the final 2D array
        return(blue_print);
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


    private static char[][] selectSeat(char[][] seating_chart) {
        /** Verifies the user is selecting a valid seat and mark the seat as reserved.
            Arguments (2D char array):
                Contains seating information
            Returns (2D char array):
                Contains updated information reflecting the seat chosen by the user
        */

        // Variables for selectSeat()
        int row;
        char seat;

        // Repeat the seat selection process until the user chooses a valid seat
        while (true) {

            // Display available rows
            System.out.print("Select row (1");
            for (int i = 2; i <= seating_chart.length; i++) {
                System.out.print(", " + i);
            }
            System.out.print("): ");
            row = scan.nextInt();
            row = ((row >= 1 && row <= seating_chart.length) ? row : 0);

            // Display available seats
            System.out.print("Select seat (A");
            for (int i = 1; i < seating_chart[0].length; i++) {
                System.out.print(", " + seating_chart[0][i]);
            }
            System.out.print("): ");
            seat = scan.next().charAt(0);
            seat = (((int)seat > 90) ? (char)((int)seat - 32) : seat);
            seat = (((int)seat >= 65 && (int)seat <= 64 + seating_chart[0].length) ? seat : 64);

            // Check to see if the user chose a valid empty seat and update then return the 2D char array
            if (row == 0 || (int)seat == 64) {
                System.out.println("Sorry, invalid seat selection");
                System.out.println();
            } else {
                if (seating_chart[(row - 1)][((int)seat - 65)] == 'X') {
                    System.out.println("Sorry, that seat is already selected.  Please try again.");
                    System.out.println();
                } else {
                    System.out.print("Your choice is available.  Are you sure you want this seat? (Y/N): ");
                    if (scan.next().charAt(0) == 'Y') {
                        seating_chart[(row - 1)][((int)seat - 65)] = 'X';
                        return(seating_chart);
                    }
                }
            }
        }
    }


    private static void displaySeatingChart(char[][] seating_chart) {
        /** Displays the seating chart which reflects seats available for the user.
            Arguments (2D char array):
                Displays seating information
        */

        // Iterate through each cell of the 2D array and print the contents to screen for the user
        System.out.println();
        System.out.println("Seating Chart");
        for (int row = 0; row < seating_chart.length; row++) {
            System.out.print("Row " + (row+1) + ": ");
            for (int col = 0; col < seating_chart[row].length; col++) {
                System.out.print(seating_chart[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
