package Mid.Week05Practice.P02;

public class Baby extends Animal{
    /*Private*/
    /*Static*/
    /*Constructor*/
    Baby(String type){
        super(type);
    }
    /*Abstract*/
    public void run(){
        System.out.println(super.getType()+" : 네 발로 다닙니다.");
    }
    public void sound(){
        System.out.println(super.getType()+" : 멍멍 소리를 냅니다.");
    }
    /*Public*/
    /*ToString*/
}
