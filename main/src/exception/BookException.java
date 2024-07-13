package exception;

public class BookException extends IllegalArgumentException{
    public BookException(String message) {
        super(message);
    }
}
