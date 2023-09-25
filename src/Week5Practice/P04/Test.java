package Week5Practice.P04;

public class Test {
    public static void main(String[] args) {
        Fruit[] fary = new Fruit [4];
        fary[0] = new Fruit();
        fary[1] = new Apple();
        fary[2] = new Grape();
        fary[3] = new Pear();
        for (final Fruit fruit : fary) {
            System.out.println(fruit.me());
        }
    }
}
