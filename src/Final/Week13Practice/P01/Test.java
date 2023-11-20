package Final.Week13Practice.P01;

public class Test {
    public static void main(String[] args) {
        Thread lambda_thread = new Thread(()->{
            int n = 0;
            while(true){
                System.out.print("람다식"+n+"\n");
                n++;
                if(n >= 10){
                    break;
                }
            }
        });
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
        lambda_thread.start();
        anonymous_class_thread.start();
    }
}
