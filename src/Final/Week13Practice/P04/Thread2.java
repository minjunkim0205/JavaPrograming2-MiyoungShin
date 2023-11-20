package Final.Week13Practice.P04;

import java.util.Random;
public class Thread2 implements Runnable{
    private static final int REPEAT = 10;
    @Override
    public void run(){
        try {
            Random random = new Random();
            for (int i = 0; i < REPEAT; i++) {
                Thread.sleep(500);
                char c = (char)(random.nextInt('z'-'a'+1)+ 'a');
                System.out.print(c+"\n");
            }
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
