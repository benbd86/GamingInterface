package entities.exceptions;

public class WrongPlayerException extends GameException {
    public WrongPlayerException(String message) {
        super(message, GameExceptionType.WRONG_PLAYER);
    }
}
