package Week4Practice;

public class CodeTest {
    /*Private*/
    private final String name;
    private final int number;
    /*Static*/
    /*Constructor*/
    CodeTest(final String name, final int number){
        this.name = name;
        this.number = number;
    }
    /*Public*/
    public String getName(){
        return (this.name);
    }
    public int getNumber(){
        return (this.number);
    }
    /*ToString*/
    public String toString() {
        return ("Name="+this.name+", Number="+this.number+"\n");
    }
}
