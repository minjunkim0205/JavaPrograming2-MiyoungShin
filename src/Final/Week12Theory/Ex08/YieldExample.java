package Final.Week12Theory.Ex08;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA thread_a = new ThreadA();
        ThreadB thread_b = new ThreadB();
        thread_a.start();
        thread_b.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            thread_a.work = false;
        }

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            thread_a.work = true;
        }

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            thread_a.stop = true;
            thread_b.stop = true;
        }
    }
}
