package Final.Week10Practice.P05;

public class NotUseId extends Exception{
    NotUseId(){
        super("Not use id");
    }
    NotUseId(final String message){
        super(message);
    }
}
