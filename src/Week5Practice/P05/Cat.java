package Week5Practice.P05;

public class Cat extends Animal{
    /*Private*/
    /*Static*/
    /*Constructor*/
    Cat(){
        super();
    }
    Cat(final String name){
        super(name);
    }
    /*Abstract*/
    void sound() {
        System.out.print("야~옹");
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return (super.getName()+"고양이");
    }
}
