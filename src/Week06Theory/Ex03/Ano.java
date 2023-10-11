package Week06Theory.Ex03;

public class Ano {
    /*Private*/
    protected Person field = new Person(){
        public void wake(){
            System.out.print("8시에 일어납니다.\n");
        }
        public void study(){
            System.out.print("열심히 자바를 공부합니다.\n");
        }
    };
    /*Static*/
    /*Constructor*/
    /*Abstract*/
    /*Public*/
    public void method1(Person per){
        per.wake();
    }
    /*ToString*/
}
