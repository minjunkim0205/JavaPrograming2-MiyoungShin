package Final.Week12Theory.Ex02;

class DigitThread extends Thread {
    public void run() { //스레드 실행 내용
        for (int cnt = 0; cnt < 10; cnt++) {
            System.out.print(cnt);
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}