/**
 * <h1>My Animal</h1>
 * This class creates multiple animals each named after a member of my family.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-19
 *
 */

/**
 * Creates six animals that have unique attributes and tests implementation of super and child classes.
 */
public class MyAnimal {
public static void main(String[] args) {
         // Inform the user about this program
         System.out.println("This program is used to create three specific animal subclasses.");
         System.out.println();

         // Create a new Koala named Kailani that has default parameters
         Koala kailani = new Koala();
         kailani.setName("Kailani");
         kailani.sleep();

         // Create a new Koala named Carter that has very distinct parameters
         Koala carter = new Koala(25.0, 7.5, "Carter");
         carter.drink();
         System.out.println(carter.toString());

         // Create a new Rhino named Bruce that has a max speed of 50 km/hour
         Rhino bruce = new Rhino();
         bruce.setName("Bruce");
         bruce.setSpeed(50);
         bruce.poop();

         // Create a new Rhino named Noa that has very distinct parameters
         Rhino noa = new Rhino(300.0, 1738.0, "Noa", 49);
         noa.run();
         System.out.println(noa.toString());

         // Create a new Jaguar named Craig that is 10 years old
         Jaguar craig = new Jaguar();
         craig.setName("Craig");
         craig.setAge(10);
         craig.pounce();

         // Create a new Jaguar named Janelle that is 13 years old and has very specific parameters
         Jaguar janelle = new Jaguar(200.0, 75.5, "Janelle", 13);
         janelle.climb();
         System.out.println(janelle.toString());
     }
 }
