/**
 * <h1>Book Interface</h1>
 * This class is used to create a book interface for a simple library checkout system.
 *
 * @author Craig Opie
 * @version 1.0
 * @since 2019-04-28
 *
 */
public interface BookInterface {
    boolean checkOut(int id);
    boolean checkIn(int id);
}
