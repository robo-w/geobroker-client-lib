package wien.dragon.geobroker.lib;

public class OperationFailedException extends Exception {
    private static final long serialVersionUID = 1L;

    public OperationFailedException(final String message) {
        super(message);
    }
}
