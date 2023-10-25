package Final.Week09Theory.Ex05;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data_1 = null;
        String data_2 = null;
        // 예외 처리01
        try{
            data_1 = args[0];
            data_2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("실행 매게값이 없거나 부족합니다.\n");
            return;
        }
        // 예외 처리02
        try{
            int value_1 = Integer.parseInt(data_1);
            int value_2 = Integer.parseInt(data_2);
            int result = value_1 + value_2;
            System.out.print(data_1+"+"+data_2+"="+result);
        } catch (NumberFormatException e){
            System.out.print("숫자를 변환할 수 없습니다.\n");
        } finally {
            System.out.print("다시 실행하세요.\n");
        }
    }
}
