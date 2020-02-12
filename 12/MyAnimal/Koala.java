/**
 * This class represents a Koala.  It inherrits from Animal and has additional variables and methods.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-19
 *
 */

/**
 * Creates a new Koala that can walk, lives in a eucalyptus forest, and has 4 legs.
 */
public class Koala extends Animal {
    private double length;
    private double weight;
    private String name;

    /**
     * Specifies the Koala is 75.5 cm long, weights 14.0 kg, and is named 'Joey'.
     */
    public Koala() {
        super(true, false, true, "Eucalyptus Forests", 4);
        this.length = 75.5;
        this.weight = 14.0;
        this.name = "Joey";
    }

    /**
	 * Specifies more information about the Koala.
	 *
	 * @param len	Specifies the length of the Koala.
	 * @param wt	Specifies the weight of the Koala.
	 * @param nm	Specifies the name of the Koala.
	 */
    public Koala(double len, double wt, String nm) {
        super(true, false, true, "Eucalyptus Forests", 4);
        this.length = len;
        this.weight = wt;
        this.name = nm;
    }

    /**
	 * Returns the length of the Koala.
	 *
	 * @return	The double value of the Koala's length.
	 */
	public double getLength() {
        return(this.length);
    }

    /**
	 * Returns the weight of the Koala.
	 *
	 * @return	The double value of the Koala's weight.
	 */
	public double getWeight() {
        return(this.weight);
    }

    /**
	 * Returns the name of the Koala.
	 *
	 * @return	The String value of the Koala's name.
	 */
	public String getName() {
        return(this.name);
    }

    /**
	 * Sets the length of the Koala.
	 *
	 * @param len	Specifies the lenght of the Koala.
	 */
    public void setLength(double len) {
        this.length = len;
    }

    /**
	 * Sets the weight of the Koala.
	 *
	 * @param wt	Specifies the weight of the Koala.
	 */
    public void setWeight(double wt) {
        this.weight = wt;
    }

    /**
	 * Sets the name of the Koala.
	 *
	 * @param nm	Specifies the name of the Koala.
	 */
    public void setName(String nm) {
        this.name = nm;
    }

    /**
	 * Dipslay's information about the Koala's sleeping patterns.
	 */
	public void sleep() {
        System.out.println("Yawn, I just slept 18 hours!");
    }

    /**
	 * Dipslay's information about the Koala's drinking routine.
	 */
	public void drink() {
        System.out.println("No thanks! My name is Aboriginal and means 'no drink' because I get almost all of my moisture from the eucalyptus leaves I eat.");
    }

    /**
	 * Dipslay's the Koala's information.
     *
     * @return	The String information contained in Super and self.
	 */
	public String toString() {
        return (super.toString() + ". \nSadly, around 80% of my habitat has been lost to human homes, drought, and forest fires.");
    }
}
