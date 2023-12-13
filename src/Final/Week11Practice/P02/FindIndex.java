package Final.Week11Practice.P02;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "자바 프로그램은 재미 없습니다. 어렵습니다";

        System.out.print("문자를 입력하세요 >>>> ");
        char find = input.next().charAt(0);

        System.out.print("===== indexOf() 메소드 사용 =====\n");
        int ans1 = str.indexOf(find);
        if(ans1 == -1) {
            System.out.print("해당 문자가 없습니다\n");
        }else {
            System.out.print(find + " 인덱스는 " + ans1 + " 입니다\n");
        }
        System.out.print("===== charAt() 메소드 사용 =====\n");
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == find) {
                cnt = i;
                break;
            }
        }
        if (cnt == 0) {
            System.out.print(find + "는 해당 문자열에 없습니다\n");
        } else {
            System.out.print(find + " 인덱스는 " + cnt + " 입니다\n");
        }
        System.out.print("프로그램 종료\n");

        input.close();
    }
}
