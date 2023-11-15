package Final.Week12Theory.Ex11;

public class ThreadState {
    public static void main(String[] args) {
        PrintThread pt=new PrintThread();
        pt.start();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
        }
        pt.setStop(true);
    }
}