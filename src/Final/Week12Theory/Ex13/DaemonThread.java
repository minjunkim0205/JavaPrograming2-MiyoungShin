package Final.Week12Theory.Ex13;

public class DaemonThread {
    public static void main(String[] args) {
        AutoSave as = new AutoSave();
        as.setDaemon(true); // .start() 를 호출하기 전에 Daemon쓰레드 라는것을 메소드를 호출해줘야 한다
        as.start();
        try {
            Thread.sleep(3000); // 3001
        }catch(InterruptedException e) { }
        System.out.println("메인 스레드 종료");
    }
}