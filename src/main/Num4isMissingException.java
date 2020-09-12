package main;

public class Num4isMissingException extends RuntimeException {
    public Num4isMissingException() {
        super();
    }

    public Num4isMissingException(String message) {
        super(message);
    }

    public Num4isMissingException(String message, Throwable cause) {
        super(message, cause);
    }
}
