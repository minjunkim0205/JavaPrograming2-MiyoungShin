package Final.Week12Theory.Ex13;

class AutoSave extends Thread{
    public void save() {
        System.out.println("작업 내용 저장");
    }
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                break;
            }
            save();
        }
    }
}