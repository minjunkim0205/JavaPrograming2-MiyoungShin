package Mid.Week06Practice.T01;

public interface MakeInterface {
    public double PI = 3.14;
    public double getValue1();
    public default double getValue2() {
        return 0.0;
    }
    static void hello() {
        System.out.print("Hello");
    }
}
