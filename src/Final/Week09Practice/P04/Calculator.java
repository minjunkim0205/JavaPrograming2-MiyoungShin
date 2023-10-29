package Final.Week09Practice.P04;

public class Calculator {
    /*Field*/
    static Control cal;
    /*Constructor*/
    /*Method*/
    public void compute(int a, int b) {
        cal.run(a, b);
    }
    public void setControl(Control control){
        cal = control;
    }
    /*Interface*/
    static interface Control {
        void run(int a, int b);
    }
    /*ToString*/
}
