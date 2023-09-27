package Week05Practice.P01;

abstract class Person {
    /*Private*/
    private String name;
    private String number;
    private int salary;
    /*Static*/
    /*Constructor*/
    Person(final String name, final String number, final int salary){
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
    /*Abstract*/
    abstract public int computeSalary();
    /*Public*/
    public String getName(){
        return (this.name);
    }
    public String getNumber(){
        return (this.number);
    }
    public int getSalary(){
        return (this.salary);
    }
    /*ToString*/
}