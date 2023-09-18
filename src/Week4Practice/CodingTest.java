package Week4Practice;

import java.util.Scanner;

public class CodingTest {
    public static void main(String[] args) {
        // Define
        final int SIZE = 5;
        // Input
        Scanner input = new Scanner(System.in);
        String[] name = new String[SIZE];
        int[] number = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            System.out.print("이름을 입력 하세요 >>> ");
            name[i] = input.next();
            number[i] = (int)((Math.random()*90)+10);
        }
        // Solve,Output
        System.out.print("===== 참가번호 정렬 전 =====\n");
        for (int i = 0; i < SIZE; i++){
            System.out.print("name = "+); // TODO: 2023-09-18  
        }

        System.out.print("===== 참가번호 정렬 후 =====\n");
        input.close();
    }
}
