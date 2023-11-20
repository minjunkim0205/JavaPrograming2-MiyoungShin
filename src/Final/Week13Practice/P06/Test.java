package Final.Week13Practice.P06;

public class Test {
    public static void main(String[] args) {
        Work w = new Work();
        Job tha = new Job(w); // w 공유할 객체 보냄
        tha.setName("ThreadA");
        tha.start(); // 스레드 시작
        Job thb = new Job(w);
        thb.setName("ThreadB");
        thb.start(); // 스레드 시작
    }
}