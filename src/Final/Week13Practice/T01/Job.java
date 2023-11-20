package Final.Week13Practice.T01;

public class Job extends Thread{
    private final String name;
    private int num;

    public Job(final String name){
        this.name = name;
        this.num = 0;
    }

    public synchronized int getNum() { // 임계영역->한번에 하나의 쓰레드만 사용할수 있게 !!*synchronized*!!
        this.num++;
        return (num);
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(500);
                final int temp = getNum();
                if(temp == 10){
                    break;
                }
                System.out.print(this.name+": "+temp+"\n");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
