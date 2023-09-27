package Week05Practice.P02;

public class Dog extends Animal {
    /*Private*/
    /*Static*/
    /*Constructor*/
    Dog(String type){
        super(type);
    }
    /*Abstract*/
    public void run(){
        System.out.println(super.getType()+" : 기어 다닙니다.");
    }
    public void sound(){
        System.out.println(super.getType()+" : 옹알이를 합니다.");
    }
    /*Public*/
    /*ToString*/
}
