package Final.Week12Practice.P05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSplitSort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        StringTokenizer string_tokenizer = new StringTokenizer(input.nextLine(), " ");

        String[] result = new String[string_tokenizer.countTokens()];
        for(int i = 0; i < result.length; i++){
            result[i] = string_tokenizer.nextToken();
        }

        System.out.print("정렬 전 결과:\n");
        System.out.print(Arrays.toString(result)+"\n");
        System.out.print("정렬 후 결과:\n");
        Arrays.sort(result);
        System.out.print(Arrays.toString(result)+"\n");
    }
}
