package Final.Week10Practice.P04;

public class ArrayTest extends NotFoundExecption{
    public static int searchArray(final int[] array, final int trg){
        int index = 0;
        try{
            boolean flag = false;
            for(int i = 0; i < array.length; i++){
                if(array[i] == trg){
                    flag = true;
                    index = i;
                }
            }
            if(!flag){
                throw (new NotFoundExecption("배열에서 찾을 수 없습니다."));
            }
        }catch(NotFoundExecption e){
            e.printStackTrace();
        }
        return index;
    }
    public static void main(String[] args) {
        final int[] array = {1, 3, 5, 6, 9};
        System.out.print(searchArray(array, 5)+"\n");
        System.out.print(searchArray(array, 4)+"\n");
    }
}
