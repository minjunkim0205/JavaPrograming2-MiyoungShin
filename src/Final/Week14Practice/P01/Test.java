package Final.Week14Practice.P01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] dim= {23, 56, 75, 32, 78, 44};
        Character[] cdim = {'자', '바', '프', '로', '그', '램'};

        System.out.print("=== 바꾸기 수행 전 ===\n");
        System.out.print(Arrays.toString(dim)+"\n");
        System.out.print(Arrays.toString(cdim)+"\n");

        System.out.print("=== 바꾸기 수행 후 ===\n");
        MyAlgorithm.swap(dim, 2, 4);
        MyAlgorithm.swap(cdim, 1, 5);
        System.out.print(Arrays.toString(dim)+"\n");
        System.out.print(Arrays.toString(cdim)+"\n");
    }
}