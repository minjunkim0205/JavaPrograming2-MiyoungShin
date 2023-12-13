package Final.Week11Practice.P01;

public class Person {
    private String name;
    private int age;
    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(final Person person) {
        if(name.equals(person.name) && age == person.age) {
            return (true);
        }else {
            return (false);
        }
    }
    public String toString() {
        return ("Person [name=" + this.name + ", age=" + this.age + "]");
    }
}