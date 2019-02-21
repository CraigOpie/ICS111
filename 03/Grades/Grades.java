/**
Name:   Craig Opie
Class:  ICS111
Date:   January 23rd, 2019
File:   Grades.java - Project 3.1

Problem:
Write a program that gets three exam scores from the user (assume these are out of 100).  Calculate
the total, and use an if statement to determine the final letter grade based on the following scale:
    If the total score is at least 90% of the total possible points, letter grade is A
    If the total score is between 80% and 89.99% of the total possible points, letter grade is B
    If the total score is between 70% and 79.99% of the total possible points, letter grade is C
    If the total score is between 60% and 69.99% of the total possible points, letter grade is D
    If the total score is less than 60%, letter grade is F

Algorithm:
1)  Create a public class titled 'Grades'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Explain how to use the program for the user.
        2.  Create a Scanner object that will be used repeatedly.
        3.  Prompt the user to enter the first exam score.
        4.  Take input from the user using 'scan', expect a double, and store in 'first'.
        5.  Prompt the user to enter the second exam score.
        6.  Take input from the user using 'scan', expect a double, and store in 'second'.
        7.  Prompt the user to enter the third exam score.
        8.  Take input from the user using 'scan', expect a double, and store in 'third'.
        9.  Perform a calculation to figure out the total and store in 'total'.
        10. Perform a calculation to figure out the average and store in 'average'.
        11. Inform the user the total points, as a double, and the associated letter grade:
            A.  If the average is greater than or equal to 90.0% then display 'A'.
            B.  Else if the average is greater than or equal to 80.0% then display 'B'.
            C.  Else if average is greater than or equal to 70.0% then display 'C'.
            D.  Else if the average is greater than or equal to 60.0% then display 'D'.
            E.  Else, display 'F'.
*/
import java.util.Scanner; // Required to take input from the user

public class Grades {
    /** Gets three exam scores from the user (assume these are out of 100).  Calculate
    the total and determine the final letter grade. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("Enter three exam scores (out of 100) and the program will determine the final letter grade based on the following scale:");
        System.out.println("    If the average score is at least 90%, letter grade is A");
        System.out.println("    If the average score is between 80% and 89.99%, letter grade is B");
        System.out.println("    If the average score is between 70% and 79.99%, letter grade is C");
        System.out.println("    If the average score is between 60% and 69.99%, letter grade is D");
        System.out.println("    If the average score is less than 60%, letter grade is F");
        System.out.println();

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first value.
        System.out.print("Enter Exam 1 score: ");
        double first = scan.nextDouble();

        // Prompt the user for the second value.
        System.out.print("Enter Exam 2 score: ");
        double second = scan.nextDouble();

        // Prompt the user for the third value.
        System.out.print("Enter Exam 3 score: ");
        double third = scan.nextDouble();

        // Calculate the overall total and average.
        double total = (first + second + third);
        double average = (total / 3.0);

        // Inform the user the total and final letter grade.
        System.out.println("Exam Total: " + total);
        if (average >= 90.0) {
            System.out.println("Final Grade: A");
        } else if (average >= 80.0) {
            System.out.println("Final Grade: B");
        } else if (average >= 70.0) {
            System.out.println("Final Grade: C");
        } else if (average >= 60.0) {
            System.out.println("Final Grade: D");
        } else {
            System.out.println("Final Grade: F");
        }
        System.out.println();

    }
}
