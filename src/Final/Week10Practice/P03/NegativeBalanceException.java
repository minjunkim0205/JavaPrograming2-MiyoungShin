package Final.Week10Practice.P03;

public class NegativeBalanceException extends Exception{
    NegativeBalanceException(){
        super("Negative balance.");
    }
    NegativeBalanceException(final String message){
        super(message);
    }
}
