package Final.Week13Theory.Ex01;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> string_box = new Box<>("Generic");
        Box<Integer> integer_box = new Box<>(2023);

        System.out.print(string_box.getData()+"\n");
        System.out.print(integer_box.getData()+"\n");
    }
}
