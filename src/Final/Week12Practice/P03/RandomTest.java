package Final.Week12Practice.P03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static int[] makeRandomArrays(final int size) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result[i] = (random.nextInt(90)+10);
            for (int j = 0; j < i; j++){
                if(result[j] == result[i]){
                    --i;
                    break;
                }
            }
        }
        return (result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("몇 개의 정수를 생성할까요? ");
        System.out.print(Arrays.toString(makeRandomArrays(input.nextInt())) + "\n");

        input.close();
    }
}
