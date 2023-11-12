package Final.Week11Practice.P03;

public class BetweenFirstAndSecond {
    public static void main(String[] args) {
        String str = "hallymbigdata";

        int first_idx = str.indexOf('a');
        int second_idx = str.indexOf('a', first_idx + 1);
        String substr = str.substring(first_idx + 1, second_idx);

        System.out.print("str=" + str + "\n");
        System.out.print("문자 a에서 a까지의 문자는 모두 " + substr.length() + "개 입니다" + "\n");
        System.out.print("substr = " + substr + "\n");
    }
}