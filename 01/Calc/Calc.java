/**
Name:   Craig Opie
Class:  ICS111
Date:   January 14th, 2019
File:   Calc.java - Project 1.2

Problem:
Write a program that calculates and displays the result of:
(32.7 - 29.8) * 4
-----------------     <== division symbol
 3 * 14.5 - 18.9

Algorithm:
1)  Create a public class titled 'Calc'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to perform a calculation and display the result.
        1.  Create a double type variable 'result' to store the result of the
            mathmatical equation.
        2.  Print the mathmatical equation to terminal so the user knows what
            problem is being solved.
        3.  Print 'Equals' concatenated with 'result' so that the user knows
            answer.
*/

public class Calc {
    /** Displays the results of a calculation in terminal */
    public static void main(String[] args) {
        // Evaluate the required expression as a double
        double result = ((32.7 - 29.8) * 4.0) / (3.0 * 14.5 - 18.9);

        // Display the following lines of text in terminal
        System.out.println("(32.7 - 29.8) * 4");
        System.out.println("-----------------");
        System.out.println(" 3 * 14.5 - 18.9");
        System.out.println();
        System.out.println("Equals: " + result);
        System.out.println();

    }
}
