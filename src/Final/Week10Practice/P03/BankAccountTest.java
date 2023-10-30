package Final.Week10Practice.P03;

public class BankAccountTest {
    public static void main(String[] args) throws NegativeBalanceException {
        BankAccount bank_account = new BankAccount();

        System.out.print("잔고 = "+bank_account.deposit(100)+"\n");
        System.out.print("잔고 = "+bank_account.deposit(500)+"\n");
        System.out.print("잔고 = "+bank_account.withdraw(800)+"\n");
    }
}