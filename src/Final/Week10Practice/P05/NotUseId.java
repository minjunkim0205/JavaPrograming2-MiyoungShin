package Final.Week10Practice.P05;

public class NotUseId extends Exception{
    NotUseId(){
        super("사용할 수 없는 아이디");
    }
    NotUseId(final String message){
        super(message);
    }
}
