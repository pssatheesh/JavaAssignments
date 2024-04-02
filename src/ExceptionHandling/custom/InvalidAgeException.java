package ExceptionHandling.custom;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg){
        super(msg);
    }
}
