package Week05Practice.T04;

public class Test {
    public static void main(String[] args) {
        Lion lion=new Lion("Brave");
        Lion lion2=new Lion();
    }
}
/*
Test.java 코드에서 5번째 라인의 Lion객체 선언에선 인자가 1개 있는 생성자에
"Brave"가 들어가 이름이 설정된 객체로 생성되어 출력이 작동하는것이고,
6번째 라인의 Lion객체 선언에서는 인자가 없는 디폴트 생성자에 들어가 
내부적으로 처리된 "UNKNOWN"이라는 이름이 들어가 출력이 작동한다

여기서 핵심은 Lion.java 글래스 생성자에서 디폴드 생성자 부분을 보면,
부모 클래스의 디폴트 생성자 super();가 선언되어 있지 않아도 내부적으로
알아서 선언해 주기 때문에, 디폴트 생성자를 생략가능 하단것을 알아야 한다.
 */