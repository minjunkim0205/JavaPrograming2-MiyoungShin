package Final.Week11Practice.P06;

import java.util.Scanner;

public class LinkTheLastWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = 'c';
        String[] str1 = {"오이", "강아지", "자바", "생강", "소나기", "우동", "언어"};

        while (c == 'c' || c == 'C') {
            System.out.print("끝말 잇기 게임을 시작합니다~~~\n");
            String str = str1[(int) (Math.random() * str1.length)];
            while (true) {
                char first, last = str.charAt(str.length() - 1);
                System.out.print(str + "의 " + last + "로 시작하는 단어 >> ");
                String temp = input.next();
                first = temp.charAt(0);
                if (first == last)
                    str = temp;
                else {
                    System.out.print("틀렸습니다\n");
                    break;
                }
            }
            System.out.print("계속하겠습니까 ? >> ");
            c = input.next().charAt(0);
        }
        System.out.print("게임을 종료 합니다\n");

        input.close();
    }
}