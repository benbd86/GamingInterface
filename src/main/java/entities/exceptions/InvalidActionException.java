package entities.exceptions;

public class InvalidActionException extends GameException {
    public InvalidActionException(String message) {
        super(message, GameExceptionType.INVALID_ACTION);
    }
}
