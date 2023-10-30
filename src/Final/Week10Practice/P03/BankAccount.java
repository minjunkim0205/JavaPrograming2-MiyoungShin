package Final.Week10Practice.P03;

public class BankAccount {
    /*Field*/
    private int balance;
    /*Constructor*/
    BankAccount(){
        this.balance = 0;
    }
    BankAccount(final int money){
        this.balance = money;
    }
    /*Method*/
    public int deposit(final int money){
        System.out.print("저축"+money+", ");
        this.balance += money;
        return (this.balance);
    }
    public int withdraw(final int money){
        System.out.print("출금 "+money+", ");
        try{
            if(this.balance < money){
                throw (new NegativeBalanceException("잔고가 음수입니다."));// throw (new NegativeBalanceException());
            } else {
                this.balance -= money;
            }
        } catch(NegativeBalanceException e){
            System.out.print(e.getMessage()+"\n");
        }
        return (this.balance);
    }
    /*ToString*/
}
