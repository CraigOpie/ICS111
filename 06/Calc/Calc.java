/**
Name:   Craig Opie
Class:  ICS111
Date:   February 19th, 2019
File:   Calc.java - Project 6.2

Problem:
Write a program that acts as a simple calculator.  First, allow the user to choose the option to "add", "subtract", "multiply", or "divide".  Then get two numbers from the user.  Depending on which option they chose, you will either add or multiply the two numbers together, subtract the second number from the first, or divide the first number into the second.  You will need the following methods:
    public static void add(double num1, double num2)
    public static void subtract(double num1, double num2)
    public static double multiply(double num1, double num2)
    public static double divide(double num1, double num2)
The add() and subtract() methods return void, so the result of adding or subtracting the numbers should be displayed from within those methods.  The multiply() and divide() methods should return the actual result of multiplying or dividing the numbers, so your main() method should take care of displaying the result.

Algorithm:
1)  Create a public class titled 'Calc'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will not take any arguments and will only be used to interface with the user and display the result.
        1.  Explain how the program works to the user.
        2.  Creates a 'Scanner' object and named 'scan'.
        3.  Create variables to store user input:
            A.  String type 'raw' is used to allow string conversion to character.
            B.  Char type 'choice' is used for a convienient use in the switch statement.
            C.  Double type 'number1' is used to store the first value.
            D.  Double type 'number2' is used to store the second value.
        4.  Create a loop that allows the user to continuously provide input and get a result until the user exits the loop.
            A.  Display choices for user and request input to store in 'raw'.
            B.  If 'raw' equals "quit" exit the loop.
            C.  Else store the first character of 'raw' in 'choice'.
            D.  Prompt the user for the first value and store in 'number1'.
            E.  Prompt the user for the second value and store in 'number2'.
            C.  Utilize a switch to direct the program to perform the chosen method:
                a.  If 'choice' is 1, call method 'add()'.
                b.  If 'choice' is 2, call method 'subtract()'.
                c.  If 'choice' is 3, print the value returned when calling method 'multiply'.
                d.  If 'choice' is 4, print the value returned when calling method 'divide'.
                e.  Otherwise, display: Sorry, invalid choice.
    B)  Create a public method that does not return a value (void) and performs addition:
        1.  Print the sum of num1 and num2.
    C)  Create a public method that does not return a value (void) and performs subtraction:
        1.  Print the difference of num1 and num2.
    D)  Create a public method that returns a double and performs multiplication:
        1.  Print the product of num1 and num2.
    E)  Create a public method that returns a double and performs division:
        1.  Print the quotient of num1 and num2.
*/
import java.util.Scanner; // Required for user input

public class Calc {
    /** Program takes user input and then uses a switch statement to perform the correct method */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program is a calculator designed to perform arithmatic using two numbers");

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Create a variable to store user input.
        String raw = "";
        char choice = '1';
        double number1 = 1;
        double number2 = 2;

        // Create a loop that allows continuous input by a user until the user chooses to exit by entering "quit".
        while (true) {
            // Provide a message and input for the user.
            System.out.println("Calculator choices:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.print("Select choice ('quit' to exit): ");
            raw = scan.nextLine();

            // Exit the loop if the user enters "quit".
            if (raw.equals("quit")) {
                break;
            } else {
                choice = raw.charAt(0);
            }

            // Provide a message and input for the user.
            System.out.print("Enter first number: ");
            number1 = scan.nextDouble();
            scan.nextLine();  // moves the scanner to the appropriate line.

            // Provide a message and input for the user.
            System.out.print("Enter second number: ");
            number2 = scan.nextDouble();
            scan.nextLine();  // moves the scanner to the appropriate line.

            // Provide space for better readability.
            System.out.println();

            // Perform the appropriate method.
            switch ((int)choice) {
                case 49: add(number1, number2); break;
                case 50: subtract(number1, number2); break;
                case 51: System.out.println(multiply(number1, number2)); break;
                case 52: System.out.println(divide(number1, number2)); break;
                default: System.out.println("Sorry, invalid choice");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void add(double num1, double num2) {
        /** This method prints the sum of two numbers */
        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(num1 + num2);
    }
    public static void subtract(double num1, double num2) {
        /** This method prints the difference of two numbers */
        System.out.print(num1 + " - " + num2 + " = ");
        System.out.println(num1 - num2);
    }
    public static double multiply(double num1, double num2) {
        /** This method returns the product of two numbers */
        System.out.print(num1 + " * " + num2 + " = ");
        return(num1 * num2);
    }
    public static double divide(double num1, double num2) {
        /** This method returns the quotient of two numbers */
        System.out.print(num1 + " / " + num2 + " = ");
        return(num1 / num2);
    }
}
