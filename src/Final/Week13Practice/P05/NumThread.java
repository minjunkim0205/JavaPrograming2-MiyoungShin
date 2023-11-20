package Final.Week13Practice.P05;

public class NumThread extends Thread{
    private final int repeat;

    public NumThread(final int repeat){
        this.repeat = repeat;
    }
    @Override
    public void run(){
        for(int i = 0; i < repeat; i++){
                System.out.print((i+1)+" ");
        }
    }
}
