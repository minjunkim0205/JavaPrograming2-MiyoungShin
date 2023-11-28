package Final.Week14Practice.P06;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(new Student("name" + i, "phone" + i));
        }
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.print("[s:검색, r:삭제, *anykey*:종료] >> ");
        String trg;
        switch (sc.next()) {
            case "s":
                System.out.print("이름으로 전화번호 검색하기 >> ");
                trg = sc.next();
                System.out.print("┏━[검색된 정보]━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(trg)) {
                        System.out.print("┃"+list.get(i));
                        for(int j = 0; j < (46-list.get(i).toString().length()); j++){
                            System.out.print(" ");
                        }
                        System.out.print("┃\n");
                    }
                }
                System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
                break;
            case "r":
                System.out.print("이름으로 정보 삭제하기 >> ");
                trg = sc.next();
                System.out.print("┏━[삭제된 정보]━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(trg)) {
                        System.out.print("┃"+list.get(i));
                        for(int j = 0; j < (46-list.get(i).toString().length()); j++){
                            System.out.print(" ");
                        }
                        System.out.print("┃\n");
                        list.remove(i);
                        i--;
                    }
                }
                System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
                break;
            default:
                System.out.print("종료.\n");
                break;
        }
        System.out.print("┏━[변경된 배열]━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
        for (Student s : list) {
            System.out.print("┃"+s);
            for(int j = 0; j < (46-s.toString().length()); j++){
                System.out.print(" ");
            }
            System.out.print("┃\n");
        }
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
        sc.close();
    }
}
