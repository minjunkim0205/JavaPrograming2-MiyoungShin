package Final.Week10Practice.P04;

public class NotFoundExecption extends Exception{
    NotFoundExecption(){
        super("Not found.");
    }
    NotFoundExecption(final String message){
        super(message);
    }
}