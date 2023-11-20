package Final.Week13Practice.P03;

class Job implements Runnable {
    private static final int REPEAT = 3;

    private final String name;

    public Job(final String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            int n = 0;
            while(true){
                Thread.sleep(500);
                System.out.print(this.name+" : "+n+"\n");
                n++;
                if(n > REPEAT){
                    break;
                }
            }
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
