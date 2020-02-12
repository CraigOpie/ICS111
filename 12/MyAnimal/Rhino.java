/**
 * This class represents a Rhino.  It inherrits from Animal and has additional variables and methods.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-19
 *
 */

/**
 * Creates a new Rhino that can walk, lives in grassy plains, rainforests, and swamps, and has 4 legs.
 */
public class Rhino extends Animal {
    private double length;
    private double weight;
    private String name;
    private int speed;

    /**
     * Specifies the Rhino is 350.0 cm long, weights 2000.0 kg, and is named 'Javan'.
     */
    public Rhino() {
        super(true, false, true, "Grassy plains, rainforests, and swamps", 4);
        this.length = 350.0;
        this.weight = 2000.0;
        this.name = "Javan";
        this.speed = 55;
    }

    /**
	 * Specifies more information about the Rhino.
	 *
	 * @param len	Specifies the length of the Rhino.
	 * @param wt	Specifies the weight of the Rhino.
	 * @param nm	Specifies the name of the Rhino.
	 * @param spd	Specifies the speed of the Rhino.
	 */
    public Rhino(double len, double wt, String nm, int spd) {
        super(true, false, true, "Grassy plains, rainforests, and swamps", 4);
        this.length = len;
        this.weight = wt;
        this.name = nm;
        this.speed = spd;
    }

    /**
	 * Returns the length of the Rhino.
	 *
	 * @return	The double value of the Rhino's length.
	 */
	public double getLength() {
        return(this.length);
    }

    /**
	 * Returns the weight of the Rhino.
	 *
	 * @return	The double value of the Rhino's weight.
	 */
	public double getWeight() {
        return(this.weight);
    }

    /**
	 * Returns the name of the Rhino.
	 *
	 * @return	The String value of the Rhino's name.
	 */
	public String getName() {
        return(this.name);
    }

    /**
	 * Returns the speed of the Rhino.
	 *
	 * @return	The int value of the Rhino's speed.
	 */
	public int getSpeed() {
        return(this.speed);
    }

    /**
	 * Sets the length of the Rhino.
	 *
	 * @param len	Specifies the lenght of the Rhino.
	 */
    public void setLength(double len) {
        this.length = len;
    }

    /**
	 * Sets the weight of the Rhino.
	 *
	 * @param wt	Specifies the weight of the Rhino.
	 */
    public void setWeight(double wt) {
        this.weight = wt;
    }

    /**
	 * Sets the name of the Rhino.
	 *
	 * @param nm	Specifies the name of the Rhino.
	 */
    public void setName(String nm) {
        this.name = nm;
    }

    /**
	 * Sets the speed of the Rhino.
	 *
	 * @param spd	Specifies the speed of the Rhino.
	 */
    public void setSpeed(int spd) {
        this.speed = spd;
    }

    /**
	 * Dipslay's information about the Rhino's poop.
	 */
	public void poop() {
        System.out.println("Believe it or not, I mark my territory and communicate with other rhinos using pongy piles of poop; moreover, each rhino's poop has a unique smell.");
    }

    /**
	 * Dipslay's information about the Rhino's running speed.
	 */
	public void run() {
        System.out.println("Look out! I can run up to " + this.speed + " km/hour!");
    }

    /**
	 * Dipslay's the Rhino's information.
     *
     * @return	The String information contained in Super and self.
	 */
	public String toString() {
        return (super.toString() + ". \nBecause of my huge body, strong horns, and thick skin, I have no natural predators!");
    }
}
