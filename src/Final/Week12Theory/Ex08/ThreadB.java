package Final.Week12Theory.Ex08;

public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while(!stop){
            if(work){
                System.out.print("ThreadB 작업 내용\n");
            }else{
                Thread.yield();
            }
        }
        System.out.print("ThreadB 종료\n");
    }
}
