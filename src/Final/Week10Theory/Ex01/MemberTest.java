package Final.Week10Theory.Ex01;

public class MemberTest {
    public static void main(String[] args) {
        Member obj_1 = new Member("blue");
        Member obj_2 = new Member("blue");
        Member obj_3 = new Member("red");

        if(obj_1.equals(obj_2)){
            System.out.print("obj_1 와 obj_2 는 동등합니다\n");
        }else {
            System.out.print("obj_1 와 obj_2 는 동등하지 않습니다\n");
        }

        if(obj_1.equals(obj_3)){
            System.out.print("obj_1 와 obj_3 는 동등합니다\n");
        }else {
            System.out.print("obj_1 와 obj_3 는 동등하지 않습니다\n");
        }
    }
}
