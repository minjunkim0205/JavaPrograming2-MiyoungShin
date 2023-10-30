package Final.Week10Practice.T01;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = new int[2];
        try{
            array[2] = 5;
            System.out.print(array[2]+"\n");
        } catch(IndexOutOfBoundsException e){
            e.printStackTrace(); //System.out.print(e.getMessage()+"\n");
            System.out.print("배열의 인덱스를 확인해서 사용하세요\n");
        }
    }
}
