/**
Name:   Craig Opie
Class:  ICS111
Date:   January 23rd, 2019
File:   Movies.java - Project 3.4

Problem:
Write a program that asks the user to select a movie (you may change the movie titles, but make sure one is still labeled as a matinee), snack, and number of people attending.  Your program should then calculate their total based on the following:
    Movie cost is $16 per person, but is $10 for the matinee option
    Popcorn is $8, soda is $4, and candy is $6
    Each person requires a ticket, and each person will get the same snack (ex. if there are 3 people and you choose popcorn, all three people will purchase popcorn).  You can assume that the user will correctly enter their selections (no invalid input).  Use if statements and/or switch statements as needed to calculate the total.

Your program should then print a summary including movie and snack, and the total cost.  Note that if the user selected either popcorn or candy, they are "eating" their snack, but if they chose the soda, they are "drinking" it.  Use the conditional operator to help you print the movie title and snack name right in your print statement.

Algorithm:
1)  Create a public class titled 'Movies'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to interface with the user, perform a calculation
        and display the result.
        1.  Create a Scanner object that will be used repeatedly.
        2.  Prompt the user for the movie they wish to see:
            A.  Store the user's choice as 'ticket'.
            B.  Assign ticket cost depending on if they are seeing a matinee, store in 'ticket_cost'.
            C.  Store the selected movie's title in 'movie_choice'.
        3.  Prompt the user for the type of snack they will order:
            A.  Store the user's choice as 'snack'.
            B.  Assign snack cost depending on what they selected, store in 'snack_cost'.
            C.  Store the selected snack's title in 'snack_choice'.
        4.  Prompt the user for the number of people attending and store in 'num'.
        5.  Calculate the 'total' amount based on 'num' times 'ticket_cost' plus 'num' times 'snack_cost'.
        6.  Inform the user how much money they will need.
*/
import java.util.Scanner; // Required to take input from the user

public class Movies {
    /** Determines the cost of seeing a movie. */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This is a program that determines the amount of money it costs to see a movie based on movie title, number of people attending, and snacks.");
        System.out.println();

        // Create a Scanner object 'scan' for repeated use.
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the movie they wish to see.
        System.out.println("Movie choices:");
        System.out.println("1. Aquaman");
        System.out.println("2. A Dog's Way Home");
        System.out.println("3. Mary Poppins Returns (matinee)");
        System.out.print("Select movie (1/2/3): ");
        int ticket = scan.nextInt();
        double ticket_cost = ((ticket == 3) ? 10.00 : 16.00);
        String movie_choice = ((ticket == 1) ? "Aquaman" : ((ticket == 2) ? "A Dog's Way Home" : "Mary Poppins Returns"));

        // Prompt the user for the type of snack.
        System.out.println();
        System.out.println("Snack choices:");
        System.out.println("1. Popcorn");
        System.out.println("2. Soda");
        System.out.println("3. Candy");
        System.out.print("Select snack (1/2/3): ");
        int snack = scan.nextInt();
        double snack_cost = ((snack == 1) ? 8.00 : ((snack == 2) ? 4.00 : 6.00));
        String snack_choice = ((snack == 1) ? "eating popcorn." : ((snack == 2) ? "drinking soda." : "eating candy."));

        // Prompt the user for the number of people attending.
        System.out.println();
        System.out.print("Number of people: ");
        int num = scan.nextInt();

        // Determine the amount the user will have to pay.
        double total = (ticket_cost * num) + (snack_cost * num);

        // Inform the user the results.
        System.out.println();
        System.out.println("You will be seeing " + movie_choice + " and " + snack_choice);
        System.out.print("Your total is: $" + total);
        System.out.println();
    }
}
