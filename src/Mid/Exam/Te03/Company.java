package Mid.Exam.Te03;

public class Company extends Person{
    /*필드*/
    private String department;
    /*생성자*/
    Company(final String name, final String phone, final String department){
        super(name, phone);
        this.department = department;
    }
    /*toString*/
    public String toString() {
        return ("[Company]"+super.toString()+", department="+this.department);
    }
}
