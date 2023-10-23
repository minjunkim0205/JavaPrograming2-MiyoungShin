package Mid.Week06Theory.Ex01;

public class Test {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClick(new Message());
        btn.touch();
        btn.setOnClick(new Call());
        btn.touch();
    }
}
