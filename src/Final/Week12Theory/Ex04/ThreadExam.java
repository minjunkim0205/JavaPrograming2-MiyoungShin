package Final.Week12Theory.Ex04;

public class ThreadExam {
    public static void main(String[] args) {
        Thread thread = new Thread( new ThreadImp() );
        thread.start(); // 스레드를 시작
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}