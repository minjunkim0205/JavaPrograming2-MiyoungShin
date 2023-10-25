package Final.Week09Practice.P04;

public class Calculator {//정적 인터페이스 멤버를 갖는 Calculator 클래스
    //1) 인터페이스 Control 타입을 갖는 필드 변수 cal 선언 – 본인 작성

    //2) 인터페이스 Control 타입을 매개변수 1개를 갖는 setControl() 메소드 구현 – 본인 작성
    //반환값 없으며 매개변수를 필드 변수 값으로 대입
    /*Field*/
    static Control cal = new Control() {
        public void run(int a, int b) {

        }
    };
    /*Constructor*/
    /*Method*/
    public void compute(int a, int b) {
        cal.run(a, b);
    }
    public void setControl(Control control){

    }
    /*Interface*/
    static interface Control {
        void run(int a, int b);
    }
    /*ToString*/
}
