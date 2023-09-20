package Week3Practice.P03;

public class CellPhoneTest {
    public static void main(String[] args) {
        System.out.print("=== 객체 생성 : 디폴트 생성자 ===\n");
        CellPhone ph_01 = new CellPhone();
        System.out.print(ph_01.toString()+"\n");
        System.out.print("=== 전원 변경후 ===\n");
        ph_01.powerToggle();
        System.out.print(ph_01.toString()+"\n");

        System.out.print("\n");

        System.out.print("=== 객체 생성 : 사용자 정의 생성자 ===\n");
        CellPhone ph_02 = new CellPhone("010-5248-2310");
        System.out.print(ph_02.toString()+"\n");
        System.out.print("=== 전원 변경후 ===\n");
        ph_02.powerToggle();
        System.out.print(ph_02.toString()+"\n");
    }
}
