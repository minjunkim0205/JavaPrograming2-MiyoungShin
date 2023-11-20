package Final.Week13Practice.P06;

public class Work{
    private int num;

    public Work(){
        this.num = 0;
    }

    public synchronized int getNum(){
        this.num++;
        return (this.num);
    }

    public void threadWork(){
        try{
            while(true) {
                int num = getNum();
                System.out.print(Thread.currentThread().getName()+", "+num+"\n");
                if(num >= 10){
                    System.out.print(Thread.currentThread().getName()+", 반복문 탈출\n");
                    break;
                }else{
                    Thread.sleep(500);
                }
            }
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
