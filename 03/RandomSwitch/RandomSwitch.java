/**
Name:   Craig Opie
Class:  ICS111
Date:   January 23rd, 2019
File:   RandomSwitch.java - Project 3.2

Problem:
Write a program that generates a random number between 1 and 9, and then uses a switch statement to print out the appropriate line of the "Monday's Child" Poem:
    1 (Monday): Monday's child is fair of face
    2 (Tuesday): Tuesday's child is full of grace
    3 (Wednesday): Wednesday's child is full of woe
    4 (Thursday): Thursday's child has far to go
    5 (Friday): Friday's child is loving and giving
    6 (Saturday): Saturday's child works hard for its living
    7 (Sunday): But the child that is born on the Sabbath day is bonny and blithe, and good and gay
    Any other number: Sorry, invalid number

Algorithm:
1)  Create a public class titled 'RandomSwitch'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will not take any arguments and will only be used to interface with the user, generate
        a random number and display the result.
        1.  Explain how the program works to the user.
        2.  Generate a random number between 1 and 9.
        3.  Show the user which random number was generated.
        4.  Utilize a switch to display the line of the poem correlating to 'num':
            A.  If 'num' is 1, display: Monday's child is fair of face.
            B.  If 'num' is 2, display: Tuesday's child is full of grace.
            C.  If 'num' is 3, display: Wednesday's child is full of woe.
            D.  If 'num' is 4, display: Thursday's child has far to go.
            E.  If 'num' is 5, display: Friday's child is loving and giving.
            F.  If 'num' is 6, display: Saturday's child works hard for its living.
            G.  If 'num' is 7, display: But the child that is born on the Sabbath day is bonny and blithe, and good and gay.
            H.  Otherwise, display: Sorry, invalid number.
*/
public class RandomSwitch {
    /** Program generates a random number between 1 and 9, and then uses a switch statement to print out the appropriate
    line of the "Monday's Child" Poem */
    public static void main(String[] args) {
        // Inform the user how to use the program.
        System.out.println("This program generates a random number between 1 and 9, and then uses a switch statement to print out the appropriate line of the 'Monday's Child' Poem.");

        // Create a Scanner object 'scan' for repeated use.
        int num = (int)(Math.random() * 9 + 1);

        // Show the user which number was generated.
        System.out.println("Random number is: " + num);

        // Display the line of the poem correlating to 'num'.
        switch (num) {
            case 1: System.out.println("Monday's child is fair of face"); break;
            case 2: System.out.println("Tuesday's child is full of grace"); break;
            case 3: System.out.println("Wednesday's child is full of woe"); break;
            case 4: System.out.println("Thursday's child has far to go"); break;
            case 5: System.out.println("Friday's child is loving and giving"); break;
            case 6: System.out.println("Saturday's child works hard for its living"); break;
            case 7: System.out.println("But the child that is born on the Sabbath day is bonny and blithe, and good and gay"); break;
            default: System.out.println("Sorry, invalid number");
        }
        System.out.println();
    }
}
