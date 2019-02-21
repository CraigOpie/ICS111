/**
Name:   Craig Opie
Class:  ICS111
Date:   January 15th, 2019
File:   FuelConsumption.java - Project 2.2

Problem:
Write a program that reads in the following information:
Number of gallons used (decimal number)
Initial and final odometer readings, in miles (integers)

Your program should then print a report containing the information received from the user and calculations for:
Miles traveled
Kilometers traveled (one mile is 1.609344 kilometers)
Miles per gallon
Kilometers per liter (one gallon is 3.785412 liters)

Algorithm:
1)  Create a public class titled 'FuelConsumption'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Create a Scanner object that will be used repeatedly.
        2.  Inform the user the purpose of the program.
        3.  Prompt the user to enter the number of gallons of fuel used.
        4.  Take input from the user using 'scan', expect a double.
        5.  Prompt the user to enter the initial odometer reading.
        6.  Take input from the user using 'scan', expect an integer.
        7.  Prompt the user to enter the final odometer reading.
        8.  Take input from the user using 'scan', expect an integer.
        9.  Perform a calculation to figure out how many miles were travelled.
        10. Perform a calculation to figure out how many kilometers were travelled.
        11. Perform a calculation to figure out how many mpg were used.
        12. Perform a calculation to figure out how many kpl were used.
        13. Inform the user all of the findings.
*/
import java.util.Scanner; // Required to take input from the user

public class FuelConsumption {
    /** Calculates the miles/kilometers traveled and MPG/KPL. */
    public static void main(String[] args) {
        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Display background information to the user explaining the program.
        System.out.println("This program will determine your fuel consumption using volume of feul and distance traveled.");

        // Prompt the user for the number of gallons of fuel used.
        System.out.print("Enter the number of gallons used (decimal number): ");
        double gal_used = scan.nextDouble();

        // Prompt the user for the initial odometer reading.
        System.out.print("Enter the initial odometer readings, in miles (integers): ");
        int init_miles = scan.nextInt();

        // Prompt the user for the final odometer reading.
        System.out.print("Enter the final odometer readings, in miles (integers): ");
        int fin_miles = scan.nextInt();
        System.out.println();

        // Calculate how much miles were traveled.
        int miles = (fin_miles - init_miles);

        // Calculate how much kilometers were traveled.
        double kilometers = (miles * 1.609344);

        // Calculate MPG.
        double mpg = (miles / gal_used);

        // Calculate KPL.
        double kpl = (kilometers / (gal_used * 3.785412));

        // Inform the user how many miles/kilometers traveled and MPG/KPL.
        System.out.println("Here are the stats for your car:");
        System.out.println("Initial odometer reading: " + init_miles);
        System.out.println("Initial final reading: " + fin_miles);
        System.out.println("Miles traveled: " + miles);
        System.out.println("Kilometers traveled: " + kilometers);
        System.out.println("Miles per gallon: " + mpg);
        System.out.println("Kilometers per liter: " + kpl);
        System.out.println();

    }
}
