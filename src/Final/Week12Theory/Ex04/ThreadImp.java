package Final.Week12Theory.Ex04;

class ThreadImp implements Runnable {
    public void run() {
        for
        (int cnt = 0; cnt < 10; cnt++){
            System.out.print(cnt);
        }
    }
}