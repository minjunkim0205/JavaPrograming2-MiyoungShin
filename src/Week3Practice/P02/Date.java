package Week3Practice.P02;

public class Date {
    /*Private*/
    private final int year;
    private final int month;
    private final int day;
    /*Static*/
    static final String month_list[] = {"NULL", "January", "February", "March", "April", "May", "June",
            "July", "Augst", "September", "October", "November", "December"};
    /*Constructor*/
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /*Public*/
    public void print1(){
        System.out.print(this.year+"."+this.month+"."+this.day+"\n");
    }
    public void print2(){
        System.out.print(month_list[this.month]+" "+this.day+", "+this.year+"\n");
    }
}
