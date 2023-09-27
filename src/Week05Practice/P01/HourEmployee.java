package Week05Practice.P01;

public class HourEmployee extends Person{
    /*Private*/
    private final int time;
    /*Static*/
    /*Constructor*/
    HourEmployee(final String name, final String number, final int salary, final int time){
        super(name, number, salary);
        this.time = time;
    }
    /*Abstract*/
    public int computeSalary(){
        return (super.getSalary()*this.time);
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("이름 : "+super.getName()+",\t사번 : "+super.getNumber()+",\t시간당 임금 : "+super.getSalary()+",\t일한시간"+this.time+",\t금액 : "+computeSalary());
    }
}
