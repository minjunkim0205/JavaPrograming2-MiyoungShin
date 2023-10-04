package Week06Practice.P04;

public class Person implements IComparable{
    /*Private*/
    private String name;
    private double height;
    /*Static*/
    /*Constructor*/
    Person(final String name, final double height){
        this.name = name;
        this.height = height;
    }
    /*Abstract*/
    public int compareTo(Person other) {
        if (this.height > other.height) {
            return 1;
        } else if(this.height < other.height) {
            return -1;
        } else {
            return 0;
        }
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("Person [name="+this.name+", height="+this.height+"]");
    }
}
