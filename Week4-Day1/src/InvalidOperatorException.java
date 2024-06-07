public class InvalidOperatorException extends RuntimeException{
    private String message;

    public InvalidOperatorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
