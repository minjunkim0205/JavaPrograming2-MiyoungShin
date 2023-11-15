package Final.Week12Theory.Ex05;

public class ThreadOneCode {
    public static void main(String args[]) {
        Thread thread = new Thread(() -> {
            for (int cnt = 0; cnt < 10; cnt++) {
                System.out.print(cnt); //람다식 사용
            }
        });
        thread.start(); // 스레드를 시작
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}

