package Final.Week13Practice.P04;

public class TestThread {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread1());
        Thread th2 = new Thread(new Thread2());
        th1.start();
        th2.start();
    }
}
