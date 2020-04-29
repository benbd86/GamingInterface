package entities.exceptions;

public class InvalidGameConfigurationException extends GameException {
    public InvalidGameConfigurationException(String message) {
        super(message, GameExceptionType.INVALID_CONFIG);
    }
}
