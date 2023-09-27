package Week05Theory.Ex02;

public class RamdaTest {
    public static void main(String[] args) {
        Ramda ramda = (int x, int y) -> {return x*y;};
        System.out.print(ramda.method(6, 2)+"\n");
        ramda = (int x, int y) -> {return x/y;};
        System.out.print(ramda.method(6, 2)+"\n");
    }
}
