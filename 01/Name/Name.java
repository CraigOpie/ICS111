/**
Name:   Craig Opie
Class:  ICS111
Date:   January 14th, 2019
File:   Name.java - Project 1.1

Problem:
Write a program that displays your name in four lines, using multiple
lines of each character to write a larger letter (as best you can).
You can use more lines if you need more vertical space, but not fewer
than 4 lines.

Algorithm:
1)  Create a public class titled 'Name'.
    A)  Create a public method that does not return a value (void) that is
        used as the 'main' method.  The method will not take any arguments
        and will only be used to display a String.
        1.  Use the System.out class to print characters on each line that
            that represent the letter of the name.  See below:
               CCC    RRRR       A      IIIII     GGG
             C       R  R      A A       I      G
            C       RRR      AAAAA      I      G
            C      R  R    A     A     I       G   GG
             CCC  R   R  A       A  IIIII       GGG G
*/

public class Name {
    /** Displays name using letter characters in terminal */
    public static void main(String[] args) {
        // Display the following lines of text in terminal
        System.out.println("   CCC    RRRR       A      IIIII     GGG");
        System.out.println(" C       R  R      A A       I      G");
        System.out.println("C       RRR      AAAAA      I      G");
        System.out.println("C      R  R    A     A     I       G   GG");
        System.out.println(" CCC  R   R  A       A  IIIII       GGG G");
        System.out.println();

    }
}
