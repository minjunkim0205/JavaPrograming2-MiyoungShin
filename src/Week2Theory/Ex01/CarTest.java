package Week2Theory.Ex01;

public class CarTest {
    public static void main(String args[]) {
        // 객체생성 new 연산자, 생성자 호출
        Car car_a = new Car(); // 디폴트 생성 사용
        System.out.print("color="+car_a.color+", mile="+car_a.mile+"\n");

        Car car_b = new Car("Red", 20); // 매개변수 2개인 생성자 사용
        System.out.print("color="+car_b.color+", mile="+car_b.mile+"\n");

        Car car_c = new Car("Red"); // 매개변수 1개인 생성자 사용
        System.out.print("color="+car_c.color+", mile="+car_c.mile+"\n");
    }
}
