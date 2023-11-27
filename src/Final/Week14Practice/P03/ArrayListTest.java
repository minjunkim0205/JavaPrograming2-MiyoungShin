package Final.Week14Practice.P03;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] s = { "사과", "배", "바나나" };
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));

        //1
        list.addLast("포도");
        //2
        list.add(2, "자몽");
        //3
        System.out.print("------리스트 출력------\n");
        for(Object element : list){
            System.out.print(element+"\n");
        }
        //4
        System.out.print("---------------------\n");
        System.out.print("인덱스 3 : "+list.get(3)+"\n");
        //5
        list.set(2, "메론");
        //6
        list.addLast("배");
        //7
        System.out.print("배가 저장된 위치 : "+list.indexOf("배")+"\n");
        //8
        list.remove("바나나");
        //9
        System.out.print("------리스트 출력------\n");
        for(Object element : list){
            System.out.print(element+"\n");
        }
    }
}
