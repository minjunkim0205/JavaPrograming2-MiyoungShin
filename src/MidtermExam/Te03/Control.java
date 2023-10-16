package MidtermExam.Te03;

import java.util.Scanner;

public class Control {
    /*필드*/
    private Person[] persons;
    /*생성자*/
    Control(final int num){
        this.persons = new Person[num];
    }
    /*메소드*/
    public Person search(final String name, final String phone){ // *Person 타입 사용해야함 틀림*
        for (int i = 0; i < persons.length; i++){
            if(persons[i].getName().equals(name)){ // *equals 사용 해야함 틀림*
                persons[i].setPhone(phone);
                return persons[i];
            }
        }
        return null;
    }
    public void input(){
        for (int i = 1; i <= persons.length; i++){
            Scanner n = new Scanner(System.in);
            while(true){
                System.out.print(i+"번째] 1:University 객체 생성 2:Company 객체 생성 >> ");
                int temp = n.nextInt();
                if(temp == 1){
                    System.out.print("이름, 전화번호, 학번을 입력 하세요\n");
                    this.persons[i-1] = new University(n.next(), n.next(), n.next()); // *next() 사용 해야함 틀림*
                    break;
                } else if(temp == 2){
                    System.out.print("이름, 전화번호, 근무지를 입력 하세요\n");
                    this.persons[i-1] = new Company(n.next(), n.next(), n.next()); // *next() 사용 해야함 틀림*
                    break;
                } else {
                    System.out.print("잘못 입력 입니다\n");
                }
            }
        }
    }
}
