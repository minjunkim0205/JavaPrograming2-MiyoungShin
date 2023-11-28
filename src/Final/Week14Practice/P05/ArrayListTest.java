package Final.Week14Practice.P05;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Board> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(new Board(("제목" + i), ("글쓴이" + i)));
        }
        System.out.print("=== 게시판 정보 출력 ===\n");
        for(Board e : list){
            System.out.print(e+"\n");
        }
        System.out.print("=== 삭제하려는 제목을 입력하세요 ===\n");
        final String trg = input.next();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getTitle().equals(trg)){
                list.remove(i);
                i--;
            }
        }
        System.out.print("=== 게시판 정보 출력 ===\n");
        for(Object e : list){
            System.out.print(e+"\n");
        }
        input.close();
    }
}
