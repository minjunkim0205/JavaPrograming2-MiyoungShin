package Final.Week12Theory.Ex09;

public class SumThread extends Thread{
    private long sum;

    public long getSum(){
        return (this.sum);
    }
    public void setSum(final long sum){
        this.sum = sum;
    }
    public void run(){
        for (int i = 1; i <= 100; i++){
            this.sum+=i;
        }
    }
}
