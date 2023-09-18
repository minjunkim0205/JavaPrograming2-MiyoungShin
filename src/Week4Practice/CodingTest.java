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
            System.out.print("name = "+name[i]+"\t"+"num = "+number[i]+"\n");
        }
        for (int p = 1; p < SIZE; p++){
            for (int j = 0; j < SIZE-p; j++){
                if (number[j] > number[j+1]){
                    int temp_i = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp_i;
                    String temp_s = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp_s;
                }
            }
        }
        System.out.print("===== 참가번호 정렬 후 =====\n");
        for (int i = 0; i < SIZE; i++){
            System.out.print("name = "+name[i]+"\t"+"num = "+number[i]+"\n");
        }
        input.close();
    }
}
