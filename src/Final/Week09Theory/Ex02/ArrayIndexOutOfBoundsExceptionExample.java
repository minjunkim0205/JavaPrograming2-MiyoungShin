package Final.Week09Theory.Ex02;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String data_1 = args[0];
        String data_2 = args[1];

        System.out.print("args[0] : "+data_1+"\n");
        System.out.print("args[1] : "+data_2+"\n");
    }
}
/*

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at Final.Week09Theory.Ex02.ArrayIndextOutOfBoundsExceptionExample.main(ArrayIndextOutOfBoundsExceptionExample.java:5)

종료 코드 1(으)로 완료된 프로세스

 */