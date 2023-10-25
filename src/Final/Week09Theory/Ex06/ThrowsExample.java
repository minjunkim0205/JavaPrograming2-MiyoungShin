package Final.Week09Theory.Ex06;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            findClass();
        } catch(ClassNotFoundException e){
            System.out.print("클래스가 존재하지 않습니다.\n");
        }
    }
    public static void findClass() throws ClassNotFoundException{
        Class clazz = Class.forName("Java.lang.String2");
    }
}
