package Week03Practice.P05;

import java.util.Scanner;

public class InfoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("아이디를 입력 하세요 >>> ");
        Info user_1 = new Info(input.nextLine());
        System.out.print("첫번째 객체 생성 완료\n");

        System.out.print("아이디를 입력 하세요 >>> ");
        Info user_2 = new Info(input.nextLine());
        System.out.print("두번째 객체 생성 완료\n");
        System.out.print("\n");

        System.out.print("첫번째 객체의 아이디와 비밀번호 출력\n");
        System.out.print(user_1+"\n");
        System.out.print("\n");

        System.out.print("두번째 객체의 아이디와 비밀번호 출력\n");
        System.out.print(user_2+"\n");
        user_2.resetPassword();
        System.out.print("두번째 객체의 비밀번호 변경 후 출력\n");
        System.out.print(user_2+"\n");

        input.close();
    }
}
