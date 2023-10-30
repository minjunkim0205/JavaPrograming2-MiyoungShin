package Final.Week10Practice.P02;

public class NotExistIDException extends Exception {
    NotExistIDException(){
        super("Id : Not exist");
    }
    NotExistIDException(final String message) {
        super(message);
    }
}
