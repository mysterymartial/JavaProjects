package africa.semicolon.expection;

public class SenderNotFound extends RuntimeException {
    public SenderNotFound(String message) {
        super(message);
    }
}
