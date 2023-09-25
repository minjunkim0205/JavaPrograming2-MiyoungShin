package Week5Practice.P05;

public class Dog extends Animal{
    /*Private*/
    /*Static*/
    static int count = 0;
    static int getCountDog(){
        return (count);
    }
    /*Constructor*/
    Dog(){
        super();
        count++;
    }
    Dog(final String name){
        super(name);
        count++;
    }
    /*Abstract*/
    void sound() {
        System.out.print("멍멍");
    }
    /*Public*/
    public String toString() {
        return (super.getName()+"강아지");
    }
    /*ToString*/
}
