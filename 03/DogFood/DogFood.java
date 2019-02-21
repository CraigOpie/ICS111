/**
Name:   Craig Opie
Class:  ICS111
Date:   January 23rd, 2019
File:   DogFood.java - Project 3.3

Problem:
Write a program that determines the amount and type of dog food to feed a dog, based on the dog's age and weight:
 	                      Less than one year      Between 1 and 7 years       Older than 7 years
Less than 5 lbs	          1/3 cup puppy food      1/3 cup adult food	      1/3 cup senior food
At least 5 lbs and
less than 20 lbs	      3/4 cup puppy food	  3/4 cup adult food	      3/4 cup senior food
At least 20 lbs and
less than 40 lbs	      1 cup puppy food	      1 cup adult food	          1 cup senior food
At least 40 lbs	          2 cups puppy food	      2 cups adult food	          2 cups senior food

You will probably need to use nested if statements and multi-way if-else statements to determine the type and amount
of dog food to feed the dog.

Algorithm:
1)  Create a public class titled 'Grades'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a comparison
        and display the result.
        1.  Explain how to use the program for the user.
        2.  Create a Scanner object that will be used repeatedly.
        3.  Prompt the user to enter the dog's age.
        4.  Take input from the user using 'scan', expect a double, and store in 'age'.
        5.  Prompt the user to enter the dog's weight.
        6.  Take input from the user using 'scan', expect a double, and store in 'weight'.
        7.  Perform a comparison to assign a String type value to the variable 'type':
            A.  If greater than 7 years old, assign 'senior'.
            B.  Else if greater than or equal to 1 year old, assign 'adult'.
            C.  Else assign 'puppy'.
        8.  Perform a comparison to assign a String type value to the variable 'amount':
            A.  If greater than or equal to 40 pounds, assign '2 cups'.
            B.  Else if greater than or equal to 20 pounds, assign '1 cup'.
            C.  Else if greater than or equal to 5 pounds, assign '3/4 cup'.
            D.  Else assign '1/2 cup'.
        9.  Inform the user the results.
*/
import java.util.Scanner; // Required to take input from the user

public class DogFood {
    /** Determines the amount and type of dog food to feed a dog, based on the dog's age and weight. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This is a program that determines the amount and type of dog food to feed a dog, based on the dog's age and weight.");
        System.out.println();

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the dog's age.
        System.out.print("Enter the dog's age: ");
        double age = scan.nextDouble();

        // Prompt the user for the dog's weight.
        System.out.print("Enter the dog's weight: ");
        double weight = scan.nextDouble();

        // Determine the amount and type of dog food to feed the dog.
        String type = ((age > 7.0) ? "senior" : ((age >= 1.0) ? "adult" : "puppy"));
        String amount = ((weight >= 40.0) ? "2 cups": ((weight >= 20.0) ? "1 cup" : ((weight >= 5.0) ? "3/4 cup" : "1/2 cup")));

        // Inform the user the results.
        System.out.println("Please feed your dog " + amount + " of " + type + " food");
        System.out.println();

    }
}
