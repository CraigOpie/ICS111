/**
 * This class represents a Jaguar.  It inherrits from Animal and has additional variables and methods.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-19
 *
 */

/**
 * Creates a new Jaguar that can walk, lives in the Amazon river basin, and has 4 legs.
 */
public class Jaguar extends Animal {
    private double length;
    private double weight;
    private String name;
    private int age;

    /**
     * Specifies the Jaguar is 240.0 cm long, weights 100.0 kg, and is named 'Yaguar'.
     */
    public Jaguar() {
        super(true, false, true, "Amazon river basin", 4);
        this.length = 240.0;
        this.weight = 100.0;
        this.name = "Yaguar";
        this.age = 12;
    }

    /**
	 * Specifies more information about the Jaguar.
	 *
	 * @param len	Specifies the length of the Jaguar.
	 * @param wt	Specifies the weight of the Jaguar.
	 * @param nm	Specifies the name of the Jaguar.
	 * @param ag	Specifies the age of the Jaguar.
	 */
    public Jaguar(double len, double wt, String nm, int ag) {
        super(true, false, true, "Amazon river basin", 4);
        this.length = len;
        this.weight = wt;
        this.name = nm;
        this.age = ag;
    }

    /**
	 * Returns the length of the Jaguar.
	 *
	 * @return	The double value of the Jaguar's length.
	 */
	public double getLength() {
        return(this.length);
    }

    /**
	 * Returns the weight of the Jaguar.
	 *
	 * @return	The double value of the Jaguar's weight.
	 */
	public double getWeight() {
        return(this.weight);
    }

    /**
	 * Returns the name of the Jaguar.
	 *
	 * @return	The String value of the Jaguar's name.
	 */
	public String getName() {
        return(this.name);
    }

    /**
	 * Returns the age of the Jaguar.
	 *
	 * @return	The int value of the Jaguar's age.
	 */
	public int getAge() {
        return(this.age);
    }

    /**
	 * Sets the length of the Jaguar.
	 *
	 * @param len	Specifies the lenght of the Jaguar.
	 */
    public void setLength(double len) {
        this.length = len;
    }

    /**
	 * Sets the weight of the Jaguar.
	 *
	 * @param wt	Specifies the weight of the Jaguar.
	 */
    public void setWeight(double wt) {
        this.weight = wt;
    }

    /**
	 * Sets the name of the Jaguar.
	 *
	 * @param nm	Specifies the name of the Jaguar.
	 */
    public void setName(String nm) {
        this.name = nm;
    }

    /**
	 * Sets the age of the Jaguar.
	 *
	 * @param ag	Specifies the age of the Jaguar.
	 */
    public void setAge(int ag) {
        this.age = ag;
    }

    /**
	 * Dipslay's information about the Jaguar's hunting skills.
	 */
	public void pounce() {
        System.out.println("I am pound-for-pound the strongest of all big cats and my name comes from the Native American word yaguar, which means 'he who kills with one leap'.");
    }

    /**
	 * Dipslay's information about the Jaguar's strength and love of climbing.
	 */
	public void climb() {
        System.out.println("I love climbing and am known for dragging my kills into a tree where it is safe to eat.");
    }

    /**
	 * Dipslay's the Jaguar's information.
     *
     * @return	The String information contained in Super and self.
	 */
	public String toString() {
        return (super.toString() + ". \nUnlike other cats, I do not avoid the water; in fact, I am a great swimmer and love to eat caimans (small alligator like animals)!");
    }
}
