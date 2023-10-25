package Final.Week09Theory.Ex01;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.print(data.toString()+"\n");
    }
}
/*

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
	at Final.Week09Theory.Ex01.NullPointerExceptionExample.main(NullPointerExceptionExample.java:6)

종료 코드 1(으)로 완료된 프로세스

 */