package Mid.Week06Practice.P05;

public class Student extends Person implements IJob, IPin{
    /*Private*/
    private int enter;
    private double pay;
    private int num;
    /*Static*/
    static final double HOURLY = 7000.0;
    /*Constructor*/
    Student(){
        this.enter = 0;
        this.pay = 0;
        this.num = getPin();
    }
    Student(final int enter, final int time){
        this.enter = enter;
        this.pay = getPay(time);
        this.num = getPin();
    }
    /*Abstract*/
    public double getPay(final int time) {
        return HOURLY*time;
    }
    public int getPin() {
        return ((this.enter*100)+(int)(Math.random()*90)+10);
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("Student [enter="+this.enter+", pay="+this.pay+", num="+this.num+"]");
    }
}