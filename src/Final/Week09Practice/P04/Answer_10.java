package Final.Week09Practice.P04;

public class Answer_10 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setControl(new Add());
        cal.compute((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
        cal.setControl(new Exp());
        cal.compute(5, 3);
    }
}
