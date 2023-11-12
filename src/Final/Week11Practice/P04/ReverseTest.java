package Final.Week11Practice.P04;

import java.util.Scanner;

public class ReverseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            StringBuffer sb = new StringBuffer();
            System.out.print("문자열 입력 : ");
            sb.append(input.nextLine());
            if (sb.toString().equals("finish")) {
                System.out.print("프로그램 종료\n");
                break;
            }
            System.out.print(sb.toString() + " => (reverse) " + sb.reverse() + "\n");
        }
        input.close();
    }
}
