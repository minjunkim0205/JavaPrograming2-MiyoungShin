package Final.Week12Theory.Ex02;

public class MultiThread {
    public static void main(String[] args) { //메인 스레드
        Thread thread = new DigitThread();
        thread.start(); //DigitThread 스레드
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
