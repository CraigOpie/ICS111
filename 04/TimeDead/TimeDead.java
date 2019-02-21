/**
Name:   Craig Opie
Class:  ICS111
Date:   February 4th, 2019
File:   TimeDead.java - Project 4.1

Problem:
In a recent episode of a popular TV show, a body was discovered lying at the bottom of some basement stairs.  If the temperature of the body upon discovery was 78 degrees and the basement was at a constant temperature of 65 degrees, how long has the person been dead?  Write a program that uses Newton's Law of Cooling to determine how many hours a person has been dead:

        |T-S|
      ln| D |
  t = -0.1947

t = time in hours
T = temperature of the body upon discovery (Fahrenheit)
S = surrounding temperature (Fahrenheit)
D = 98.6 - S (normal body temperature - surrounding temperature)

Prompt the user to enter values for T, the temperature of the body upon discovery (Fahrenheit), and S, the surrounding temperature.  Display the estimated time, t, to two decimal places.

Algorithm:
1)  Create a public class titled 'TimeDead'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Explain the program to the user.
        2.  Create a Scanner object that will be used repeatedly.
        3.  Prompt the user to enter the temperature of the body upon discovery.
        4.  Take input from the user using 'scan', expect a double, and store in 't'.
        5.  Prompt the user to enter the surrounding temperature of the room.
        6.  Take input from the user using 'scan', expect a double, and store in 's'.
        7.  Perform a calculation using Newton's Law of Cooling to figure out the time
            required to cool from 98.6F and store in 'time_dead'.
        8.  Convert the double value into a string with two decimal places and store in 'result'.
        9.  Inform the user the time since death in hours.
*/
import java.util.Scanner; // Required to take input from the user

public class TimeDead {
    /** This program is used to determine the amount of time since a body was found dead.
        It takes input from the user for the rooms temperature and the temperature of the
        body upon discovery to perform a calculation using Newton's Law of Cooling. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program is used to determine the amount of time a body has been dead using temperatures (F).");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first value.
        System.out.print("Enter the temperature of the body upon discovery: ");
        double t = scan.nextDouble();

        // Prompt the user for the second value.
        System.out.print("Enter the surrounding temperature of the room: ");
        double s = scan.nextDouble();

        // Calculate the time since death using Newton's Law of Cooling.
        double time_dead = (Math.log((t - s) / (98.6 - s)) / -0.1947);
        String result = (String.format("%.2f", time_dead) + " hours");

        // Inform the user the time since death in hours (two decimal places).
        System.out.println("The person has been dead for " + result);
        System.out.println();

    }
}
