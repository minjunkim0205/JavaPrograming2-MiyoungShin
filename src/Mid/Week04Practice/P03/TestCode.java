package Mid.Week04Practice.P03;

import java.util.Scanner;

public class TestCode {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        CodeTest[] code = new CodeTest[5];

        System.out.println("\n===== 객체 배열을 생성합니다 =====");
        Control.creation(code, key);  //객체 배열 초기화

        System.out.println("\n===== 참가번호 정렬 전 =====");
        Control.write(code);  //객체 배열 원소 출력

        System.out.println("\n===== 참가번호 정렬 후 =====");
        Control.sort(code);   //객체 배열을 참가번호를 기준으로 오름차순으로 정렬
        Control.write(code);  //객체 배열 원소 출력
        key.close();
    }
}
