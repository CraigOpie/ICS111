/**
Name:   Craig Opie
Class:  ICS111
Date:   March 11th, 2019
File:   FanClass.java - Project 9.1


Problem:
Follow along with The Fan Class VideoNote in REVEL.  You can find it under Project 9.8 in the "Programming Exercises From The Book" section, or by going to Table of Contents > Welcome > VideoNotes > Chapter 9 Objects and Classes > The Fan Class.  The video will walk you through creating a class to represent a fan.  It will also show you how to test the Fan class to ensure that it's working as expected.  In addition to your Java class, create a UML diagram that represents the Fan class.  Submit the UML diagram and the Java file you create while following along with the video.


Algorithm:
1)  Create a public class titled 'FanClass'.
    A)  Create a public method that does not return a value (void) that is used as the 'main' method.
        The method will be used to interface with the user and display the result.
        1.  Create an instance of the Fan class named object1.
        2.  Create an instance of the Fan class named object2.
        3.  Change the fan status for object1 to On.
        4.  Show the user the details about object1.
        5.  Show the user the details about object2.
    B)  Create a public static class name 'Fan'.
        1.  Declare class wide constants.
        2.  Declare and initialize class wide variables.
        3.  Create the default constructor method for the class.
        4.  Create a method to change the fan speed variable.
        5.  Create a method to change the fan power variable.
        6.  Create a method to change the fan blade radius.
        7.  Create a method to change the fan's color.
        8.  Create class wide variables getter and setter methods.
        9.  Create a method to return all details about the object.
*/

public class FanClass {
    /** Program used to create Fan objects with details about the objects */

    public static void main(String[] args) {
        /** Main method creates two Fan objects, turns the first fan on, then displays
        details about each of the objects for the user. */

        // Create two Fan objects
        Fan object1 = new Fan(3, 10, "yellow");
        Fan object2 = new Fan(2, 5, "blue");

        // Turn on the first fan
        object1.setOn(true);

        // Display details about the objects for the user
        System.out.println(object1.toString());
        System.out.println(object2.toString());
    }

    public static class Fan {
        /** Fan object that has speed, power status, radius, and color parameters */

        // Class Constants
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        // Class Variables
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        // Class Default Constructor
        public Fan(int fan_speed, double fan_radius, String fan_color) {
            this.speed = fan_speed;
            this.radius = fan_radius;
            this.color = fan_color;
        }

        // Change fan speed
        public void setSpeed(int fan_speed) {
            this.speed = fan_speed;
        }
        // Turn on and off power
        public void setOn(boolean fan_power) {
            this.on = fan_power;
        }
        // Change fan radius
        public void setRadius(int fan_radius) {
            this.radius = fan_radius;
        }
        // Change fan color
        public void setColor(String fan_color) {
            this.color = fan_color;
        }


        // Return fan speed
        public int getSpeed() {
            return(this.speed);
        }
        // Return the status of power
        public boolean getOn() {
            return(this.on);
        }
        // Return the fan radius
        public double getRadius() {
            return(this.radius);
        }
        // Return the fan color
        public String getColor() {
            return(this.color);
        }

        // Return all of the parameters for the object in a string format
        public String toString() {
            // Stores a string value for fan speed from int
            String temp = ((this.speed == this.SLOW) ? "slow" : (this.speed == this.MEDIUM) ? "medium" : "fast");

            // If the fan is on
            if (this.on) {
                return ("Fan Speed: " + temp + ", Color: " + this.color + ", and Radius: " + this.radius);
            }
            // if the fan is off
            else {
                return("Fan Color: " + temp + ", and Radius: " + this.radius + ".  The fan is off.");
            }
        }
    }
}
