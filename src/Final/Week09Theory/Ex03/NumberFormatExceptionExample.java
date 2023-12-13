package Final.Week09Theory.Ex03;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data_1 = "100";
        String data_2 = "a100";

        int value_1 = Integer.parseInt(data_1);
        int value_2 = Integer.parseInt(data_2);

        System.out.print("data_1 -> value_1 : "+value_1+"\n");
        System.out.print("data_2 -> value_2 : "+value_2+"\n");
    }
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at Final.Week09Theory.Ex03.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:9)

종료 코드 1(으)로 완료된 프로세스
 */