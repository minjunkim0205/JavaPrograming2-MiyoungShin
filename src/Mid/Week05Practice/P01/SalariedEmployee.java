package Mid.Week05Practice.P01;

public class SalariedEmployee extends Person{
    /*Private*/
    private final int MONTH = 12;
    /*Static*/
    /*Constructor*/
    SalariedEmployee(final String name, final String number, final int salary){
        super(name, number, salary);
    }
    /*Abstract*/
    public int computeSalary(){
        return (super.getSalary()*this.MONTH);
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("이름 : "+super.getName()+",\t사번 : "+super.getNumber()+",\t급여 : "+super.getSalary()+",\t연봉 : "+computeSalary());
    }
}
