package Final.Week12Practice.P01;

public class DigitThread extends Thread {
    public void run() {
        for (int cnt = 0; cnt < 10; cnt++) {
            System.out.print(cnt);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
