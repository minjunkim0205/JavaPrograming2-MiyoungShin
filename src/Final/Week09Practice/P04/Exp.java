package Final.Week09Practice.P04;

public class Exp implements Calculator.Control{
    /*Field*/
    /*Constructor*/
    /*Method*/
    public void run(int a, int b) {
        int result = 1;
        for(int i = 0; i < b; i++){
            result *= a;
        }
        System.out.print(a+" ** "+b+" = "+result+"\n");
    }
    /*ToString*/
}
