package Final.Week10Practice.P02;

public class WrongPasswordException extends Exception{
    WrongPasswordException(){
        super("Pw : Not exist");
    }
    WrongPasswordException(final String message) {
        super(message);
    }
}