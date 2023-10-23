package Mid.Exam.Te03;

public class University extends Person{
    /*필드*/
    private String hakbeon;
    /*생성자*/
    University(final String name, final String phone, final String hakbeon){
        super(name, phone);
        this.hakbeon = hakbeon;
    }
    /*toString*/
    public String toString() {
        return ("[University]"+super.toString()+", hakbeon="+this.hakbeon); // return ("[University]"+super().toString()+", hakbeon="+this.hakbeon);
    }
}
