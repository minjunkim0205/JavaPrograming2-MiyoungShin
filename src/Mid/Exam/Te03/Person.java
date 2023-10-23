package Mid.Exam.Te03;

public class Person {
    /*필드*/
    private String name;
    private String phone;
    /*생성자*/
    Person(final String name, final String phone){
        this.name = name;
        this.phone = phone;
    }
    /*메소드*/
    public String getName() {
        return this.name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /*toString*/
    public String toString(){
        return ("name="+this.name+", phone="+this.phone);
    }
}
