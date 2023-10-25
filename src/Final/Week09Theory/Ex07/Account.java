package Final.Week09Theory.Ex07;

public class Account {
    /*Field*/
    private long balance;
    /*Constructor*/
    Account(){}
    /*Method*/
    public long getBalance(){
        return (this.balance);
    }
    public void deposit(int money){
        this.balance += money;
    }
    public void withdraw(int money) throws BalanceException{
        if(this.balance < money){
            throw new BalanceException("잔고부족 : "+(money-this.balance)+"모자람");
        }
        this.balance -= money;
    }
    /*ToString*/
}
