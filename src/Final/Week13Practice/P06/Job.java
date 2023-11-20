package Final.Week13Practice.P06;

public class Job extends Thread{
    private final Work work;

    public Job(final Work work){
        this.work = work;
    }

    public void run() {
        work.threadWork();
        System.out.print(Thread.currentThread().getName()+", 종료\n");
    }
}
