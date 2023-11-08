package Final.Week11Practice.P01;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("hallym", 35);
        Person p2 = new Person("hallym", 25);

        System.out.println(p1);
        System.out.println(p2);

        if (p1.equals(p2)) {
            System.out.println("동등한 객체 입니다");
        } else {
            System.out.println("서로 다른 객체 입니다.");
        }
    }
}
