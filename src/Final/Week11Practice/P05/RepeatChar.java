package Final.Week11Practice.P05;

import java.util.Scanner;

public class RepeatChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str = input.nextLine();
        System.out.print("문자 입력 : ");
        char c = input.next().charAt(0);

        int cnt = 1;
        int flag = str.indexOf(c);
        while (true) {
            if (str.indexOf(c, flag + 1) != -1) {
                cnt++;
                flag = str.indexOf(c, flag + 1);
            } else{
                break;
            }

        }

        System.out.print(str + " 문자열에서 " + c + "문자는 " + cnt + " 번 반복됩니다.\n");
        System.out.print("프로그램 종료\n");
        input.close();
    }
}