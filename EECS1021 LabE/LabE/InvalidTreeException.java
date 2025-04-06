/**
 * Class to hold invalid tree exceptions (i.e. trees with names that start with Z).
 */
public class InvalidTreeException extends Throwable {
    public InvalidTreeException(String message) {
        super(message);
    }
}
