package Final.Week13Practice.P03;

public class TestJob {
    public static void main(String[] args) {
        Thread thread_1 = new Thread(new Job("Thread1"));
        Thread thread_2 = new Thread(new Job("Thread2"));

        thread_1.start();
        thread_2.start();
    }
}
