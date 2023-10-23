package Mid.Exam.Te02;

public class Test {
    public static void play(Object animal){ // public void play(Object animal){
        if(animal instanceof Pigeon){
            ((Pigeon)animal).move();
            ((Pigeon)animal).sound();
        } else if(animal instanceof Dog){
            ((Dog)animal).move();
            ((Dog)animal).sound();
            ((Dog)animal).run();
        }
    }
    public static void main(String[] args) {
        System.out.print("------------------------\n");
        play(new Pigeon("Pigeon"));
        System.out.print("------------------------\n");
        play(new Dog("Dog"));
        System.out.print("------------------------\n");
    }
}
