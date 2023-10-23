package Final.Week09Practice.P02;

import java.util.Scanner;

public class Answer_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Media 클래스를 상속받는 익명 자식 객체 구현 – 본인작성
        Media media = new Media() {
            void play(String instru) {
                System.out.print(instru + "를 재생합니다.\n");
            }
            void stop(String instru) {
                System.out.print(instru + "를 중지합니다.\n");
            }
        };
        //메뉴를 선택하고 실행 – 본인 작성S
        System.out.print("기기를 선택하세요\n1:MP3 2:CDPlay 3:WindowMediaPlay>>");
        String type = "";
        switch (input.nextInt()) {
            case 1:
                type = "MP3";
                break;
            case 2:
                type = "CDPlay";
                break;
            case 3:
                type = "WindowMediaPlay";
                break;
        }
        media.play(type);
        media.stop(type);

        input.close();
    }
}
