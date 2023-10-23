package Mid.Week06Practice.P05;

public class Person{
    /*Private*/
    private String name;
    private int age;
    /*Static*/
    /*Constructor*/
    Person(){
        this.name = "anonymous";
        this.age = 0;
    }
    Person(final String name, final int age){
        this.name = name;
        this.age = age;
    }
    /*Abstract*/
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("Person [name="+this.name+", age="+this.age+"]");
    }
}