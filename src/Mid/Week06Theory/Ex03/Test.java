package Mid.Week06Theory.Ex03;

public class Test {
    public static void main(String[] args) {
        Ano ano = new Ano();
        ano.method1(new Person() {
            public void wake() {
                System.out.print("6시에 일어납니다\n");
            }
        });
        ano.field.wake();
    }
}
