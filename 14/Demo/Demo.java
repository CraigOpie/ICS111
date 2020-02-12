/**
 * <h1>Demo</h1>
 * This class is used to create objects that are a subclass of GeometricObject and implements Comparable.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-21
 *
 */
 public class Demo {
    public static void main(String[] args) {
        // Inform the user about this program
        System.out.println("This program creates new objects that are a subclass of GeometricObject and implements Comparable.  These objects are then tested to ensure their methods work correctly.");
        System.out.println();

        // Creates and tests new Rectangle1 objects
        Rectangle1 obj1 = new Rectangle1();
        Rectangle1 obj2 = new Rectangle1(12, 55);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));
        System.out.println();

        // Creates and tests new RightTriangle objects
        RightTriangle obj3 = new RightTriangle(7, 8);
        RightTriangle obj4 = new RightTriangle(3, 4);
        System.out.println(obj3.getArea());
        System.out.println(obj3.getPerimeter());
        System.out.println(obj4.getArea());
        System.out.println(obj4.getPerimeter());
        System.out.println(obj3.equals(obj4));
        System.out.println(obj3.compareTo(obj4));
        System.out.println();

        // Modifies the dimensions of object3 to test methods
        obj3.setWidth(3);
        obj3.setHeight(4);
        System.out.println(obj3.getArea());
        System.out.println(obj3.getPerimeter());
        System.out.println(obj4.getArea());
        System.out.println(obj4.getPerimeter());
        System.out.println(obj3.equals(obj4));
        System.out.println(obj3.compareTo(obj4));
        System.out.println();

        // Modifies the dimensions of object4 to test methods
        obj4.setWidth(7);
        obj4.setHeight(8);
        System.out.println(obj3.getArea());
        System.out.println(obj3.getPerimeter());
        System.out.println(obj4.getArea());
        System.out.println(obj4.getPerimeter());
        System.out.println(obj3.equals(obj4));
        System.out.println(obj3.compareTo(obj4));
        System.out.println();
    }
}
