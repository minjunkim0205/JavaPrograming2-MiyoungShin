package Final.Week13Practice.P05;

public class ThreadCharNum {
    public static void main(String[] args) {
        int num = (int)(Math.random() *21 +1);
        Thread cht = new CharThread(new char[] {'◇', '□'} ,num);
        Thread nut = new NumThread(num);
        cht.start();
        nut.start();
    }
}
