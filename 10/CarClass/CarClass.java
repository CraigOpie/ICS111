/**
Name:   Craig Opie
Class:  ICS111
Date:   March 13th, 2019
File:   CarClass.java - Project 9.2


Problem:
Design a class named Car to represent a car.  The class should have the following data fields (name each data field appropriately):
A private string data field to specify the make of the car (the default is "Make")
A private string data field to specify the model of the car (the default is "Model")
A private int data field to specify the year of the car (the default is 2019)
A private double data field to specify the cost of the car (the default is 30,000)
A private string data field to specify the color of the car (the default is "White")
The class should have the following methods:

Accessor and mutator methods for all data fields
A no-arg constructor that creates a default car
A constructor that takes in values for all five data fields and sets them
A method named toString() that returns a string description for the car
Draw the UML diagram for the Car class and implement the class.  Write a test program (separate class, but can be in the same file) that creates two cars:

Car 1
Create this car using the no-arg constructor
Use the appropriate mutator method to set the car's make to "Toyota"
Use the appropriate accessor method to display the car's new make value
Use the appropriate mutator method to set the car's model to "Highlander"
Use the appropriate accessor method to display the car's new model value
Use the appropriate mutator method to set the car's cost to $31,695
Use the appropriate accessor method to display the car's new cost value
Car 2
Create this car using the constructor that accepts values
Make: Kia
Model: Optima
Year: 2019
Cost: $22,500
Color: Red
Print out the values for Car 2 using the toString() method


Algorithm:
1)  Create a public class titled 'CarClass'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will be used to interface with the user and display the result.
        1.  Create an instance of the Car class named object1.
        2.  Create an instance of the Car class named object2.
        3.  Show the user the details about object1.
        4.  Show the user the details about object2.
    B)  Create a public static class name 'Car'.
        1.  Declare class wide constants.
        2.  Declare and initialize class wide variables.
        3.  Create the user specified constructor method for the class.
        4.  Create the default constructor method for the class.
        5.  Create class wide variables getter and setter methods.
        6.  Create a method to return all details about the object.
*/

public class CarClass {
    /** Program used to create Car objects with details about the objects */

    public static void main(String[] args) {
        /** Main method creates two Car objects, no-arg constructor and user specified constructor, then displays details about each of the objects for the user. */

        // Create two Fan objects
        Car object1 = new Car();
        Car object2 = new Car("Kia", "Optima", 2019, 22500, "Red");

        // Change details about object1 and display them to the user
        object1.setMake("Toyota");
        System.out.println(object1.getMake());
        object1.setModel("Highlander");
        System.out.println(object1.getModel());
        object1.setCost(31695);
        System.out.println(object1.getCost());

        // Display details about object2 for the user
        System.out.println(object2.toString());
        System.out.println();
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
