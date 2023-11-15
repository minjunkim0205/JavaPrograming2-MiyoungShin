package Final.Week12Theory.Ex09;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sum_thread = new SumThread();
        sum_thread.start();

        try{
            sum_thread.join();
        }catch (InterruptedException e){
        }
        System.out.print("1~100 합:"+sum_thread.getSum()+"\n");
    }
}
