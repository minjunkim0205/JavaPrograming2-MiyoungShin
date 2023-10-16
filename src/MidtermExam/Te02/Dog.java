package MidtermExam.Te02;

public class Dog implements Animal{
    /*필드*/
    /*생성자*/
    Dog(final String name){
        System.out.print(name+"클래스 인스턴스 생성 완료\n");
    }
    /*메소드*/
    public void run(){
        System.out.print("네 발로 달리기도 합니다\n");
    }
    /*구현*/
    public void move(){
        System.out.print("네 발로 걸어서 이동합니다\n");
    }
    public void sound(){
        System.out.print("멍멍 소리를 냅니다\n");
    }
}
