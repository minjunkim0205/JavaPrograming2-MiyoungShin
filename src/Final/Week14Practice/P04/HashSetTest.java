package Final.Week14Practice.P04;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<>();
        Random random = new Random();
        while(data.size() < 10){
            final int rand = (random.nextInt(90)+10);
            data.add(rand);
        }
        System.out.print("두자리수 난수 10개를 출력합니다.\n");
        System.out.print(data);
    }
}