package Final.Week13Practice.P05;

public class CharThread extends Thread{
    private final char[] list;
    private final int repeat;

    public CharThread(final char[] list, final int repeat){
        this.list = list;
        this.repeat = repeat;
    }
    @Override
    public void run(){
        for(int i = 0; i < repeat; i++){
            System.out.print(list[(i%list.length)]+" ");
        }
    }
}
