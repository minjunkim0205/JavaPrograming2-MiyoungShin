package Final.Week10Practice.P05;

import java.util.Scanner;

public class TestId {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("아이디를 입력하세요\n");
            final String id = input.next();
            char c = id.charAt(0);
            if(id.length()<8 || !(Character.isAlphabetic(c))){// if(id.length()<8 || !(('a'<=c&&c<='z')||('A'<=c&&c<='Z'))){
                System.out.print(id+"는 사용할 수 없는 아이디\n");
                throw (new NotUseId("사용할 수 없는 아이디"));
            }else{
                System.out.print(id+"는 사용 가능한 아이디 입니다.\n");
            }
        } catch(NotUseId e){
            e.printStackTrace();
        }
        input.close();
    }
}
