package Week2Practice.P03;

import java.util.Scanner;

public class InfoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp_id;

        System.out.print("아이디를 입력 하세요 >>> ");
        temp_id = input.next();
        Info info_a = new Info(temp_id);
        info_a.pass = (int) ((Math.random() * 9000) + 1000);
        System.out.print("첫번째 객체 생성 완료\n");

        System.out.print("아이디를 입력 하세요 >>> ");
        temp_id = input.next();
        Info info_b = new Info(temp_id);
        info_b.pass = (int) ((Math.random() * 9000) + 1000);
        System.out.print("첫번째 객체 생성 완료\n\n");

        System.out.print("첫번째 객체의 아이디와 비밀번호 출력\n");
        System.out.print("아이디=" + info_a.id + ", 비밀번호=" + info_a.pass + "\n\n");

        System.out.print("두번째 객체의 아이디와 비밀번호 출력\n");
        System.out.print("아이디=" + info_b.id + ", 비밀번호=" + info_b.pass + "\n\n");

        System.out.print("두번째 객체의 비밀번호 변경후 출력\n");
        info_b.pass = (int) ((Math.random() * 9000) + 1000);
        System.out.print("아이디=" + info_b.id + ", 비밀번호=" + info_b.pass + "\n\n");
    }
}
