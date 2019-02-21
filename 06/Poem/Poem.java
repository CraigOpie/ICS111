/**
Name:   Craig Opie
Class:  ICS111
Date:   February 19th, 2019
File:   Poem.java - Project 6.1

Problem:
Modify your solution from Project 5.1 (the "Monday's Child" poem) to create a method that will take in the number entered by the user, and then print out the appropriate line/message.  You should still have a while loop that will continue to prompt the user for a number until they enter 0 to stop.  Use the following method header:

public static void printLine(int number)

For example, if the user enters the number 5, you will pass it in to the printLine() method, and the line "Friday's child is loving and giving" should be displayed by the method.  The method will not return anything.  The while loop in your main() method should still be getting the user input, and should call your printLine() method.  The printLine() method should just decide which line to print.

Algorithm:
1)  Create a public class titled 'Poem'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will not take any arguments and will only be used to interface with the user and display the result.
        1.  Explain how the program works to the user.
        2.  Creates a 'Scanner' object and named 'scan'.
        3.  Create a variable to store user input in 'num'.
        4.  Create a loop that allows the user to continuously provide input and get a result until the user exits the loop.
            A.  Request input from the user and store in 'num'.
            B.  If 'num' equals "0" exit the loop.
            C.  Call the function 'printLine' and pass the users input as the argument.
    B)  Create a public method that does not return a value (void) that is used to print the appropriate line of "Monday's Child"
        Poem.  Method takes an int argument to use for a switch statement.
        1.  Utilize a switch to display the line of the poem correlating to 'num':
            A.  If 'num' is 1, display: Monday's child is fair of face.
            B.  If 'num' is 2, display: Tuesday's child is full of grace.
            C.  If 'num' is 3, display: Wednesday's child is full of woe.
            D.  If 'num' is 4, display: Thursday's child has far to go.
            E.  If 'num' is 5, display: Friday's child is loving and giving.
            F.  If 'num' is 6, display: Saturday's child works hard for its living.
            G.  If 'num' is 7, display: But the child that is born on the Sabbath day is bonny and blithe, and good and gay.
            H.  Otherwise, display: Sorry, invalid number.
*/
import java.util.Scanner; // Required for user input

public class Poem {
    /** Program takes user input and then uses a switch statement to print out the appropriate line of "Monday's Child" Poem */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program takes user input and then uses a switch statement to print out the appropriate line of the 'Monday's Child' Poem.");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Create a variable to store user input.
        int num = 1;

        // Create a loop that allows continuous input by a user until the user chooses to exit by entering "0".
        while (true) {
            // Provide a message and input for the user.
            System.out.print("Enter a number (0 to quit): ");
            num = scan.nextInt();

            // Exit the loop if the user enters "0".
            if (num == 0) {
                break;
            }
            printLine(num);
        }
        System.out.println();
    }

    public static void printLine(int number) {
        // Display the line of the poem correlating to 'number'.
        switch (number) {
            case 1: System.out.println("Monday's child is fair of face"); break;
            case 2: System.out.println("Tuesday's child is full of grace"); break;
            case 3: System.out.println("Wednesday's child is full of woe"); break;
            case 4: System.out.println("Thursday's child has far to go"); break;
            case 5: System.out.println("Friday's child is loving and giving"); break;
            case 6: System.out.println("Saturday's child works hard for its living"); break;
            case 7: System.out.println("But the child that is born on the Sabbath day is bonny and blithe, and good and gay"); break;
            default: System.out.println("Sorry, invalid number");
        }
    }
}
