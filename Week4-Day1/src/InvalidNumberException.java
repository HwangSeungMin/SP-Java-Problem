public class InvalidNumberException extends RuntimeException{
    private String message;
    public InvalidNumberException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
