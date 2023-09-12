package Week3Practice;

public class StudentTest {
    public static void main(String[] args) {
        Student st_1 = new Student();
        Student st_2 = new Student("Daniel", 80.3, "B+");

        System.out.print(">>> 객체 생성 후 <<<\n");
        System.out.print(st_1+"\n");
        System.out.print(st_2+"\n");
        System.out.print("\n");

        st_1.setter("benny", 100, "A+");
        System.out.print(">> anonymous이름과 성적 설정 후 <<\n");
        System.out.print(st_1+"\n");
        System.out.print("\n");

        st_2.setScore(60.7, "F");
        System.out.print(">> daniel 성적 변경 후 <<\n");
        System.out.print(st_2+"\n");
    }
}
