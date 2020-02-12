/**
 * This class represents a generic animal.  An animal can possibly walk, fly, and/or swim,
 * has a particular habitat, and has a number of legs.  An animal can also eat a given food.
 *
 * @author Laura Sue
 *
 */
public class Animal {
	private boolean canWalk;
	private boolean canFly;
	private boolean canSwim;
	private String habitat;
	private int numLegs;

	/**
	 * Creates a new Animal that can walk, lives in the jungle, and has 4 legs.
	 */
	public Animal() {
		this.canWalk = true;
		this.canFly = false;
		this.canSwim = false;
		this.habitat = "Jungle";
		this.numLegs = 4;
	}

	/**
	 * Creates a new Animal.
	 *
	 * @param w		Whether or not the animal can walk.
	 * @param f		Whether or not the animal can fly.
	 * @param s		Whether or not the animal can swim.
	 * @param h		The animal's habitat.
	 * @param n		The animal's number of legs.
	 */
	public Animal(boolean w, boolean f, boolean s, String h, int n) {
		this.canWalk = w;
		this.canFly = f;
		this.canSwim = s;
		this.habitat = h;
		this.numLegs = n;
	}

	/**
	 * Eats a given food.
	 *
	 * @param food	The food to eat.
	 */
	public void eat(String food) {
		System.out.println("Yum yum, just ate " + food);
	}

	/**
	 * Sets whether or not the animal can walk.
	 *
	 * @param w		Whether or not the animal can walk.
	 */
	public void setCanWalk(boolean w) {
		this.canWalk = w;
	}

	/**
	 * Sets whether or not the animal can fly.
	 *
	 * @param f		Whether or not the animal can fly.
	 */
	public void setCanFly(boolean f) {
		this.canFly = f;
	}

	/**
	 * Sets whether or not the animal can swim.
	 *
	 * @param s		Whether or not the animal can swim.
	 */
	public void setCanSwim(boolean s) {
		this.canSwim = s;
	}

	/**
	 * Sets the animal's habitat.
	 *
	 * @param h		The animal's habitat.
	 */
	public void setHabitat(String h) {
		this.habitat = h;
	}

	/**
	 * Sets the animal's number of legs.
	 *
	 * @param n		The animal's number of legs.
	 */
	public void setNumLegs(int n) {
		this.numLegs = n;
	}

	/**
	 * Returns whether or not the animal can walk.
	 *
	 * @return	True if the animal can walk, otherwise false.
	 */
	public boolean getCanWalk() {
		return this.canWalk;
	}

	/**
	 * Returns whether or not the animal can fly.
	 *
	 * @return	True if the animal can fly, otherwise false.
	 */
	public boolean getCanFly() {
		return this.canFly;
	}

	/**
	 * Returns whether or not the animal can swim.
	 *
	 * @return	True if the animal can swim, otherwise false.
	 */
	public boolean getCanSwim() {
		return this.canSwim;
	}

	/**
	 * Gets the animal's habitat.
	 *
	 * @return	The animal's habitat.
	 */
	public String getHabitat() {
		return this.habitat;
	}

	/**
	 * Gets the number of legs the animal has.
	 *
	 * @return	The animal's number of legs.
	 */
	public int getNumLegs() {
		return this.numLegs;
	}

	/**
	 * Dipslay's the animal's information.
	 */
	public String toString() {
		return "This animal " +
				(this.canFly ? "can fly, " : "can't fly, ") +
				(this.canSwim ? "can swim, " : "can't swim, ") +
				(this.canWalk ? "can walk, " : "can't walk, ") +
				"lives in the " + this.habitat + ", and has " + this.numLegs + " leg(s)";
	}
}
