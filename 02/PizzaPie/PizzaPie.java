/**
Name:   Craig Opie
Class:  ICS111
Date:   January 15th, 2019
File:   PizzaPie.java - Project 2.1

Problem:
Write a program that asks the user for the cost of a whole pizza and the number
of (equal) slices into which the pizza is cut.  Calculate the cost of one slice
of pizza, and display that amount to the user.

Algorithm:
1)  Create a public class titled 'PizzaPie'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Create a Scanner object that will be used repeatedly.
        2.  Prompt the user to enter the cost of the whole pizza.
        3.  Take input from the user using 'scan', expect a double.
        4.  Prompt the user to enter the number of slices on the pizza.
        5.  Take input from the user using 'scan', expect an integer.
        6.  Perform a calculation to figure out how much a slice costs 'slice'.
        7.  Inform the user how much the price of each slice is, as a double.
*/
import java.util.Scanner; // Required to take input from the user

public class PizzaPie {
    /** Calculates the cost of each slice of pizza based on the overall cost
        and number of slices. */
    public static void main(String[] args) {
        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the cost of the pizza.
        System.out.print("Enter the cost of a whole pizza: $");
        double cost = scan.nextDouble();

        // Prompt the user for the number of slices.
        System.out.print("Enter the number of slices: ");
        int num = scan.nextInt();

        // Calculate how much each slice costs individually.
        double slice = (cost / (double)num);

        // Inform the user how much each slice of pizza costs.
        System.out.println("The cost of one slice of pizza is $" + slice);
        System.out.println();

    }
}
