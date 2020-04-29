package entities.exceptions;

public abstract class GameException extends Exception {
    private final GameExceptionType gameExceptionType;
    public GameException(String message, GameExceptionType type) {
        super(message);
        gameExceptionType = type;
    }

    public GameExceptionType getType()
    {
        return gameExceptionType;
    }
}
