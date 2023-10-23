package Mid.Week02Practice.P01;

public class MemberTest {
    public static void main(String args[]) {
        // 디폴트 값으로 초기화 된 필드 값
        Member member_a = new Member();
        System.out.print("==== 디폴트 값으로 초기화 된 필드 값 ====\n");
        System.out.print("name="+member_a.name+"\nid="+member_a.id+"\npassward="+member_a.password+"\nage="+member_a.age + "\n");
        // 변경된 필드 값
        member_a.name = "java";
        member_a.id = "program";
        member_a.password = "javagram";
        member_a.age = 10;
        System.out.print("==== 변경된 필드 값 ====\n");
        System.out.print("name="+member_a.name+"\nid="+member_a.id+"\npassward="+member_a.password+"\nage="+member_a.age + "\n");
        // 오버로딩 생성자로 초기화된 필드 값
        Member member_b = new Member("hallym", "software", "bigai", 30);
        System.out.print("==== 오버로딩한 생성자로 초기화된 필드 값 ====\n");
        System.out.print("name="+member_b.name+"\nid="+member_b.id+"\npassward="+member_b.password+"\nage="+member_b.age + "\n");
    }
}
