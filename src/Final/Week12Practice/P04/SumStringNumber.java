package Final.Week12Practice.P04;

import java.util.Arrays;
import java.util.Scanner;

public class SumStringNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수 문자열을 입력하세요.\n");
        System.out.print("정수와 정수 사이는 공백으로 구분하세요\n");
        System.out.print(">>");
        String[] str_array = input.nextLine().split(" ");

        int sum_array = 0;
        int[] array = new int[str_array.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(str_array[i]);
            sum_array += array[i];
        }

        System.out.print("입력받은 정수를 출력합니다\n");
        System.out.print(Arrays.toString(array)+"\n");
        System.out.print("합 = "+sum_array+"\n");

        input.close();
    }
}
