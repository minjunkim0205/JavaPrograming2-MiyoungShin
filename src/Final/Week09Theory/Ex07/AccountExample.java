package Final.Week09Theory.Ex07;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.print("예금액 : "+account.getBalance()+"\n");

        try{
            account.withdraw(30000);
        } catch(BalanceException e){
            String message = e.getMessage();
            System.out.print(message+"\n");
            System.out.print("\n");
            e.printStackTrace();
        }
    }
}
/*

예금액 : 10000
잔고부족:20000모자람

Final.Week09Theory.Ex07.BalanceException: 잔고부족:20000모자람
	at Final.Week09Theory.Ex07.Account.withdraw(Account.java:17)
	at Final.Week09Theory.Ex07.AccountExample.main(AccountExample.java:11)

종료 코드 0(으)로 완료된 프로세스

 */