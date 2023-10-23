package Final.Week09Practice.P01;

public class Answer_06 {
    public static void main(String[] args) {
        //익명 구현 객체 – 본인작성
        Action action_1 = new Action() {
            static int count = 0;
            public void move() {
                count++;
                System.out.print(count+"번 이동하셨습니다.\n");
            }
        };
        //람다식으로 구현 – 본인작성
        Action action_2 = () -> {
            System.out.print("이동하셨습니다.\n");
        };
        //익명 구현 객체로 메소드 호출 – 본인 작성
        action_1.move();
        action_1.move();
        //람다식으로 메소드 호출 – 본인작성
        action_2.move();
    }
}