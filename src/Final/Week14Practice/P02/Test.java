package Final.Week14Practice.P02;

public class Test{
    public static void main(String[] args){
        MyPair<String> fruit = new MyPair<>("사과", "포도");
        MyPair<Student> number = new MyPair<>(new Student("hallym"), new Student("software"));

        System.out.println(fruit);
        System.out.println(number);
    }
}