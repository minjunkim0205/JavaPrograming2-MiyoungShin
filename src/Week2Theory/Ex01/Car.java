package Week2Theory.Ex01;

public class Car {
    // 필드
    String color;
    int mile;
    // 생성자 오버로딩
    public Car() { // 디폴트 생성자(생략가능)
        this.color = null;
        this.mile = 0;
    }
    public Car(String color, int mile) { // 생성자 매개변수 2개
        this.color = color;
        this.mile = mile;
    }
    public Car(String color) { // 생성자 매개변수 1개
        this.color = color;
    }
}

