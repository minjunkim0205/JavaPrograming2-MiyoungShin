package Final.Week14Practice.P02;

public class Student {
    private String name;
    public Student(final String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return ("Student [name="+this.name+"]");
    }
}
