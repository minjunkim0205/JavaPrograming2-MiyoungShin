package Final.Week12Theory.Ex12;

class PrintThread extends Thread{
    public void run() {
        while(true) {
            System.out.println("실행중");
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}