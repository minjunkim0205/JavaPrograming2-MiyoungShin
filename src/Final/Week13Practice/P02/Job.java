package Final.Week13Practice.P02;

class Job extends Thread{
    public void run() {
        int n = 0;
        while(true){
            System.out.print("구현"+n+"\n");
            n++;
            if(n >= 10){
                break;
            }
        }
    }
}

