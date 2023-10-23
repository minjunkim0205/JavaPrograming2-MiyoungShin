package Mid.Week06Practice.P05;

public class Staff extends Person implements IJob, IPin{
    /*Private*/
    private double pay;
    private int num;
    /*Static*/
    static final double HOURLY = 8000.0;
    static int count = 0;
    /*Constructor*/
    Staff(){
        this.pay = 0;
        this.num = getPin();
        count++;
    }
    Staff(final int time){
        this.pay = getPay(time);
        this.num = getPin();
        count++;
    }
    /*Abstract*/
    public double getPay(final int time) {
        return HOURLY*time;
    }
    public int getPin() {
        return ((count*100)+(int)(Math.random()*90)+10);
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("Staff [pay="+this.pay+", num="+this.num+"]");
    }
}