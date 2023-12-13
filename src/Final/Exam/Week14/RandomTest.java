package Final.Exam.Week14;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            System.out.print(random.nextInt(10)+1 + "\n"); // 1~10
        }
    }
}
