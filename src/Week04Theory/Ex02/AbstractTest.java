package Week04Theory.Ex02;

public class AbstractTest {
    /*Main*/
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
        animal = new Dog();
        animal.sound();
    }
}
