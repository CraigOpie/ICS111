/**
Name:   Craig Opie
Class:  ICS111
Date:   March 31st, 2019
File:   Dealership.java - Project 10.1


Problem:
Use your Car class from the previous Programming Assignment.  For this assignment, create a new class that represents a Used Car Dealership.  Your program will simulate an inventory system for the dealership, where the employees can manage the car information.  Start by creating an array of 10 cars, with an "ID" of 0 through 9, and use the default constructor to create each car.

*/
import java.util.Scanner; // Required for user input

public class Dealership {
    /** Program used to inventory vehicles for a car dealership */

    // Global Variable
    static Scanner scan = new Scanner(System.in);  // Create a Scanner object 'scan' for repeated user input

    public static void main(String[] args) {
        // Inform the user about this program
        System.out.println("This program is used to manage a car dealership's inventory.");
        System.out.println();

        // Create a new array of 10 Cars
        Car[] dealership = new Car[10];

        // Populate the array with Car objects using default constructors
        for (int i = 0; i < 10; i++) {
            dealership[i] = new Car();
        }

        // Create a loop for the user to interface with
        boolean condition = true;
        while(condition) {
            System.out.print("Please select the vehicle inventory number you want to view (0-9): ");
            int index = scan.nextInt();
            System.out.println();

            // Filter the users choices to make sure it is valid
            if(index >= 0 && index < 10) {
                int choice = 0;
                while(choice != 7) { // Exit if the user chooses 7
                    // Display a menu for the user
                    System.out.println("1. Set Make");
                    System.out.println("2. Set Model");
                    System.out.println("3. Set Year");
                    System.out.println("4. Set Cost");
                    System.out.println("5. Set Color");
                    System.out.println("6. Display Car Intormation");
                    System.out.println("7. Exit, and chose new car ID");
                    System.out.println();
                    System.out.print("Enter Selection (0-7): ");
                    choice = scan.nextInt();

                    // Perform a method based on the users choice
                    switch (choice) {
                        case 1:  System.out.print("Enter new make: ");
                                 String make = scan.next();
                                 dealership[index].setMake(make);
                                 System.out.println();
                                 break;
                        case 2:  System.out.print("Enter new model: ");
                                 String model = scan.next();
                                 dealership[index].setModel(model);
                                 System.out.println();
                                 break;
                        case 3:  System.out.print("Enter new year: ");
                                 int year = scan.nextInt();
                                 dealership[index].setYear(year);
                                 System.out.println();
                                 break;
                        case 4:  System.out.print("Enter new cost: ");
                                 double cost = scan.nextDouble();
                                 dealership[index].setCost(cost);
                                 System.out.println();
                                 break;
                        case 5:  System.out.print("Enter new color: ");
                                 String color = scan.next();
                                 dealership[index].setColor(color);
                                 System.out.println();
                                 break;
                        case 6:  System.out.print(dealership[index].toString());
                                 System.out.println();
                                 System.out.println();
                                 break;
                        default: System.out.println();
                                 break;
                    }
                }
            } else {
                // Create a way to exit the program
                if (index == 99) {
                    condition = false;
                    break;
                }

                // Create an easter egg that allows viewing the entire inventory at one time
                if (index == 103) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(dealership[i].toString());
                        System.out.println();
                    }
                }
                System.out.println("Please chose a value that is between 0 and 9 (99 to quit).");
            }
        }
    }

    public static class Car {
        /** Fan object that has make, model, year, cost, and color parameters */

        // Class Variables
        private String car_make;
        private String car_model;
        private int car_year;
        private double car_cost;
        private String car_color;

        // Class User Specified Constructor
        public Car(String make, String model, int year, double cost, String color) {
            this.car_make = make;
            this.car_model = model;
            this.car_year = year;
            this.car_cost = cost;
            this.car_color = color;
        }

        // Class Default Constructor
        public Car() {
            this.car_make = "Make";
            this.car_model = "Model";
            this.car_year = 2019;
            this.car_cost = 30000;
            this.car_color = "White";
        }

        // Change make
        public void setMake(String make) {
            this.car_make = make;
        }
        // Change model
        public void setModel(String model) {
            this.car_model = model;
        }
        // Change year
        public void setYear(int year) {
            this.car_year = year;
        }
        // Change cost
        public void setCost(double cost) {
            this.car_cost = cost;
        }
        // Change color
        public void setColor(String color) {
            this.car_color = color;
        }


        // Return make
        public String getMake() {
            return(this.car_make);
        }
        // Return model
        public String getModel() {
            return(this.car_model);
        }
        // Return year
        public int getYear() {
            return(this.car_year);
        }
        // Return cost
        public double getCost() {
            return(this.car_cost);
        }
        // Return color
        public String getColor() {
            return(this.car_color);
        }

        // Return all of the parameters for the object in a string format
        public String toString() {
            // If the fan is on
            return ("Make: " + this.car_make + "\nModel: " + this.car_model + "\nYear: " + this.car_year + "\nCost: $" + this.car_cost + "\nColor: " + this.car_color);
        }
    }
}
