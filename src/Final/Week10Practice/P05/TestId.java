package Final.Week10Practice.P05;

import java.util.Scanner;

public class TestId {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            final String id = input.next();
            if((id.compareTo())||()){
                throw (new NotUseId("사용할 수 없는 아이디"));
            }
        } catch(NotUseId e){
            System.out.print("클래스가 존재하지 않습니다.\n");
        }
        input.close();
    }
}
