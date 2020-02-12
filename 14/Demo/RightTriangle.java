/**
 * <h1>Right Triangle</h1>
 * This class is used to create a right triangle object that is a subclass of GeometricObject and implements Comparable.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-21
 *
 */
import java.lang.Math; // Required for squareroot and square functions

/**
 * <h2>RightTriangle Class</h2>
 * Creates a right triangle object that is a subclass of GeometricObject and implements Comparable.
 *
 * @param height   Double used to specify sin value.
 * @param width    Double used to specify cos value.
 *
 */
class RightTriangle extends GeometricObject implements Comparable {
    private double width;
    private double height;

    /**
     * <h2>RightTriangle()</h2>
     * Creates a right triangle object.
     * Default constructor is set to cos = 1.0 and sin = 1.0.
     */
    public RightTriangle() {
        this(1.0,1.0);
    }

    /**
     * <h2>RightTriangle(args)</h2>
     * Creates a right triangle object.
     *
     * @param height   Double used to specify sin value.
     * @param width    Double used to specify cos value.
     *
     */
    public RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * <h2>getWidth()</h2>
     * Returns the width of the Triangle.
     *
     * @return width   Double used to specify cos value.
     *
     */
    public double getWidth() {
        return(this.width);
    }

    /**
     * <h2>getHeight()</h2>
     * Returns the height of the Triangle.
     *
     * @return height   Double used to specify sin value.
     *
     */
    public double getHeight() {
        return(this.height);
    }

    /**
     * <h2>setWidth()</h2>
     * Modify the width of the Triangle.
     *
     * @param width   Double used to specify cos value.
     *
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * <h2>setHeight()</h2>
     * Modify the height of the Triangle.
     *
     * @param height   Double used to specify sin value.
     *
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * <h2>getArea()</h2>
     * Calcaulate the overall area of the right Triangle.
     *
     * @return area   (Height * Width)/2.
     *
     */
    public double getArea() {
        return(this.width*this.height/2);
    }

    /**
     * <h2>getPerimeter()</h2>
     * Calcaulate the overall perimeter of the right Triangle.
     *
     * @return perimeter   sqrt(a^2 + b^2) + width + height.
     *
     */
    public double getPerimeter() {
        return(Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0)) + this.width + this.height);
    }

    /**
     * <h2>compareTo(args)</h2>
     * Compare to objects to see which is larger.
     *
     * @param obj       Item to compare with.
     * @return status   1 if root object is larger, -1 if smaller, or 0 if equal.
     *
     */
    public int compareTo(Object obj) {
        if (this.getArea() > ((RightTriangle)obj).getArea()) {
            return 1;
        }
        else if (this.getArea() < ((RightTriangle)obj).getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    /**
     * <h2>equals(args)</h2>
     * Compare to objects to see if they are equal..
     *
     * @param obj        Item to compare with.
     * @return boolean   Returns either true of ralse.
     *
     */
    public boolean equals(Object obj) {
        return (this.getArea() == ((RightTriangle)obj).getArea());
    }
}
