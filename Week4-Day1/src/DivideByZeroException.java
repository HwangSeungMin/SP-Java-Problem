public class DivideByZeroException extends RuntimeException {
    private String message;

    public DivideByZeroException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
