package Final.Week13Practice.P02;

public class Test {
    public static void main(String[] args) {
        Thread extends_thread = new Job();
        Thread anonymous_class_thread = new Thread(new Runnable(){
            @Override
            public void run() {
                int n = 0;
                while(true){
                    System.out.print("익명구현객체"+n+"\n");
                    n++;
                    if(n >= 10){
                        break;
                    }
                }
            }
        });
        extends_thread.start();
        anonymous_class_thread.start();
    }
}
